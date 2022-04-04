package dev.ky3he4ik.pract36

open class SingletonHolder<out T: Any>(creator: () -> T) {
    private var creator: (() -> T)? = creator
    @Volatile private var instance: T? = null

    fun getInstance(): T {
        return instance ?: synchronized(this) {
            val checkInstanceAgain = instance
            checkInstanceAgain ?: creator.let {
                val created = creator!!()
                instance = created
                creator = null
                created
            }
        }
    }
}

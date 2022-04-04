package dev.ky3he4ik.pract36

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val colorData: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun setColor(color: Int) {
        colorData.value = color
    }
    companion object : SingletonHolder<MainViewModel>(::MainViewModel)
}

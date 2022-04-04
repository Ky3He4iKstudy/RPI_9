package dev.ky3he4ik.pract36

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.ky3he4ik.pract36.databinding.ColorListItemBinding

class ColorListItemElementAdapter(private val data: List<Pair<String, Int>>) :
    RecyclerView.Adapter<ColorListItemElementAdapter.ColorListHolder>() {

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ColorListHolder {
        val binding: ColorListItemBinding =
            ColorListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ColorListHolder(binding)
    }

    override fun onBindViewHolder(holder: ColorListHolder, position: Int) {
        holder.binding.text.text = data[position].first
        holder.binding.text.setBackgroundColor(data[position].second)
        holder.binding.text.setOnClickListener {
            MainViewModel.getInstance().colorData.value = data[position].second
        }
    }

    class ColorListHolder(val binding: ColorListItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}

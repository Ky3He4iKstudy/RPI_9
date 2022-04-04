package dev.ky3he4ik.pract36

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ky3he4ik.pract36.databinding.FragmentColorListBinding


class ColorListFragment : Fragment(R.layout.fragment_color_list) {
    private lateinit var binding: FragmentColorListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentColorListBinding.inflate(layoutInflater, container, false)

        binding.list.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(false)
            val array = resources.getStringArray(R.array.color_names).zip(resources.getIntArray(R.array.colors).toTypedArray())
            adapter = ColorListItemElementAdapter(array)
        }
        return binding.root
    }
}

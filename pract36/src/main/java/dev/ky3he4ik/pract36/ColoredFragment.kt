package dev.ky3he4ik.pract36

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.ky3he4ik.pract36.databinding.FragmentColoredBinding

class ColoredFragment : Fragment(R.layout.fragment_colored) {
    private lateinit var binding: FragmentColoredBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentColoredBinding.inflate(layoutInflater, container, false)

        MainViewModel.getInstance().colorData.apply {
            binding.color.setBackgroundColor(value ?: 0xFFFFFF)
            observe(viewLifecycleOwner) {
                binding.color.setBackgroundColor(it)
            }
        }

        return binding.root
    }
}

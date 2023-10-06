package com.example.horoscopegame.ui.view.luck

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.horoscopegame.R
import com.example.horoscopegame.databinding.FragmentHoroscopeBinding
import com.example.horoscopegame.databinding.FragmentLuckBinding
import com.example.horoscopegame.ui.view.horoscope.HoroscopeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LuckFragment : Fragment() {

   private var _binding: FragmentLuckBinding? = null
   private val binding by lazy { _binding!! }
   private val viewModel by viewModels<LuckViewModel>()

   override fun onCreateView(
       inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View {
      _binding = FragmentLuckBinding.inflate(inflater, container, false)
      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

   }

   override fun onDestroyView() {
      super.onDestroyView()
      _binding = null
   }

}
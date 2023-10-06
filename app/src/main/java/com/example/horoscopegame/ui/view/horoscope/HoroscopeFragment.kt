package com.example.horoscopegame.ui.view.horoscope

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.horoscopegame.R
import com.example.horoscopegame.databinding.FragmentHoroscopeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HoroscopeFragment : Fragment() {

   private var _binding: FragmentHoroscopeBinding? = null
   private val binding by lazy { _binding!! }
   private val viewModel by viewModels<HoroscopeViewModel>()

   override fun onCreateView(
       inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View {
      _binding = FragmentHoroscopeBinding.inflate(inflater, container, false)
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
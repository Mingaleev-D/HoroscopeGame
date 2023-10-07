package com.example.horoscopegame.ui.view.horoscope

import androidx.lifecycle.ViewModel
import com.example.horoscopegame.data.providers.HoroscopeProvider
import com.example.horoscopegame.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(
    private val horoscopeProvider: HoroscopeProvider
) : ViewModel() {

   private var _horospoceState = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
   val horoscopeState: StateFlow<List<HoroscopeInfo>> = _horospoceState

   init {
      _horospoceState.value = horoscopeProvider.getHoroscopes()
   }

}
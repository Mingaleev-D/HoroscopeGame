package com.example.horoscopegame.data.providers

import com.example.horoscopegame.domain.model.HoroscopeInfo
import javax.inject.Inject

/**
 * @author : Mingaleev D
 * @data : 07.10.2023
 */


class HoroscopeProvider @Inject constructor(){
   fun getHoroscopes():List<HoroscopeInfo> {
      return listOf(
          HoroscopeInfo.Aries,
          HoroscopeInfo.Taurus,
          HoroscopeInfo.Gemini,
          HoroscopeInfo.Cancer,
          HoroscopeInfo.Leo,
          HoroscopeInfo.Virgo,
          HoroscopeInfo.Libra,
          HoroscopeInfo.Scorpio,
          HoroscopeInfo.Sagittarius,
          HoroscopeInfo.Capricorn,
          HoroscopeInfo.Aquarius,
          HoroscopeInfo.Pisces,
      )
   }
}
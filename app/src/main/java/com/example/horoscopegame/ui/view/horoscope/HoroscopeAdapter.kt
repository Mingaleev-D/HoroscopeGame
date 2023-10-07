package com.example.horoscopegame.ui.view.horoscope

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.horoscopegame.databinding.ItemHoroscopeBinding
import com.example.horoscopegame.domain.model.HoroscopeInfo

/**
 * @author : Mingaleev D
 * @data : 07.10.2023
 */


class HoroscopeAdapter(
    private var horoscopeList: List<HoroscopeInfo> = emptyList(),
    private val itemSelected: (HoroscopeInfo) -> Unit
) : Adapter<HoroscopeAdapter.HoroscopeViewHolder>() {
   class HoroscopeViewHolder(val binding: ItemHoroscopeBinding) : ViewHolder(binding.root) {
      fun bind(horoscope: HoroscopeInfo, itemSelected: (HoroscopeInfo) -> Unit) {
         val context = binding.tvTitle.context

         binding.ivHoroscope.setImageResource(horoscope.img)
         binding.tvTitle.text = context.getString(horoscope.name)

         binding.parent.setOnClickListener {
            //itemSelected(horoscope)
            startRotationAnimation(
                view = binding.ivHoroscope,
                newLamda = {
                   itemSelected(horoscope)
                }
            )
         }
      }

      //animations
      private fun startRotationAnimation(view: View, newLamda: () -> Unit) {
         view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withStartAction{ newLamda()}
            start()
         }
      }
   }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
      return HoroscopeViewHolder(
          ItemHoroscopeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
      )
   }

   override fun getItemCount(): Int {
      return horoscopeList.size
   }

   override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
      holder.bind(horoscopeList[position], itemSelected)
   }

   fun updateList(list: List<HoroscopeInfo>) {
      horoscopeList = list
      notifyDataSetChanged()
   }


}
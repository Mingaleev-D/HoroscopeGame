package com.example.horoscopegame.ui.view.detail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.navArgs
import com.example.horoscopegame.databinding.ActivityDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

   private val binding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
   private val viewModel by viewModels<DetaiViewModel>()
   private val args:DetailActivityArgs by navArgs()

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(binding.root)

      args.type
   }
}
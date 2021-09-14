package com.idea3d.examplemvvm.ui.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.idea3d.examplemvvm.ui.ViewModel.QuoteViewModel
import com.idea3d.examplemvvm.databinding.ActivityMainBinding
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        binding.cita.text="Cada vez que toques la pantalla \naparecerá una nueva cita"

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.cita.text = currentQuote.quote
            binding.autor.text = currentQuote.author
        })

        quoteViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })

        binding.pantalla.setOnClickListener { quoteViewModel.randomQuote() }




    }






}
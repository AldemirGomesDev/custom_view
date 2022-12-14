package br.com.aldemir.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import br.com.aldemir.customview.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            progressButton.setOnClickListener {
                progressButton.setLoading()
                lifecycleScope.launch {
                    delay(3_000)
                    progressButton.setNormal()
                }
            }
        }
    }
}
package br.edu.utfpr.usandopreference

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var image: ImageView
    var ligado = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        image = findViewById(R.id.image)
    }

    fun btOnOffOnClick(view: View) {
        when (ligado) {
            true -> {
                image.setImageResource( android.R.drawable.star_big_off)
                ligado = false
            }
            false -> {
                image.setImageResource( android.R.drawable.star_big_on)
                ligado = true
            }
        }

    }
}
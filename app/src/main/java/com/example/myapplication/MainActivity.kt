package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.yarolegovich.slidingrootnav.SlidingRootNav
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    // Lets implement Sliding Now Navigation
    private var slidingRootNav: SlidingRootNav? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//      Now we add toolbar in this nav layout

        slidingRootNav = SlidingRootNavBuilder(this)
            .withToolbarMenuToggle(binding.toolbar)
            .withMenuOpened(false)
            .withContentClickableWhenMenuOpened(true)
            .withSavedState(savedInstanceState)
            .withMenuLayout(R.layout.layout_drawer)
            .inject()
    }
}


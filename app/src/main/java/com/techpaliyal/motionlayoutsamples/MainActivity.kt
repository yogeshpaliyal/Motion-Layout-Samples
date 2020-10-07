package com.techpaliyal.motionlayoutsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techpaliyal.motionlayoutsamples.databinding.ActivityMainBinding

/**
 * @author Yogesh Choudhary Paliyal
 * @since 01 Oct 2020
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnScaleAnimation.setOnClickListener {
            ScaleAnimationActivity.start(this)
        }
    }
}
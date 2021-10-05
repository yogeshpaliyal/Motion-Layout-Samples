package com.techpaliyal.motionlayoutsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techpaliyal.motionlayoutsamples.databinding.ActivityMainBinding

/**
 * @author Yogesh Choudhary Paliyal
 * @since 08 Oct 2020
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

        binding.btnPositionAnimation.setOnClickListener {
            PositionAnimationActivity.start(this)
        }

        binding.btnPathAnimation.setOnClickListener {
            PathAnimationActivity.start(this)
        }

        binding.btnPathRotateAnimation.setOnClickListener {
            PathRotateAnimationActivity.start(this)
        }

        binding.btnCustomAnimation.setOnClickListener {
            CustomAnimationActivity.start(this)
        }

        binding.btnFabAnimation.setOnClickListener {
            NestedScrollAnimation.start(this)
        }
        binding.btnSolarSystem.setOnClickListener {
            SolarSystemActivity.start(this)
        }
        binding.btnSwipeWithColorChange.setOnClickListener {
            SwipeToChangeColorActivity.start(this)
        }
    }
}
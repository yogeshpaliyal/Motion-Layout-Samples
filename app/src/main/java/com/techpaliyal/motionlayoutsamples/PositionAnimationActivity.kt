package com.techpaliyal.motionlayoutsamples

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techpaliyal.motionlayoutsamples.databinding.ActivityPositionAnimationBinding


/**
 * @author Yogesh Choudhary Paliyal
 * @since 08 Oct 2020
 */
class PositionAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPositionAnimationBinding


    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, PositionAnimationActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPositionAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAnimateToEnd.setOnClickListener {
            binding.motionLayout.transitionToEnd()
        }

        binding.btnAnimateToStart.setOnClickListener {
            binding.motionLayout.transitionToStart()
        }

    }
}
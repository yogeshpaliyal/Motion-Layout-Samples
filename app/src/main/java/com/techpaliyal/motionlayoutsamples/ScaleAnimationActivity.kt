package com.techpaliyal.motionlayoutsamples

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techpaliyal.motionlayoutsamples.databinding.ActivityScaleAnimationBinding

/**
 * @author Yogesh Choudhary Paliyal
 * @since 01 Oct 2020
 */
class ScaleAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScaleAnimationBinding

    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, ScaleAnimationActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScaleAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAnimateToEnd.setOnClickListener {
            binding.motionLayout.transitionToEnd()
        }

        binding.btnAnimateToStart.setOnClickListener {
            binding.motionLayout.transitionToStart()
        }

    }
}
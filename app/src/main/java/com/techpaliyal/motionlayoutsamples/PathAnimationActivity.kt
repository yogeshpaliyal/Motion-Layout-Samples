package com.techpaliyal.motionlayoutsamples

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techpaliyal.motionlayoutsamples.databinding.ActivityPathAnimationBinding

class PathAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPathAnimationBinding

    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, PathAnimationActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPathAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAnimateToEnd.setOnClickListener {
            binding.motionLayout.transitionToEnd()
        }

        binding.btnAnimateToStart.setOnClickListener {
            binding.motionLayout.transitionToStart()
        }

    }
}
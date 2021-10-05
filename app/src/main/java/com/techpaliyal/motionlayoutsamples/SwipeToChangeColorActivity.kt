package com.techpaliyal.motionlayoutsamples

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techpaliyal.motionlayoutsamples.databinding.ActivityPathAnimationBinding
import com.techpaliyal.motionlayoutsamples.databinding.ActivitySwipeToChangeColorAnimationBinding

class SwipeToChangeColorActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySwipeToChangeColorAnimationBinding

    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, SwipeToChangeColorActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipeToChangeColorAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
package com.techpaliyal.motionlayoutsamples

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.techpaliyal.motionlayoutsamples.databinding.ActivityCustomAnimationBinding

class CustomAnimationActivity : AppCompatActivity() {

    lateinit var binding: ActivityCustomAnimationBinding

    private val transitionsPair by lazy {
        ArrayList<Pair<Int,Int>>().apply {
            add(Pair(R.id.startTransition, R.id.transition45to90))
            add(Pair(R.id.transition90to135, R.id.transition135to180))
            add(Pair(R.id.transition180to225, R.id.transition225to270))
            add(Pair(R.id.transition270to315, R.id.transition315to360))
        }
    }

    private var defaultPosition = 0


    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, CustomAnimationActivity::class.java)

            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.motionLayout.setTransitionListener(object : MotionLayout.TransitionListener{
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                p0?.transitionToEnd()
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
               /* defaultPosition++
                if (defaultPosition !in 0 until transitionsPair.size){
                    defaultPosition = 0
                }
                val pair = transitionsPair[defaultPosition]
                if (p1 == pair.first) {
                    p0?.setTransition(pair.second)
                    p0?.transitionToEnd()
                }*/
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

            }

        })

    }
}
package com.techpaliyal.motionlayoutsamples

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.techpaliyal.motionlayoutsamples.databinding.ActivitySolarSystemBinding


/*
* @author Yogesh Paliyal
* techpaliyal@gmail.com
* https://techpaliyal.com
* created on 20-02-2021 14:20
*/
class SolarSystemActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySolarSystemBinding

    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, SolarSystemActivity::class.java)

            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySolarSystemBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
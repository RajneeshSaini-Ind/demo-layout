package com.example.rajdevhub.controller

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.rajdevhub.R
import kotlinx.android.synthetic.main.activity_layout_1.*

class LayoutActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_1)
        val bitmap = BitmapFactory.decodeResource(resources,
            R.drawable.devslopesprofilelogo
        )
        val roundedBitMap= RoundedBitmapDrawableFactory.create(resources,bitmap)
        //roundedBitMap.isCircular=true
        roundedBitMap.cornerRadius=15f
        logo.setImageDrawable(roundedBitMap)

    }
}

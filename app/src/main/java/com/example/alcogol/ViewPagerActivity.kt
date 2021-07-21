package com.example.alcogol

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val pages = arrayListOf<Pages>(
            Pages("Просто нажмите на кнопку"),
            Pages("Алкоголь вреден"),
            Pages("Последний текст")
        )
        viewPager.adapter = PagesAdapter(pages, supportFragmentManager)
    }
}
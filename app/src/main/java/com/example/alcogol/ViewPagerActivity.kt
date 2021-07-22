package com.example.alcogol

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        supportActionBar?.hide()

        val pages = arrayListOf<Pages>(
            Pages("Находясь в здравом уме и твёрдой памяти, мы решили выпить и всё забыть."),
            Pages("Жизнь прекрасна и удивительна, если выпить предварительно !"),
            Pages("Нажимая НАЧНЕМ вы потдверждаете, что являетесь совершеннолетним !!!")
        )
        viewPager.adapter = PagesAdapter(pages, supportFragmentManager)
    }
}
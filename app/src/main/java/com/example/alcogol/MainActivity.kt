package com.example.alcogol

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.security.SecureRandom
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myArray = arrayOf(1, 2, 3, 4, 5, "зайчик", "вышел", "погулять")
        tvTost.text = myArray[1].toString()
        val toastList  = ArrayList<Tost>()
        toastList.add(Tost("Тост 1"))
        toastList.add(Tost("Тост 2"))
        toastList.add(Tost("Тост 3"))
        toastList.add(Tost("Тост 4"))
        toastList.add(Tost("Тост 5"))
        toastList.add(Tost("Тост 6"))
        toastList.add(Tost("Тост 7"))
        toastList.add(Tost("Тост 8"))
        toastList.add(Tost("Tост 9"))
        toastList.add(Tost("Тост 10"))
        toastList.add(Tost("Тост 11"))




        btNewTost.setOnClickListener {
//          Рабоатает, позже включим звук
//            goMusic()
 //  Работает не по кругу
//            val randomElement:Tost = toastList.random()
//            val name = randomElement.descTost
//            tvTost.text = name


        }
    }

    private fun goMusic(){
        val mPlayer= MediaPlayer.create(this, R.raw.zvyakane_bokalov);
        mPlayer.start()
    }
}
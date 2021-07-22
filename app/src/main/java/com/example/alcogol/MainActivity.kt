package com.example.alcogol

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastList  = ArrayList<Tost>()
        btNewTost.setOnClickListener {
//          Рабоатает, позже включим звук
//            goMusic()
            if(toastList.isEmpty()){
                toastList.add(Tost(getString(R.string.t1)))
                toastList.add(Tost(getString(R.string.t2)))
                toastList.add(Tost(getString(R.string.t3)))
                toastList.add(Tost(getString(R.string.t4)))
                toastList.add(Tost(getString(R.string.t5)))
                toastList.add(Tost(getString(R.string.t6)))
                toastList.add(Tost(getString(R.string.t7)))
                toastList.add(Tost(getString(R.string.t8)))
                toastList.add(Tost(getString(R.string.t9)))
                toastList.add(Tost(getString(R.string.t10)))
                toastList.add(Tost(getString(R.string.t11)))
                toastList.add(Tost(getString(R.string.t12)))
                toastList.add(Tost(getString(R.string.t13)))
                toastList.add(Tost(getString(R.string.t14)))
                toastList.add(Tost(getString(R.string.t15)))
                toastList.add(Tost(getString(R.string.t16)))
                toastList.add(Tost(getString(R.string.t17)))
                toastList.add(Tost(getString(R.string.t18)))
                toastList.add(Tost(getString(R.string.t19)))
                toastList.add(Tost(getString(R.string.t20)))
                toastList.add(Tost(getString(R.string.t21)))
                toastList.add(Tost(getString(R.string.t22)))
                toastList.add(Tost(getString(R.string.t23)))
                toastList.add(Tost(getString(R.string.t24)))
                toastList.add(Tost(getString(R.string.t25)))
                toastList.add(Tost(getString(R.string.t26)))
                toastList.add(Tost(getString(R.string.t27)))
                toastList.add(Tost(getString(R.string.t28)))
                toastList.add(Tost(getString(R.string.t29)))
                toastList.add(Tost(getString(R.string.t30)))
            }
            val randomElement:Tost = toastList.random()
            toastList.remove(randomElement)
            if (!toastList.contains(randomElement)){
                val name = randomElement.descTost
                tvTost.text = name
            }
        }
    }

    private fun playMusic(){
        val mPlayer= MediaPlayer.create(this, R.raw.zvyakane_bokalov);
        mPlayer.start()
    }
}
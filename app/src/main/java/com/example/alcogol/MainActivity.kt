package com.example.alcogol

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val toastList = ArrayList<Tost>()
        btNewTost.setOnClickListener {

//          Рабоатает, позже включим звук
//            goMusic()
            if (toastList.isEmpty()) {
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
            val randomElement: Tost = toastList.random()
            val name = randomElement.descTost
            tvTost.text = name
            toastList.remove(randomElement)


            setColorBackground()
            setColorToast()

        }
    }

    private fun playMusic() {
        val mPlayer = MediaPlayer.create(this, R.raw.zvyakane_bokalov);
        mPlayer.start()
    }

    private fun setColorBackground() {
        val colorsBack = ArrayList<Int>()
        colorsBack.add(resources.getColor(R.color.orange))
        colorsBack.add(resources.getColor(R.color.red))
        colorsBack.add(resources.getColor(R.color.purple))
        colorsBack.add(resources.getColor(R.color.lite_green))
        colorsBack.add(resources.getColor(R.color.purple_500))
        colorsBack.add(resources.getColor(R.color.purple_700))
        colorsBack.add(resources.getColor(R.color.purple_200))
        colorsBack.add(resources.getColor(R.color.bb))
        colorsBack.add(resources.getColor(R.color.gg))
        colorsBack.add(resources.getColor(R.color.yy))
        colorsBack.add(resources.getColor(R.color.ff))
        val randomElement = colorsBack.random()
        mainActivty.setBackgroundColor(randomElement)
    }

    private fun setColorToast() {
        val colorsTextToast = ArrayList<Int>()
        colorsTextToast.add(resources.getColor(R.color.white))
        colorsTextToast.add(resources.getColor(R.color.white2))
        colorsTextToast.add(resources.getColor(R.color.white3))
        colorsTextToast.add(resources.getColor(R.color.white4))
        colorsTextToast.add(resources.getColor(R.color.white5))
        colorsTextToast.add(resources.getColor(R.color.white6))
        val random = colorsTextToast.random()
        tvTost.setTextColor(random)

    }

}
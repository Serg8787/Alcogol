package com.example.alcogol

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagesAdapter(val pages: ArrayList<Pages>, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return pages.size;
    }
    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> Fragment1.newInstance(pages[position].tittle) // blue
            1 -> Fragment2.newInstance(pages[position].tittle)
            else -> Fragment3.newInstance(pages[position].tittle) // green
        }

    }
}
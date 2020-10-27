

package com.example.vp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.SubFragment
import com.example.myapplication.textfragment

class PageAdapter2(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return textfragment()
            }
            1 -> {
                return textfragment()
            }
            2 -> {
                return textfragment()
            }
            else ->{
                return textfragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {
                return "qweqwe"
            }
            1 -> {
                return "Koqweqweqwela"
            }
            2 -> {
                return "Kırmızqweqweqweı et"
            }
            else -> {
                return "Sebqweqweqweqweze"
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}
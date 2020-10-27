package com.example.vp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main2.tabLayout

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {

                return Fragment1()
            }
            1 -> {
                return Fragment2()
            }
            2 -> {
                return Fragment3()
            }
            3 -> {
                return Fragment3()
            }
            4 -> {
                return Fragment3()
            }
            5 -> {
                return Fragment3()
            }
            else ->{
                return Fragment1()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {
                return "Sebze - Meyve"
            }
            1 -> {
                return "İçecek"
            }
            2 -> {
                return "Et- Şarküteri"
            }

            3 -> {
                return "Ivır - Zıvır"
            }

            4 -> {
                return "asda"
            }

            5 -> {
                return "Esdfsdfsdf"
            }
            else -> {
                return "Sebze - meyve"
            }
        }
    }

    override fun getCount(): Int {
        return 7
    }
}
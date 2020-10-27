package com.example.myapplication


import android.content.Intent
import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.example.vp.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.tabLayout
//import kotlinx.android.synthetic.main.activity_main2.tabLayout2
import kotlinx.android.synthetic.main.activity_main2.viewPagerrr
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.fragment_sub.*


class ViewPager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        viewPagerrr.adapter = PageAdapter(supportFragmentManager)

        //bos.adapter = PageAdapter2(supportFragmentManager)





        tabLayout.setupWithViewPager(viewPagerrr)
        //tabLayout2.setupWithViewPager(bos)





        lateinit var fragment1: Fragment1
        lateinit var fragment2:Fragment2

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bot)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId){

                R.id.action_add -> {
                    fragment1=Fragment1()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.viewPagerrr, Fragment1())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }
            true
        }



    }







}
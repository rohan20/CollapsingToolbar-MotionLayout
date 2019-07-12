package com.deliveryhero.collapsingtoolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpAdapters()
    }

    private fun setUpAdapters(){
        val fragments = (1..5).map { PagerFragment() }
        val fragmentsTitles = (1..5).map { "Tab $it" }
        val adapter = FragmentsAdapter(supportFragmentManager, fragments, fragmentsTitles)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}

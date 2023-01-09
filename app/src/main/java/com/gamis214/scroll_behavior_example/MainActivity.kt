package com.gamis214.scroll_behavior_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.containerFragments, Fragment1())
        ft.commit()
    }
}
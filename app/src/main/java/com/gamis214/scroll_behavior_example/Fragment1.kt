package com.gamis214.scroll_behavior_example


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_1, parent, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}
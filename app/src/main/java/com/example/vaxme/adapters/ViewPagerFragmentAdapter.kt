package com.example.vaxme.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.vaxme.fragments.FragmentFirst
import com.example.vaxme.fragments.FragmentSecond
import com.example.vaxme.fragments.FragmentThird

class ViewPagerFragmentAdapter(activity: FragmentActivity):FragmentStateAdapter(activity) {

    override fun getItemCount() = 3



    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentFirst()
            1 -> FragmentSecond()
            2 -> FragmentThird()
            else -> FragmentFirst()
        }

    }
}

package com.example.datateman

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
        private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> { return MyFriend_Fragment() }
            1 -> { return  GitHub_Fragment() }
            2 -> { return Profil_Fragment() }
        else -> { return GitHub_Fragment()}
    }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}
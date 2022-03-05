package com.hyeongjong.viewpager_20220305.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.hyeongjong.viewpager_20220305.fragments.HelloFragment
import com.hyeongjong.viewpager_20220305.fragments.MyInfoFragment
import com.hyeongjong.viewpager_20220305.fragments.MyNameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
//      몇 페이지의 프래그먼트인지? return으로 표현
        return 3
    }

    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return MyNameFragment()
        }
        else if (position == 1){
            return MyInfoFragment()
        }
        else {
            return HelloFragment()
        }

    }
}
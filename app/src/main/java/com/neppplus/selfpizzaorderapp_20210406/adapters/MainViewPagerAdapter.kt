package com.neppplus.selfpizzaorderapp_20210406.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.neppplus.selfpizzaorderapp_20210406.fragments.MyProfileFragment
import com.neppplus.selfpizzaorderapp_20210406.fragments.PizzaStoreFragment



// 프래그먼트를 위치에 맞게 뷰페이저에 뿌리자 -> adapter 활용하자는 뜻.
// 뷰페이저어댑터는 프래그먼트페이저어댑터를 상속받는다!!!
// 기본생성자 지원 안해. 클래스생성자를 커스터마이징해서 부모에게 전달 !!왜 저렇게 쓰는거지?
class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaStoreFragment()
            else -> MyProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
//    여기까지 코드 작성은 뭘 한거지...? 이게 뭘 만들걸까
//    뷰페이저용 어댑터를 만들었다 그게 바로 MainViewPagerAdapter
//    뷰페이저용 어댑터를 만들었으니까, 이제 어댑터랑 뷰페이저를 연결하자
}
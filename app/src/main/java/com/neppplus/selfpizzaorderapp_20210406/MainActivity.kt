package com.neppplus.selfpizzaorderapp_20210406

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.selfpizzaorderapp_20210406.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MainActivity : BaseActivity() {

//    뷰페이저어댑터를 변수화 해서 아래에서 사용
    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {
//        변수화된 어댑터는, 찐 어댑터의 생성자 supportFragmentManager 호출!!
        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
//        xml에 아이디부여한 뷰페이저의 어댑터는 이제 맨위 변수화한 어댑터변수.
        mainViewPager.adapter = mViewPagerAdapter

//        여기까지하면 이제 프래그먼트 2개가 나타남. 하지만 탭레이아웃이 안보이니까 탭레이아웃작업하기

        mainTabLayout.setupWithViewPager(mainViewPager)
//        뷰페이저와 코틀린을 연결했음.(괄호안에는 뷰페이저변수)
//        여기까지했지만 탭레이아웃의 제목이 안나옴 제목 넣어주러가자
    }


}
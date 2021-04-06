package com.neppplus.selfpizzaorderapp_20210406.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.selfpizzaorderapp_20210406.R
import com.neppplus.selfpizzaorderapp_20210406.datas.Store

class PizzaStoreFragment : Fragment() {

//    피자가게 정보를 담아둘 ArrayList 변수 추가
    val mPizzaStoreList = ArrayList<Store>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store,container, false)
    }

//    자꾸 빼먹냐 onActivityCreated!! 동작 관련 코드들을 적어주는 함수!!
//    onCreateView 다음에 바로 적어주기
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    mPizzaStoreList.add(Store("피자헛", "URL", "전화번호"))



    }
}
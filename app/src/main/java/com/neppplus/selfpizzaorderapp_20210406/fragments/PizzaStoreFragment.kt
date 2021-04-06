package com.neppplus.selfpizzaorderapp_20210406.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.selfpizzaorderapp_20210406.R
import com.neppplus.selfpizzaorderapp_20210406.adapters.StoreAdapter
import com.neppplus.selfpizzaorderapp_20210406.datas.Store
import kotlinx.android.synthetic.main.fragment_pizza_store.*

class PizzaStoreFragment : Fragment() {

//    피자가게 정보를 담아둘 ArrayList 변수 추가
    val mPizzaStoreList = ArrayList<Store>()

//   xml + 데이터를 조합해서 뿌려주는 어댑터 변수를 추가
    lateinit var mPizzaStoreAdapter : StoreAdapter

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

//    m어댑터의 대입을 진행했음. mContext가 아니라 화면이니까 액티비티고, 가게정보를 띄우는거니까 스토러리스트!!
    mPizzaStoreAdapter = StoreAdapter(activity!!, R.layout.store_list_item, mPizzaStoreList)
    pizzaStoreListView.adapter = mPizzaStoreAdapter





    }
}
package com.neppplus.selfpizzaorderapp_20210406.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.selfpizzaorderapp_20210406.R
import com.neppplus.selfpizzaorderapp_20210406.datas.Store

// 피자 가게 데이터를 만들었자나? 그럼 이제 그 데이터를 또 뿌려줄 어댑터를 만들어야함.
// 어레이어댑터를 상속받게 하고, 생성자를 채워줌.
class StoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

//    xml을 코틀린변수로 꺼내오도록 도와주는 클래스. LayoutInflater... = 이거 어렵군
    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        기존의 결과를 버리고 새로운 결과를 만들자

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.store_list_item, null)

        }

        val row = tempRow!!

        return row
    }
}
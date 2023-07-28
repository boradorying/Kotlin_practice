package com.example.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class firstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val items = mutableListOf<String>()
        items.add("아카시아")
        items.add("벚꽃")
        items.add("동백꽃")
        items.add("해바라기")
        items.add("코스모스")
        items.add("목화")
        items.add("연꽃")
        items.add("장미")
        items.add("안개꽃")

        val rv =view.findViewById<RecyclerView>(R.id.singRv)
        val rvAdapter =RVAdapter(items) // 아이템들을 리싸이클뷰 클래스로 옮겨서 이동해준다


        rv.adapter =rvAdapter // 리싸이클뷰랑 리싸이클어댑터에 아이템 목록들을 연결해준다
        rv.layoutManager = LinearLayoutManager(context)


        val image2 = view.findViewById<ImageView>(R.id.image2)
        image2.setOnClickListener{
        it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        val image3 = view.findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {
        it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        return view
    }


}
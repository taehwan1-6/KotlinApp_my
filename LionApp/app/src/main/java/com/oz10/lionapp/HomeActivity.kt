package com.oz10.lionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oz10.lionapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<MenuRecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val items = mutableListOf<HomeMenuItem>()
        items.add(HomeMenuItem("Lion", MainActivity::class.java))
        items.add(HomeMenuItem("Count", CountActivity::class.java))
        items.add( HomeMenuItem("MockChat", MockchatActivity::class.java))

        items.add( HomeMenuItem("Mission01-버튼배치", Mission01Activity::class.java))
        items.add( HomeMenuItem("Mission02-7인의 라이", Mission02Activity::class.java))
        items.add( HomeMenuItem("Mission04-이미지 바꾸기", Mission04Activity::class.java))

        items.add( HomeMenuItem("Event", EventActivity::class.java))
        items.add( HomeMenuItem("Gesture", GestureActivity::class.java))
        items.add( HomeMenuItem("화면전환-로그인", LoginActivity::class.java))
        items.add( HomeMenuItem("액티비티 생명주기", StatechangeActivity::class.java))

        items.add( HomeMenuItem("두 개의 프래그먼트", TwoFragmentActivity::class.java))
        items.add( HomeMenuItem("머티리얼 디자인", MaterialActivity::class.java))
        items.add( HomeMenuItem("탭 인터페이스", TabActivity::class.java))
        items.add( HomeMenuItem("목록보기", RecyclerActivity::class.java))


        layoutManager = LinearLayoutManager(this)
        adapter = MenuRecyclerAdapter(this, items)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter


    }
}
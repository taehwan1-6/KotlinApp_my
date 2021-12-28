package com.oz10.lionapp

import android.graphics.Color
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oz10.lionapp.databinding.ActivityRecyclerBinding

// RecyclerView와 CardView
// RecyclerView
//   스크롤 가능한 리스트 형태로 사용자에게 정보를 출력
//   리스트 항목을 구성하는 기존 뷰가 스크롤되어 화면에서 벗어났을 때 새로운 뷰를 생성하는 대신 그것을 재사용 (효율적)
//   세 가지 레이아웃 매니저
//     LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager
//   RecyclerView 어댑터 : 사용자에게 보여 줄 데이터와 RecyclerView 의 중개자 역할
//     getItemCount(), onCreateViewHolder(), onBindViewHolder()
// CardView
//   연관된 데이터를 카드 형태로 보여 줄  수 있는 사용자 인터페이스 뷰


class RecyclerActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityRecyclerBinding

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.collapsingToolBar.title = "Hello Lion.."
        binding.collapsingToolBar.setContentScrimColor(Color.GREEN)

        layoutManager = LinearLayoutManager(this)
        adapter = RecyclerAdapter()
        binding.contentRecycler.recyclerView.layoutManager = layoutManager
        binding.contentRecycler.recyclerView.adapter = adapter

    }
}
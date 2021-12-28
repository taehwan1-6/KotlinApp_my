package com.oz10.lionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oz10.lionapp.databinding.ActivityHomeBinding
import kotlin.math.roundToInt

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val buttons = mutableMapOf<String, Class<*>>()

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<MenuRecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        사용자 인터페이스 디자인 방법 3가지 중 아래는
        //   (코틀린) 코드로  작성하는 방법
        buttons["Lion"] = MainActivity::class.java
        buttons["Count"] = CountActivity::class.java
        buttons["MockChat"] = MockchatActivity::class.java

        buttons["Mission01-버튼배치"] = Mission01Activity::class.java
        buttons["Mission02-7인의 라이"] = Mission02Activity::class.java
//        buttons["Mission03-Galaxy F"] = Mission03Activity::class.java
        buttons["Mission04-이미지 바꾸기"] = Mission04Activity::class.java
//        buttons["Photo"] = PhotoActivity::class.java

        buttons["Event"] = EventActivity::class.java
        buttons["Gesture"] = GestureActivity::class.java
        buttons["화면전환-로그인"] = LoginActivity::class.java
        buttons["액티비티 생명주기"] = StatechangeActivity::class.java

        buttons["두 개의 프래그먼트"] = TwoFragmentActivity::class.java
        buttons["머티리얼 디자인"] = MaterialActivity::class.java
        buttons["탭 인터페이스"] = TabActivity::class.java
        buttons["목록보기"] = RecyclerActivity::class.java

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        val dm = resources.displayMetrics
        val size = (5 * dm.density).roundToInt()
        params.topMargin = size

        // 버튼 추가 리팩토링
        for (key in buttons.keys) {
            val btn = Button(this)
            btn.text = key
            btn.layoutParams = params
            btn.setOnClickListener { startActivity(Intent(this, buttons[key])) }
            binding.layoutMenu.addView(btn)
        }

        val items = mutableListOf<HomeMenuItem>()
        items.add(HomeMenuItem("Lion", MainActivity::class.java))
        items.add(HomeMenuItem("Count", CountActivity::class.java))

        layoutManager = LinearLayoutManager(this)
        adapter = MenuRecyclerAdapter(this, items)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter


    }
}
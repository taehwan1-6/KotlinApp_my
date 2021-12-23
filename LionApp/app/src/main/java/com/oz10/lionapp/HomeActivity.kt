package com.oz10.lionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.oz10.lionapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val buttons = mutableMapOf<String, Class<*>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

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


        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        // 버튼 추가 리팩토링
        for (key in buttons.keys) {
            val btn = Button(this)
            btn.text = key
            btn.layoutParams = params
            btn.setOnClickListener { startActivity(Intent(this, buttons[key])) }
            binding.layoutMenu.addView(btn)
        }

    }
}
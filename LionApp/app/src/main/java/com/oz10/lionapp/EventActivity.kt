package com.oz10.lionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oz10.lionapp.databinding.ActivityEventBinding

// ㅁ 안드로이드 이벤트 처리 개요
// 안드로이드 이벤트는 다양하지만 주로 사용자 액션에 대한 응답으로 발생
//    입력 이벤트 input event : 터치스크린과 상호작용할 때 발생
//    이벤트 큐 event queue : 발생된 이벤트를 저장하고 유지 관리
//    이벤트 리스터 event listener : 전달된 이벤트를 처리
//        뷰가 필요로 하는 이벤트 리스너(객체)를 등록하고 이 리스너의 콜백 함수를 해당 뷰에 구현
//        binding.button.setOnClickListener( View.OnClickListener -> onClick() ) 함수 호풀
// 이벤트 리스너와 콜백 함수
//    binding.button.setOnClickListener(object : View.OnClickListener {
//        override fun OnClick(v: View?) {// 콜백함수 구현}
//    })
//    binding.button.setOnClickListener {// 콜백함수 구현}
// 이벤트 소비 consumption : 동일한 뷰에 등록된 다음에 일치하는 이벤트 리스너에 계속 전달할 필요 여부를 결정
//    콜백함수에서 true/false 반환

class EventActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEventBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnEvent.setOnClickListener(object :  View.OnClickListener {
//           override fun onClick(v: View?) {
//               binding.tvStatus.text = "Button clicked"
//           }
//        })

        binding.btnEvent.setOnClickListener {
            binding.tvStatus.text = "Button clicked"
        }

        binding.btnEvent.setOnLongClickListener {
            binding.tvStatus.text = "Long Button clicked"
//            true  // 이벤트를 소비했다는 것을 나타냄
            false   // 이벤트를 완전히 소비하지 않고 같은 타입 리스너에게 계속 전달
        }


    }
}
package com.oz10.lionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity

// 안드로이드 프래그먼트 개요
// 프래그먼트 Fragment : 액티비티 내부에서 독립적으로 앱의 UI를 처리
//   프래그먼트는 액티비티의 일부로만 사용될 수 있으며, 런타임 시 UI를 동적으로 변경하기 위해 사용
//   액티비티와 유사하게 자신의 생명주기를 갖는다
// 프래그먼트 생성
//   Fragment 클래스의 서브 클래스를 생성
//   onCreateView() 함수를 오버라이딩해서 프래그먼트 레이아웃을 로드
//   레이아웃 XML 파일을 사용
//   코드에서 프래그먼트를 추가, 교체, 삭제
// 프래그먼트 이벤트 처리
//   이벤트 핸들러가 선언되는 방법에 따라 이벤트 리스너와 콜백 함수를 프래그먼트에 선언하면 프래그먼트에 의해 우선적으로 처리
// 프래그먼트 간의 통신
//   직접 통신이 아닌 프래그먼트를 포함하는 액티비티를 통해 수행
//   프래그먼트로부터 액티비티로의 통신은 프래그먼트에 선언한 이벤트 리스너 인터페이스를 통해 수행


class TwoFragmentActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_fragment)
    }
}
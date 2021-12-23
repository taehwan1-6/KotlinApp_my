package com.oz10.lionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// 안드로이드 앱과 액티비티 생명주기
//   안드로이드 앱은 프로세스로 실행되며, (액티비티나 서비스 및 브로드캐스트 수신자 형태의) 여러 컴포넌트로 구성된다
// 안드로이드 앱과 리소스 관리
//   모바일 장치의 제한된 리소스를 고려
//   장치 자원이 한계에 다다를 경우 시스템에서 메모리 확보를 위해 프로세스를 중단하는 등의 조치를 취한다
//   프로세스 중단을 위해 프로세스의 우선순위와 상태를 모두 고려한 중요도 서열 importance hieracty 이라는 것을 생성
// 안드로이드 프로세스 상태
//   포그라운드 프로세스
//   가시적 프로세스
//   서비스 프로세스
//   백그라운드 프로세스
//   비어 있는 프로세스
// 액티비티 생명주기
//   안드로이드 프로세스 상태는 호스팅하는 앱을 구성하는 액티비티와 컴포넌트의 상태에 의해 결정
//   액티비티의 현재 상태는 액티비티 스택 activity stack 위치에 따라 결정
// 액티비티 스택
//   push, pop, 활성화 액티비티
// 액티비티 상태
//   실행 activite/running
//   일시중지 paused
//   중단 stopped
//   소멸 killed
// 구성 변경
//   액티비티의 상태가 동적으로 변경되어 장치 구성이 변경될 경우
//   장치의 방향이 바뀌거나 시스템 폰트 설정이 변경되는 등
//   영향을 받는 액티비티 인스턴스를 소멸 및 재구성하여 변경에 응답
// 상태 변경 처리
//   내부 데이터 구조와 사용자 인터페이스 상태 저장/복원이 필요
//   상태 변경 처리 2가지 방법
//     안드로이드 운영체제가 호출해 주는 상태 변경 함수를 이용
//     Jetpack 안드로이드 아키텍처 컴포넌트에 포함된 생명주기 클래스를 사용 -> 최근 구글이 권장하는 새로운 방법


class StatechangeActivity : AppCompatActivity() {
    val TAG = "StateChange"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statechange)

        Log.i(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState")
    }
}

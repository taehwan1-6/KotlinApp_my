package com.oz10.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oz10.jetpack.ui.main.MainFragment

// 최신 안드로이드 앱 아키텍처 : Jetpack
//	이전 아키텍처
//		2017년 이전 안드로이드 앱을 만드는 특별한 방법을 권장하지 않고 개발 도구만 제공
//		하나의 액티비티는 UI를 보여주고 관리하며 앱의 로직 코드도 함께 포함
//	최신 안드로이드 아키텍처
//		2017년에 안드로이드 아키텍처 컴포넌트가 소개 2018년 Jetpack 라이브러리 일부로 포함
//		동일 액티비티 내부에서 서로 다른 화면이 콘텐츠로 로드되는 단일 액티비티 앱을 권장
//		또한, 앱 내부의 서로 다른 기능을 별도의 모듈로 분리하는 것을 권장
//	Jetpack 구성
//		안드로이드 앱 구성의 권장사항 지침
//		안드로이드 아키텍처 컴포넌트
//		안드로이드 지원 라이브러리
//	ViewModel 컴포넌트
//		앱의 UI 관련 데이터 모델과 로직을 코드와 분리하는 것이 목적
//		UI(뷰...) <-> UI 컨트롤러 <-> ViewModel 인스턴스
//	LiveData 컴포넌트
//		ViewModel 의 특정 데이터 항목이 변경될 때 UI 컨트롤러가 통보를 받도록 하는 것이 목적
//		ViewModel 데이터에 관심 있는 UI 컨트롤러가 옵저버 observer 를 설정하고 해당 데이터가 변경될 때 통보를 받을 수 있다
//		LiveData 를 사용하면 UI가 ViewModel 의 데이터와 항상 일치되게 할 수 있다
//		UI(뷰...) <-> UI 컨트롤러 (옵저버) <-> (LiveData) ViewModel 인스턴스
//	데이터 바인딩
//		ViewModel 의 데이터를 XML UI 레이아웃 파일의 뷰와 직접 연결되게 한다
//		ViewModel 에 저장된 LiveData 값이 XML UI 레이아웃 파일에서 직접 참조될 수 있다
//	안드로이드 생명주기
//		생명주기-인식 lifecycle-aware 객체 : 다른 객체의 생병주기 상태를 알아내고 대응할 수 있는 객체
//		생명주기-소유자 lifecycle-owner : 자신의 생명주기 상태를 제공하는 객체
//	리포지터리 모듈 Repository module
//		ViewModel 이 하나 이상의 외부 소스(DB)로부터 데이터를 얻는다면,
//		  데이터 소스를 처리하는 코드를 ViewModel 클래스와 분리하여 별도의 리포지터리 모듈에 둘 것을 권장
//		UI(뷰...) <-> UI 컨트롤러 (옵저버) <-> (LiveData) ViewModel 인스턴스 -> 리포지터리 -> 웹서비스, DB

// 에제 프로젝트
//	ViewModel 앱 생성
//		Fragment + ViewModel 프로젝트 템플릿 선택
//		뷰 바인딩 확인 및 처리
//	Fragment + ViewModel 프로젝트 템플릿
//		메인 액티비티
//		콘텐츠 프래그먼트 : FrameLayout 컨테이너는 플레이스 홀더의 역할
//			앱이 시작되면 첫 번째 화면의 콘텐츠로 교체
//		ViewModel : 앱의 데이터 모델을 저장
//	앱 개발 순서
//		프래그먼트 레이아웃 디자인
//		ViewModel 구현
//		ViewModel에 프래그먼트 연결 : ViewModel의 참조 얻기
//			ViewModelProvider 인스턴스 : 프래그먼트나 액티비티에서 필요한 ViewModel의 참조
//			val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//		프래그먼트 변경
//			사용자 이벤트 콜백함수에서 ViewModel 데이터 사용
//  앱 테스트


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
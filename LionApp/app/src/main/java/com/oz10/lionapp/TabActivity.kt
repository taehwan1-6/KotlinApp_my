package com.oz10.lionapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.oz10.lionapp.databinding.ActivityTabBinding

// 탭 인터페이스
// 	TabLayout 은 ViewPager2 클래스와 함께 사용되어 탭 기반 UI를 제공
//	TabLayout 컴포넌트
//		다른 페이지를 보여 주기 위해 선택될 수 있는 탭을 사용자에게 보여주는 것이 목적
//	ViewPager2 클래스
//		서로 다른 정보를 갖는 페이지(화면)를 사용자가 넘겨 가면서 볼 수 있다
//		각 페이지는 레이아웃 프래그먼트로 관리
//		ViewPager2 인스턴스와 연관된 프래그먼트는 FragmentStateAdapter 클래스 인스턴스에 의해 관리
//	ViewPager2 에 지정된 어댑터에서 구현해야 하는 최소 함수
//		getItemCount() : 사용자에게 보여 줄 수 있는 페이지 프래그먼트의 전체 개수를 반환
//		createFragment() : 페이지 번호를 인자로 받아서 연관된 프래그먼트 객체를 반환


// 	실습 프로젝트
//		Basic Activity 템플릿을 선택
//		불필요한 코드 삭제: 자동 생성된 화면 이동 코드
//		네 개의 프래그먼트 생성
//		TabLayout과 ViewPager2 추가
//		FragmentStateAdapter  생성
//		TabLayout, ViewPager2, TabPagerAdapter 인스턴스를 초기화
//		앱 테스트
//		TabLayout 커스터마이징


class TabActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityTabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
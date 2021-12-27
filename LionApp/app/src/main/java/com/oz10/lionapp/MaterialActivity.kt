package com.oz10.lionapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.oz10.lionapp.databinding.ActivityMaterialBinding

// 	머티리얼 디자인
//	https://developer.android.com/guide/topics/ui/look-and-feel?hl=ko
//		안드로이드 5.0에서 소개
//		안드로이드 앱의 사용자 인터페이스 형태와 작동 방법을 나타내는 디자인 지침
//		색상 스타일과 3차원 공간(x, y, z), 애니메이션 개념들을 도입
//	안드로이드 디자인 지원 라이브러리
//	플로팅 액션 버튼 (FAB)
//		사용자 인터페이스 화면 위에 떠다니는 버튼
//		크기, 위치, 각 사용자 인터페이스 화면에 하나의 플로팅 액션 버튼만 둘 것을 권장
//	스낵바
//		사용자에게 패널 형태로 정보를 보여 주는 방법을 제공
//      간단한 텍스트 메시지를 포함하여 화면 아래에 나타난다


// 	실습 프로젝트
//		Basic Activity 템플릿을 선택
//		프로젝트 확인
//		불필요한 코드 삭제
//			프래그먼트 간의 이동 코드 삭제
//			nav_graph.xml 에서 SecondFragment 삭제
//			SecondFragment.kt, fragment_second.xml 삭제
//		플로팅 액션 버튼 변경
//      스낵바에 액션 추가



class MaterialActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMaterialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaterialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_material)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_material)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}
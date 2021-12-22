package com.oz10.lionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import com.oz10.lionapp.databinding.ActivityGestureBinding

// 안드로이드 제스처
// 리스너 클래스 구현하기
//   GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener

class GestureActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private lateinit var binding: ActivityGestureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGestureBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        binding.tvGestureStatus.text = "onDown"
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        binding.tvGestureStatus.text = "onShowPress"
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        binding.tvGestureStatus.text = "onSingleTapUp"
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        binding.tvGestureStatus.text = "onScroll"
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        binding.tvGestureStatus.text = "onLongPress"
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        binding.tvGestureStatus.text = "onFling"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        binding.tvGestureStatus.text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        binding.tvGestureStatus.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        binding.tvGestureStatus.text = "onDoubleTapEvent"
        return true
    }
}

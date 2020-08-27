package jp.techacademy.umiya.fukuyama.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("なな", 23, "宇宙")
        human1.say()
        human1.think()

        val human2 = Human("なずな", 19, "世界")
        human2.say()
        human2.think()
    }
}

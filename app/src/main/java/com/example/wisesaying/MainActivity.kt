package com.example.wisesaying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.wisesaying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("Fake it until you Make it")
        sentenceList.add("신은 용기있는자를 결코 버리지 않는다")
        sentenceList.add("피할수 없으면 즐겨라")
        sentenceList.add("오랫동안 꿈을 그리는 사람은 마침내 그 꿈을 닮아 간다")
        sentenceList.add("행복은 습관이다, 그것을 몸에 지니라")

        Log.e("MainActivity", sentenceList.random())

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {

            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)

        }

        binding.goodWordTextArea.setText(sentenceList.random())

    }

}
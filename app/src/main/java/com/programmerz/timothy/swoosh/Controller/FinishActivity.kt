package com.programmerz.timothy.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.programmerz.timothy.swoosh.R
import com.programmerz.timothy.swoosh.Utils.EXTRA_LEAGUE
import com.programmerz.timothy.swoosh.Utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill"
    }
}

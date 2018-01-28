package com.programmerz.timothy.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.programmerz.timothy.swoosh.R
import com.programmerz.timothy.swoosh.Utils.EXTRA_PLAYER
import com.programmerz.timothy.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill}"
    }
}

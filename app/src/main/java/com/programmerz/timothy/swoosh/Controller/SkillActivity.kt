package com.programmerz.timothy.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.programmerz.timothy.swoosh.R
import com.programmerz.timothy.swoosh.Utils.EXTRA_PLAYER
import com.programmerz.timothy.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onFinishClick(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }
}

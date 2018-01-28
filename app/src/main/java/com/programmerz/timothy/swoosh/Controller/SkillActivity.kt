package com.programmerz.timothy.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.programmerz.timothy.swoosh.Utils.EXTRA_LEAGUE
import com.programmerz.timothy.swoosh.R
import com.programmerz.timothy.swoosh.Utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onFinishClick(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }
}

package com.ironclad.agenda

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.ironclad.agenda.databinding.ActivitySplashBinding
import com.ironclad.agenda.utils.Constants
import com.ironclad.agenda.utils.SharedPreferenceHelper

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        val sharedPreference =
            getSharedPreferences(SharedPreferenceHelper.spFirstTime, Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()
        val isFirstTime = sharedPreference.getBoolean(SharedPreferenceHelper.keyIsFirstTime, true)

        if (isFirstTime) {
            val nameIntent = Intent(this, NameActivity::class.java)
            editor.putBoolean(SharedPreferenceHelper.keyIsFirstTime, false)
            editor.apply()
            Log.d(Constants.splashTAG, "Splash to Name")
            Handler().postDelayed({
                startActivity(nameIntent)
            }, Constants.splashTimeOut)
        } else {
            val homeIntent = Intent(this, HomeActivity::class.java)
            editor.putBoolean(SharedPreferenceHelper.keyIsFirstTime, false)
            editor.apply()
            Log.d(Constants.splashTAG, "Splash to Home")
            Handler().postDelayed({
                startActivity(homeIntent)
            }, Constants.splashTimeOut)
        }
    }
}
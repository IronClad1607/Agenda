package com.ironclad.agenda.view.activities

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ironclad.agenda.R
import com.ironclad.agenda.databinding.ActivityHomeBinding
import com.ironclad.agenda.utils.SharedPreferenceHelper

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        val sharedPreferences =
            getSharedPreferences(SharedPreferenceHelper.spFirstTime, Context.MODE_PRIVATE)
        val name = sharedPreferences.getString(SharedPreferenceHelper.keyName, "")
        val wantBiometric = sharedPreferences.getBoolean(SharedPreferenceHelper.keyBiometric, false)
        binding.tvName.text = "Name: $name Biometric:$wantBiometric"
    }
}
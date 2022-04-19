package com.mobile.merrybelt.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.merrybelt.databinding.ActivityReferralRegistrationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpByReferral : AppCompatActivity() {

    private lateinit var binding: ActivityReferralRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferralRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
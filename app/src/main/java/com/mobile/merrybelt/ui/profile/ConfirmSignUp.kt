package com.mobile.merrybelt.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.merrybelt.databinding.ActivityRegistrationConfirmationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConfirmSignUp : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationConfirmationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationConfirmationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
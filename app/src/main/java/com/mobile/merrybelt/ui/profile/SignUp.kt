package com.mobile.merrybelt.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.mobile.merrybelt.databinding.ActivityRegistrationBinding
import com.mobile.merrybelt.ui.profile.repository.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SignUp : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    private val viewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
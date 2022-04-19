package com.mobile.merrybelt.ui.users

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mobile.merrybelt.R
import com.mobile.merrybelt.databinding.ActivityUserConsoleBinding
import com.mobile.merrybelt.ui.users.fragment.home.HomeFragment
import com.mobile.merrybelt.ui.users.fragment.person.PersonFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserConsole : AppCompatActivity() {

    private lateinit var binding: ActivityUserConsoleBinding
    private val homeFragment =  HomeFragment()
    private val profileFragment =  PersonFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserConsoleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(homeFragment, binding)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_home->replaceFragment(homeFragment, binding)
                R.id.action_person->replaceFragment(profileFragment, binding)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment, bindings: ActivityUserConsoleBinding) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(bindings.fragmentContent.id, fragment)
            transaction.commit()
    }

}
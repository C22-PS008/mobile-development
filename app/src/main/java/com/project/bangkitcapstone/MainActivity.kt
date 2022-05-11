package com.project.bangkitcapstone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.project.bangkitcapstone.fragment.HomeFragment
import com.project.bangkitcapstone.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigation : com.google.android.material.bottomnavigation.BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottom_navigation)
        isSelectedBottomNav(savedInstanceState)
    }

    // Fungsi ketika icon padd bottom navigation diclick makan akan memanggil fungsi replace fragment
    private fun isSelectedBottomNav(savedInstanceState: Bundle?){
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> {
                    replaceFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_riwayat -> {
                    replaceFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_artikel -> {
                    replaceFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_cart -> {
                    replaceFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_profil -> {
                    replaceFragment(ProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
        if (savedInstanceState == null){
            bottomNavigation.selectedItemId = R.id.menu_home
        }
    }

    // Fungsi replace fragment ketika dipilih sesuai id
    private fun replaceFragment(fragment : Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}
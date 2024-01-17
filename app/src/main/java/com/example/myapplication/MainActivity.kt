package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        navView.setupWithNavController(navController)
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.drawer_home -> {
                    // Handle item 1 click
                    Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.drawer_see_full_profile-> {
                    // Handle item 2 click
                    Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.drawer_win_history -> {
                    // Handle item 1 click
                    Toast.makeText(this, "win history", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.drawer_bid_history -> {
                    // Handle item 2 click
                    Toast.makeText(this, "bid history", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.drawer_withdraw_point -> {
                    // Handle item 1 click
                    Toast.makeText(this, "withdraw", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.drawer_how_to_play -> {
                    // Handle item 2 click
                    Toast.makeText(this, "how to play", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.drawer_game_rates -> {
                    // Handle item 1 click
                    Toast.makeText(this, "game rates", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.drawer_change_password -> {
                    // Handle item 1 click
                    Toast.makeText(this, "navigation_bid_history", Toast.LENGTH_SHORT).show()
                    true
                }

                // Add more cases for other menu items
                else -> false
            }
        }
    }


}

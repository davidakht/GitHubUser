package com.example.githubuser

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailUserActivity: AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_row_user_detail)

        val tvUsernamereceived : TextView = findViewById(R.id.tv_item_username_received)
        
        val user =intent.getParcelableExtra<User>(EXTRA_USER) as User
        val text = user.username
        tvUsernamereceived.text = text
    }
}
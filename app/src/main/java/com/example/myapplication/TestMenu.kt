package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class TestMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.test_menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item != null)
            when(item.itemId){
                R.id.testMenu_1 -> {Toast.makeText(this,"test menu 1",Toast.LENGTH_SHORT).show()}
                R.id.testMenu_2 -> {Toast.makeText(this,"test menu 2",Toast.LENGTH_SHORT).show()}
                R.id.testMenu_3 -> {Toast.makeText(this,"test menu 3",Toast.LENGTH_SHORT).show()}
                R.id.testMenu_4 -> {Toast.makeText(this,"test menu 4",Toast.LENGTH_SHORT).show()}
            }

        return true
    }
}
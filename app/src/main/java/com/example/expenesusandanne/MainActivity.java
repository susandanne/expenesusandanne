package com.example.expenesusandanne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;


import com.example.expenesusandanne.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding=ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());
      setSupportActionBar(binding.materialToolbar);
      getSupportActionBar().setTitle("hello sir");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
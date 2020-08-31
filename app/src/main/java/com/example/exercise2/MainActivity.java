package com.example.exercise2;

import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clickHere (View view){
        ImageView helloImage = findViewById(R.id.helloImage);
        TextView text = findViewById((R.id.tv_1));
        text.setText("Good Bye");
        helloImage.setImageResource(R.drawable.goodbye);
    }
}
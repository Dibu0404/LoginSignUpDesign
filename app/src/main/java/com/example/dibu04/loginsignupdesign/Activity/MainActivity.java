package com.example.dibu04.loginsignupdesign.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.dibu04.loginsignupdesign.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText emailET , passwordET;
    Button loginBT ;
    TextView forgotTV,signTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        loginBT = findViewById(R.id.main_login_BT);
        signTV = findViewById(R.id.main_sigup_TV);
    }
}
package com.example.dibu04.loginsignupdesign.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dibu04.loginsignupdesign.R;

public class CreateActivity extends AppCompatActivity {

    Button signup_BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        initViews();
        clickListener(this);
    }

    private void clickListener(CreateActivity createActivity) {
        signup_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }

    private void initViews() {
        signup_BT = findViewById(R.id.create_sign_up_BT);
    }
}
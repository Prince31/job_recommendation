package com.example.cvrecommendation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

    }

    public void letsGetStarted(View view){
        Intent intent = new Intent(getApplicationContext(), LetsGetStarted.class);
        startActivity(intent);
    }
}

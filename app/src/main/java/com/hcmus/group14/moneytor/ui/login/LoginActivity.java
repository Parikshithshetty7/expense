package com.hcmus.group14.moneytor.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.hcmus.group14.moneytor.R;
import com.hcmus.group14.moneytor.ui.main.MainActivity;

    public class LoginActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //This method will be executed once the timer is over
                    // Start your app main activity
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                    // close this activity
                    finish();
                }
            }, 1000);
        }
    }

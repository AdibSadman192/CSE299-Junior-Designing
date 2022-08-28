package com.jaswikventures.firebaseloginsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        firebaseAuth = FirebaseAuth.getInstance();
        checkUser();
        AppCompatButton button = (AppCompatButton) findViewById(R.id.launch_activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaunchActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }


    private FirebaseAuth firebaseAuth;

    private void checkUser() {
        //check if user is already logged in
        //get current user
        //if already logged in, then open profile activity
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if(firebaseUser != null){
            //user is already logged in
            startActivity(new Intent(this, ProfileActivity.class));
            finish();
        }

    }
}
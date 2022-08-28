package com.jaswikventures.firebaseloginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RequiresApi;
import android.app.ActivityOptions;
import android.os.Build;
import android.util.Pair;
import android.widget.RelativeLayout;
import android.widget.TextView;
public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        TextView tvName = findViewById(R.id.tv_name);
        tvName.setOnClickListener(v->{
            startActivity(new Intent(MessageActivity.this,ChatActivity.class));
            // finish();
        });

    }
}
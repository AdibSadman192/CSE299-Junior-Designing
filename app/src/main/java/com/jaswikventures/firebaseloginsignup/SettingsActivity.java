package com.jaswikventures.firebaseloginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {
    View inflatedView;

    private TextView tv_back;
    private View cl_sign_out, cl_privacy_policy, cl_terms_and_conditions,
            cl_contact_us, cl_notifications, cl_change_password, cl_edit_my_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        findViews();
        initViews();
        initClickListeners();
    }

    private void findViews() {


        cl_sign_out = inflatedView.findViewById(R.id.cl_sign_out);
        cl_privacy_policy = inflatedView.findViewById(R.id.cl_privacy_policy);
        cl_terms_and_conditions = inflatedView.findViewById(R.id.cl_terms_and_conditions);
        cl_contact_us = inflatedView.findViewById(R.id.cl_contact_us);
        cl_notifications = inflatedView.findViewById(R.id.cl_notifications);
        cl_change_password = inflatedView.findViewById(R.id.cl_change_password);
        cl_edit_my_profile = inflatedView.findViewById(R.id.cl_edit_my_profile);

    }

    private void initViews() {


    }

    private void initClickListeners() {

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here
            }
        });

        cl_sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here

            }
        });
        cl_privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here
            }
        });
        cl_terms_and_conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here
            }
        });
        cl_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here
            }
        });
        cl_notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here
            }
        });
        cl_change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here
            }
        });

        cl_edit_my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add your here
                Intent intent=new Intent(SettingsActivity.this,EditProfile.class);
                startActivity(intent);
            }
        });

    }


}
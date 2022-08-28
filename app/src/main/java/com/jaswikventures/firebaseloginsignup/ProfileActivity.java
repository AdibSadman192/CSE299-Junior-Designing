package com.jaswikventures.firebaseloginsignup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.jaswikventures.firebaseloginsignup.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    //view binding
    private ActivityProfileBinding binding;

    //actionBar
    //private ActionBar actionBar;

    //firebase auth
    private FirebaseAuth firebaseAuth;
    private static ImageView imgview;


    //custom
    LinearLayout personalinfo, experience, review;
    TextView personalinfobtn, experiencebtn, reviewbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        //configure action bar, title
        //actionBar = getSupportActionBar();
        //actionBar.setTitle("LogIn");

        //firebase auth
        firebaseAuth = FirebaseAuth.getInstance();
        checkUser();

        //logout user by clicking logout button
        imgview =  findViewById(R.id.logout);

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                checkUser();
            }
        });
        //home_page
        imgview =  findViewById(R.id.HomeImage);

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //message_page
        imgview =  findViewById(R.id.message);

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,MessageActivity.class);
                startActivity(intent);
            }
        });
//profilePage
        imgview =  findViewById(R.id.editprofile);

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,EditProfile.class);
                startActivity(intent);
            }
        });


        //setting's

        imgview =  findViewById(R.id.settings);

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });

        //notification

        imgview =  findViewById(R.id.notification);

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,NotificationActivity.class);
                startActivity(intent);
            }
        });



        //custom

        personalinfo = findViewById(R.id.personalinfo);
        experience = findViewById(R.id.experience);
        review = findViewById(R.id.review);
        personalinfobtn = findViewById(R.id.personalinfobtn);
        experiencebtn = findViewById(R.id.experiencebtn);
        reviewbtn = findViewById(R.id.reviewbtn);
        /*making personal info visible*/
        personalinfo.setVisibility(View.VISIBLE);
        experience.setVisibility(View.GONE);
        review.setVisibility(View.GONE);


        personalinfobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.VISIBLE);
                experience.setVisibility(View.GONE);
                review.setVisibility(View.GONE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.blue));
                experiencebtn.setTextColor(getResources().getColor(R.color.grey));
                reviewbtn.setTextColor(getResources().getColor(R.color.grey));

            }
        });

        experiencebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.GONE);
                experience.setVisibility(View.VISIBLE);
                review.setVisibility(View.GONE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.grey));
                experiencebtn.setTextColor(getResources().getColor(R.color.blue));
                reviewbtn.setTextColor(getResources().getColor(R.color.grey));

            }
        });

        reviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.GONE);
                experience.setVisibility(View.GONE);
                review.setVisibility(View.VISIBLE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.grey));
                experiencebtn.setTextColor(getResources().getColor(R.color.grey));
                reviewbtn.setTextColor(getResources().getColor(R.color.blue));

            }
        });



    }




    private void checkUser() {
        //check if use is not logged in, then move to login activity

        //get current user
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if(firebaseUser == null){
            //user not logged in, move to login screen
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }
        else {
            //user logged in, get info
            String email = firebaseUser.getEmail();
            //set to emailtv
            binding.emailTv.setText(email);
        }
    }


}
package com.android.social.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.android.social.R;
import com.android.social.fragment.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SocialActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView_social;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_social, new HomeFragment()).commit();
        bottomNavigationView_social.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                //
            }
            return false;
        });
    }
}
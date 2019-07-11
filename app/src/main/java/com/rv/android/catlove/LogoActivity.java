package com.rv.android.catlove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class    LogoActivity extends AppCompatActivity {

    ImageView logoCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        logoCat = findViewById(R.id.logo_cat);
    }
}

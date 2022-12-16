package com.example.abhikesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class resume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);


    }

    public void ares(View view) {
Uri uri= Uri.parse("https://drive.google.com/file/d/1hBEdm9NeEDVVQJ2p4mJKjqJBJ3N-S82e/view?usp=share_link");
startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void hres(View view) {
        Uri uri= Uri.parse("https://drive.google.com/file/d/1hBEdm9NeEDVVQJ2p4mJKjqJBJ3N-S82e/view?usp=share_link");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
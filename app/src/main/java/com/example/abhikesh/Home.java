package com.example.abhikesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private Dialog dialog;
private ImageView ShowDialog;
VideoView vd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ShowDialog = findViewById(R.id.sms);

        //Create the Dialog here
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        Button Okay = dialog.findViewById(R.id.btn_okay);
        Button Cancel = dialog.findViewById(R.id.btn_cancel);
        vd=findViewById(R.id.videoView);
        String url="android.resource://"+ getPackageName()+"/"+R.raw.videoplayback;
        Uri uri=Uri.parse(url);
        vd.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        vd.setMediaController(mediaController);
        mediaController.setAnchorView(vd);



        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Home.this, "WE TOO LOVE YOU!!! ", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Home.this, "WE WILL REACH OUT TO YOU SOON!!! ", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });


    }

    public void aboutus(View view) {
        Intent intent= new Intent(this,Aboutus.class);
        startActivity(intent);

    }

    public void contact(View view) {
        Intent intent= new Intent(this,contact.class);
        startActivity(intent);
    }

    public void resume(View view) {
        Intent intent= new Intent(this,resume.class);
        startActivity(intent);
    }

    public void insta2(View view) {
        Uri uri= Uri.parse("https://instagram.com/hrishikesh.chowdhary?igshid=MTg0ZDhmNDA=");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void insta1(View view) {
        Uri uri= Uri.parse("https://www.linkedin.com/feed/");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void sms(View view) {
        dialog.show();
    }
}
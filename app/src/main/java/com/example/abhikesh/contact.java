package com.example.abhikesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class contact extends AppCompatActivity {
Button b1,b2,b3,b4;
    LinearLayout ly1,ly2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        b1=findViewById(R.id.call1);
        b2=findViewById(R.id.email1);
        b3=findViewById(R.id.call2);
        b4=findViewById(R.id.email2);

        ly1=findViewById(R.id.lay1);
        ly1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        ly2=findViewById(R.id.lay2);
        ly2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }

    public void call1(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9199826293"));
        startActivity(i);
    }

    public void email1(View view) {
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,"Hello,Nice contacting You Abhinav Sinha ");
        startActivity(i);
    }

    public void call2(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8223000120"));
        startActivity(i);
    }

    public void email2(View view) {
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,"Hello,Nice contacting You Hrishikesh Chowdhry ");
        startActivity(i);
    }

    public void abhi(View view) {
        int v=(b1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
      int v1=(b2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(ly1,new AutoTransition());
        b1.setVisibility(v);
        b2.setVisibility(v1);
    }


    public void hrishi(View view) {
        int v=(b3.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v1=(b4.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(ly2,new AutoTransition());
        b3.setVisibility(v);
        b4.setVisibility(v1);
    }
}
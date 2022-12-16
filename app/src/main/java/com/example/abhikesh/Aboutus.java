package com.example.abhikesh;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {

    TextView tv1;
    LinearLayout ly1;
    TextView tv2;
    LinearLayout ly2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        tv1=findViewById(R.id.abhides);
        ly1=findViewById(R.id.layout1);
        ly1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        tv2=findViewById(R.id.hrishides);
        ly2=findViewById(R.id.layout2);
        ly2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

    }

    public void abhi(View view) {
        int v=(tv1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(ly1,new AutoTransition());
        tv1.setVisibility(v);

    }

    public void hrishi(View view) {
        int v=(tv2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(ly2,new AutoTransition());
        tv2.setVisibility(v);
    }
}
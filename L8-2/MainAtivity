package com.chien.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view) {
        ImageView img = findViewById(R.id.imageView1);
        switch(view.getId()){
            case R.id.button01:
                Animation a1 = AnimationUtils.loadAnimation(this, R.anim.animpg);
                img.startAnimation(a1);
                break;

            case R.id.button02:
                //Animation a22 = AnimationUtils.loadAnimation(this, R.anim.animpg2);
                //img.startAnimation(a22);
                ObjectAnimator a2 = ObjectAnimator.ofFloat(img, "rotation", 0, 360, 0);
                a2.setDuration(2000);
                a2.start();
                break;

            case R.id.button03:
                Animation a3 = AnimationUtils.loadAnimation(this, R.anim.animpg3);
                img.startAnimation(a3);
                break;
        }
    }
}

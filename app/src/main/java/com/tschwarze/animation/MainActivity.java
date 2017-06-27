package com.tschwarze.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
//asdhjkasdkjh
//https://github.com/daimajia/AndroidViewAnimations
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtnFade = (Button) findViewById(R.id.btn_fade);
        Button mBtnBounce = (Button) findViewById(R.id.btn_bounce);
        Button mBtnRotate = (Button) findViewById(R.id.btn_rotate);
        Button mBtnZoom = (Button) findViewById(R.id.btn_zoom);


        //BOUNCE
        mBtnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.BounceIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.txt_ausgabe));
            }
        });

        //FADE
        mBtnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.FadeIn)
                        .duration(700)
                        .repeat(1)
                        .playOn(findViewById(R.id.txt_ausgabe));
            }
        });

        //ROTATE
        mBtnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.RotateIn)
                        .duration(500)
                        .repeat(3)
                        .playOn(findViewById(R.id.txt_ausgabe));
            }
        });

        //ZOOM
        mBtnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.ZoomIn)
                        .duration(1500)
                        .repeat(1)
                        .playOn(findViewById(R.id.txt_ausgabe));
            }
        });
    }
}

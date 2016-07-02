package com.example.danozz.chaanpal;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/quicksand-light.otf");
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final ImageView _ImageView=(ImageView)findViewById(R.id.img_01);

        final TextView _tvInstruction1=(TextView)findViewById(R.id.instruction1);
        final TextView _tvInstruction2=(TextView)findViewById(R.id.instruction2);
        final TextView _tvInstruction3=(TextView)findViewById(R.id.instruction3);

        _tvInstruction1.setTypeface(type);
        _tvInstruction2.setTypeface(type);
        _tvInstruction3.setTypeface(type);

        final Animation _fadeinT1= AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation _fadeinT2= AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation _fadeinT3= AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation _fadeinIv= AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation _rotateFab=AnimationUtils.loadAnimation(this, R.anim.rotate);

        _tvInstruction2.setVisibility(View.INVISIBLE);
        _tvInstruction3.setVisibility(View.INVISIBLE);
        _ImageView.setVisibility(View.INVISIBLE);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                    _rotateFab.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            startActivity(new Intent(getApplicationContext(), Home.class));
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    fab.startAnimation(_rotateFab);


                } else {
                    startActivity(new Intent(getApplicationContext(), Home.class));
                }

            }
        });
        _fadeinT1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                _tvInstruction2.setVisibility(View.VISIBLE);
                _fadeinT2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        _tvInstruction3.setVisibility(View.VISIBLE);
                        _fadeinT3.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                _ImageView.setVisibility(View.VISIBLE);
                                _ImageView.startAnimation(_fadeinIv);
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                        _tvInstruction3.startAnimation(_fadeinT3);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                _tvInstruction2.startAnimation(_fadeinT2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        _tvInstruction1.startAnimation(_fadeinT1);
}
}

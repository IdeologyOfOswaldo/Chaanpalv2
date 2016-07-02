package com.example.danozz.chaanpal;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,GirlOrBoy.OnFragmentInteractionListener,LocalizationDoctors.OnFragmentInteractionListener,Informationadditional.OnFragmentInteractionListener,Pregnant.OnFragmentInteractionListener {
    Fragment _fragment=null;
    boolean _fragmentTransaccion=false;
    FrameLayout frameLayout,frameLayoutpal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/quicksand-light.otf");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        frameLayoutpal=(FrameLayout)findViewById(R.id.content_home);
        frameLayout=(FrameLayout)findViewById(R.id.fl_secondhome);
        TextView textView=(TextView)findViewById(R.id.lblchome);
        textView.setTypeface(type);
        final Animation _rotate= AnimationUtils.loadAnimation(this, R.anim.rotate);
        _rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.START);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        final ImageView _ImageView=(ImageView)findViewById(R.id.imgHome);
        _ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _ImageView.startAnimation(_rotate);
            }
        });
       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // _fragmentTransaccion=true;
        // _fragment=new GirlOrBoy();
        // getSupportFragmentManager().beginTransaction().replace(R.id.content_home,_fragment).commit();
        //navigationView.setCheckedItem(R.id.nav_chaanpal);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(getApplicationContext(),About.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_chaanpal) {
            // Handle the camera action
            _fragmentTransaccion=true;
            _fragment=new GirlOrBoy();
        } else if (id == R.id.nav_dialog_map) {
            _fragmentTransaccion=true;
            _fragment=new LocalizationDoctors();
        } else if (id == R.id.nav_information) {
            _fragmentTransaccion=true;
            _fragment=new Informationadditional();
        }
        else if (id == R.id.nav_pregnant) {
            _fragmentTransaccion=true;
            _fragment=new Pregnant();
        }
        if(_fragmentTransaccion)
        {
            frameLayoutpal.setBackgroundResource(R.color.colorWhite);
            frameLayout.setVisibility(View.INVISIBLE);
            getSupportFragmentManager().beginTransaction().replace(R.id.content_home,_fragment).commit();
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
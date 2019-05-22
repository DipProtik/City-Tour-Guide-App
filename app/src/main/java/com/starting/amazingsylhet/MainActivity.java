package com.starting.amazingsylhet;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Welcome to my first Android App", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//                Intent spla = new Intent(MainActivity.this,SplashScreen.class);
//                startActivity(spla);
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
//            super.onBackPressed();
        }

        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Attention!");
        builder.setIcon(R.drawable.attetion);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
//            return true;
//            builder.setTitle("Contact");
//            builder.setIcon(R.drawable.contacts);
//            builder.setMessage("E-mail: Protikdip2016@gmail.com" +
//                    "Contact: 01940374834");
//            builder.setCancelable(true);
            Toast.makeText(MainActivity.this,"E-mail: Protikdip2016@gmail.com \nContact: 01940374834",Toast.LENGTH_LONG).show();
        }
        if (id == R.id.action_settingsTwo){
            Toast.makeText(MainActivity.this,"You can have detailed information to explore the Sylhet City by using this app.",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent j = new Intent(MainActivity.this,PlacesActivity.class);
            startActivity(j);
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(MainActivity.this,WeatherActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_slideshow) {
            Intent k = new Intent(MainActivity.this, PickingPlacesActivity.class);
            startActivity(k);

        } else if (id == R.id.nav_manage) {
            Intent l = new Intent(MainActivity.this, RentOfRickActivity.class);
            startActivity(l);

        } else if (id == R.id.nav_share) {
            Intent m = new Intent(MainActivity.this, ScrollTestActivity.class);
            startActivity(m);

        } else if (id == R.id.nav_send) {
            Intent n = new Intent(MainActivity.this, NotepadActivity.class);
            startActivity(n);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

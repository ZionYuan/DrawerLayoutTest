package com.example.yuanzi.drawerlayouttest;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        textView = (TextView)findViewById(R.id.textView);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        //navigationView.setCheckedItem(R.id.nav_call);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_call:
                        textView.setText("Call");
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.nav_mail:
                        textView.setText("Mail");
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.nav_location:
                        textView.setText("Location");
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.nav_friends:
                        textView.setText("Friends");
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.nav_task:
                        textView.setText("Task");
                        mDrawerLayout.closeDrawers();
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);break;
            default:
                break;
        }
        return true;
    }
}

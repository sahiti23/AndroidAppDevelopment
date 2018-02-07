package com.example.interactiveapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Adding button and positioning it on the relative layout

        //Layout
        RelativeLayout sahitiLayout = new RelativeLayout(this);
        sahitiLayout.setBackgroundColor(Color.GREEN);

        //Button
        Button b = new Button(this);
        b.setText("login");
        b.setBackgroundColor(Color.RED);

        //Username input
        EditText username = new EditText(this);

        b.setId(1);
        username.setId(2);

        //Button Positioning
        RelativeLayout.LayoutParams bdetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        bdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        bdetails.addRule(RelativeLayout.CENTER_VERTICAL);

        RelativeLayout.LayoutParams usernamedetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        bdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        bdetails.addRule(RelativeLayout.CENTER_VERTICAL);

        // Give rules to position widgets
        usernamedetails.addRule(RelativeLayout.ABOVE, b.getId());
        usernamedetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernamedetails.setMargins(0,0,0,50);

        Resources r = getResources();
        int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        username.setWidth(px);

        // Add widget to layout. Button is now a child of layout
        sahitiLayout.addView(b,bdetails);
        sahitiLayout.addView(username,usernamedetails);
        // display view. The first screen to launch the activity.
        setContentView(sahitiLayout);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

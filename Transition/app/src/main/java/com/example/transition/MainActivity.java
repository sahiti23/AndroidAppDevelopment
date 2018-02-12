package com.example.transition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ViewGroup lo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lo = (ViewGroup) findViewById(R.id.lo);
        lo.setOnTouchListener(new RelativeLayout.OnTouchListener() {
                                  @Override
                                  public boolean onTouch(View v, MotionEvent e) {
                                      moveButton();
                                      return true;

                                  }
                              }
        );
    }
    public void moveButton()
    {
        View b = findViewById(R.id.b);

        TransitionManager.beginDelayedTransition(lo);

        //change position of the button
        RelativeLayout.LayoutParams positionrules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionrules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionrules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        b.setLayoutParams(positionrules);

        //change the size of the button
        ViewGroup.LayoutParams sizerules = b.getLayoutParams();
        sizerules.width = 450;
        sizerules.height=300;
        b.setLayoutParams(sizerules);

    }
}

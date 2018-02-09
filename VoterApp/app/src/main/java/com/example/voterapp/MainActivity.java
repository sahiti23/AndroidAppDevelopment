package com.example.voterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_uofu_count;
    Button uofub;

    TextView tv_usu_count;
    Button usub;

    int c1=0;
    int c2=0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_uofu_count = (TextView) findViewById(R.id.tv_uofu_count);
        uofub = (Button) findViewById(R.id.btn_u_vote);
        tv_usu_count = (TextView) findViewById(R.id.tv_usu_count);
        usub = (Button) findViewById(R.id.btn_usu_vote);
    }

    public void voteU(View v)
    {
        String uofucount = tv_uofu_count.getText().toString().trim();
        int c1 = Integer.parseInt(uofucount);
        c1++;
        tv_uofu_count.setText(String.valueOf(c1));
    }
    public void voteUsu(View v)
    {
        String usucount = tv_usu_count.getText().toString().trim();
        int c2 = Integer.parseInt(usucount);
        c2++;
        tv_usu_count.setText(String.valueOf(c2));
    }
}

package com.example.android.sitereminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Date;
import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    // Site 1
    public void useSite1(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location1);
        datetextView.setText(day);
    }

    // Site 2
    public void useSite2(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location2);
        datetextView.setText(day);
    }

    // Site 3
    public void useSite3(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location3);
        datetextView.setText(day);
    }

    // Site 4
    public void useSite4(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location4);
        datetextView.setText(day);
    }

    // Site 5
    public void useSite5(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location5);
        datetextView.setText(day);
    }

    // Site 6
    public void useSite6(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location6);
        datetextView.setText(day);
    }

    // Site 7
    public void useSite7(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location7);
        datetextView.setText(day);
    }

    // Site 8
    public void useSite8(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location8);
        datetextView.setText(day);
    }

    // Site 9
    public void useSite9(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location9);
        datetextView.setText(day);
    }

    // Site 10
    public void useSite10(View view) {
        String day = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        TextView datetextView = (TextView) findViewById(
                R.id.location10);
        datetextView.setText(day);
    }



}

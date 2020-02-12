package com.tcc.signapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class StartReadingActivity extends AppCompatActivity {

    public  Button start;
    public Button stop;
    TextView value;
    int reading = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_reading);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        start = ((Button)findViewById(R.id.plot));
        stop = ((Button)findViewById(R.id.stop));
        stop.setEnabled(false);
        value = (TextView) findViewById(R.id.number);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                Intent intent = new Intent(this, PreparingReadingActivity.class);
                startActivity(intent);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void startPlot(View view) {
        value.setText(R.string.start);
        start.setEnabled(false);
        stop.setEnabled(true);
        start.setBackgroundResource(R.color.colorDisabled);
        stop.setBackgroundResource(R.color.colorPrimary);
    }


    public void stopPlot(View view) {
        value.setText(R.string.stop);
        stop.setEnabled(false);
        start.setEnabled(true);
        start.setBackgroundResource(R.color.colorPrimary);
        stop.setBackgroundResource(R.color.colorDisabled);
    }
}

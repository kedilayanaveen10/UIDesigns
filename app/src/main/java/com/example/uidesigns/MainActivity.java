package com.example.uidesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Intent designIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDesign1(View view)
    {
        designIntent = new Intent(this,Design1.class);
        startActivity(designIntent);
    }

    public void openDesign2(View view)
    {
        designIntent = new Intent(this,Design2.class);
        startActivity(designIntent);
    }

    public void openDesign3(View view)
    {
        designIntent = new Intent(this,Design3.class);
        startActivity(designIntent);
    }

    public void openDesign4(View view)
    {
        designIntent = new Intent(this,Design4.class);
        startActivity(designIntent);
    }

    public void openDesign5(View view)
    {
        designIntent = new Intent(this,Design5.class);
        startActivity(designIntent);
    }

    public void openDesign6(View view)
    {
        designIntent = new Intent(this,Design6.class);
        startActivity(designIntent);
    }

    public void openDesign7(View view)
    {
        designIntent = new Intent(this,Design7.class);
        startActivity(designIntent);
    }

    public void openDesign8(View view)
    {
        designIntent = new Intent(this,Design8.class);
        startActivity(designIntent);
    }

}
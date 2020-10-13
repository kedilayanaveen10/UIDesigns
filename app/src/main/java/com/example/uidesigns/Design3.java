package com.example.uidesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class Design3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    private Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design3);
        spin = (Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
    }

    public void printMsg(CharSequence msg)
    {
        Toast t = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        printMsg(spin.getItemAtPosition(position).toString() + " selected");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        printMsg("Nothing Selected");
    }
}
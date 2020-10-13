package com.example.uidesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Design2 extends AppCompatActivity
{
    private CheckBox jog;
    private CheckBox swim;
    private CheckBox run;
    private CheckBox code;
    private RadioButton male;
    private RadioButton female;
    private ToggleButton wifi;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design2);
        jog = (CheckBox)findViewById(R.id.jogging);
        swim = (CheckBox)findViewById(R.id.swimming);
        run = (CheckBox)findViewById(R.id.running);
        code = (CheckBox)findViewById(R.id.coding);
        male = (RadioButton)findViewById(R.id.male);
        female = (RadioButton)findViewById(R.id.female);
        wifi = (ToggleButton)findViewById(R.id.wifi);

        wifi.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                    {
                        if(isChecked)
                            printMsg("Wifi On");
                        else
                            printMsg("Wifi Off");
                    }
                }
        );
    }

    public void printMsg(CharSequence msg)
    {
        Toast t = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
        t.show();
    }

    public void onJoggingClick(View view)
    {
        if(jog.isChecked())
            printMsg("Jogging selected");
        else
            printMsg("Jogging unselected");
    }

    public void onSwimClick(View view)
    {
        if(swim.isChecked())
            printMsg("Swimming selected");
        else
            printMsg("Swimming unselected");
    }

    public void onRunClick(View view)
    {
        if(run.isChecked())
            printMsg("Running selected");
        else
            printMsg("Running unselected");
    }

    public void onCodeClick(View view)
    {
        if(code.isChecked())
            printMsg("Coding selected");
        else
            printMsg("Coding unselected");
    }


    public void onRadioClick(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId())
        {
            case R.id.male:
                if(checked)
                    printMsg("Male selected");
                break;
            case R.id.female:
                if(checked)
                    printMsg("Female selected");
                break;
        }
    }
}
package com.example.uidesigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Design6 extends AppCompatActivity implements View.OnClickListener
{
    private Button datePicker, timePicker;
    private EditText txtTime, txtDate;
    private int year, month, day, hour, minute;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design6);
        datePicker = (Button)findViewById(R.id.datePick);
        timePicker = (Button)findViewById(R.id.timePick);
        txtDate = (EditText)findViewById(R.id.dateDisp);
        txtTime = (EditText)findViewById(R.id.timeDisp);

        datePicker.setOnClickListener(this);
        timePicker.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v == datePicker)
        {
            final Calendar c = Calendar.getInstance();
            year = c.get(Calendar.YEAR);
            month = c.get(Calendar.MONTH);
            day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                {
                    txtDate.setText(dayOfMonth + "-" + (month+1) + "-" + year);
                }
            },year,month,day);
            datePickerDialog.show();
        }
        if(v == timePicker)
        {
            final Calendar c = Calendar.getInstance();
            hour = c.get(Calendar.HOUR_OF_DAY);
            minute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener()
            {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute)
                {
                    txtTime.setText(hourOfDay + ":" + minute);
                }
            },hour,minute,true);
            timePickerDialog.show();
        }
    }
}

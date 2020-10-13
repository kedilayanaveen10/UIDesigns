package com.example.uidesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Design5 extends AppCompatActivity
{
    private ProgressBar progress;
    private TextView dispProgress;
    private int currProgress = 0;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design5);
    }

    public void showProgress(View view)
    {

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                progress = (ProgressBar)findViewById(R.id.progressBar);
                dispProgress = (TextView)findViewById(R.id.showProgress);
                while(currProgress < progress.getMax())
                {
                    currProgress += 5;
                    handler.post(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            progress.setProgress(currProgress);
                            dispProgress.setText(currProgress + "/" + progress.getMax());
                        }
                    });

                    try
                    {
                        sleep(200);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
package com.example.uidesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Design8 extends AppCompatActivity
{
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design8);
        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));
    }

    public void printMsg(CharSequence msg)
    {
        Toast t = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
        t.show();
    }
}

class ImageAdapter extends BaseAdapter
{
    private Context context;
    public Integer[] thumbIds = {R.drawable.sample1, R.drawable.sample2, R.drawable.sample3, R.drawable.sample4,
            R.drawable.sample5, R.drawable.sample6, R.drawable.sample7, R.drawable.sample8, R.drawable.sample9,
            R.drawable.sample10, R.drawable.sample11,R.drawable.sample12,R.drawable.sample13,R.drawable.sample14,
            R.drawable.sample15,R.drawable.sample16,R.drawable.sample17,R.drawable.sample18,R.drawable.sample19,
            R.drawable.sample20,R.drawable.sample21,R.drawable.sample22,R.drawable.sample23};

    public ImageAdapter(Context c)
    {
        context = c;
    }
    @Override
    public int getCount()
    {
        return thumbIds.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView;
        if(convertView == null)
        {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(100,100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0,8,0,8);
        }
        else
        {
            imageView = (ImageView)convertView;
        }
        imageView.setImageResource(thumbIds[position]);
        return imageView;
    }
}
package com.example.jithu.restaurent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1 ,b2 ,b3 ,b4,b5,b6,b7,b8,b9,b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b10 = (Button)findViewById(R.id.button10);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button)  {

            String tableText = "Table No:1";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button2)  {

            String tableText = "Table No:2";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }


        else  if(v.getId() == R.id.button3)  {

            String tableText = "Table No:3";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button4)  {

            String tableText = "Table No:4";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button5)  {

            String tableText = "Table No:5";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button6)  {

            String tableText = "Table No:6";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button7)  {

            String tableText = "Table No:7";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button8)  {

            String tableText = "Table No:8";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button9)  {

            String tableText = "Table No:9";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }

        else  if(v.getId() == R.id.button10)  {

            String tableText = "TableNo:10";
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Item1", tableText);
            startActivity(i);

        }
    }
}

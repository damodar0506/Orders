package com.example.jithu.restaurent;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by JITHU on 7/24/2017.
 */

public class ThirdActivity extends Activity implements  View.OnClickListener {

    TextView tvtable , tvitem , tvqty , tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16;
    Button insert;
    private static final String REGISTER_URL = "  ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_main);


        tvtable = (TextView)findViewById(R.id.tvtable);
        tvitem = (TextView)findViewById(R.id.tvitem);
        tvqty = (TextView)findViewById(R.id.tvqty);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        tv6 = (TextView)findViewById(R.id.tv6);
        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
        tv9 = (TextView)findViewById(R.id.tv9);
        tv10 = (TextView)findViewById(R.id.tv10);
        tv11 = (TextView)findViewById(R.id.tv11);
        tv12 = (TextView)findViewById(R.id.tv12);
        tv13 = (TextView)findViewById(R.id.tv13);
        tv14 = (TextView)findViewById(R.id.tv14);
        tv15 = (TextView)findViewById(R.id.tv15);
        tv16 = (TextView)findViewById(R.id.tv16);

       insert = (Button)findViewById(R.id.insert);



        Intent i2 = getIntent();
        Bundle bundle = i2.getExtras();
        final String tabno = bundle.getString("tab");
        final String item1 = bundle.getString("Item1");
        final String qty1 = bundle.getString("qty1");
        final String item2 = bundle.getString("Item2");
        final String qty2 = bundle.getString("qty2");
        final String item3 = bundle.getString("Item3");
        final String qty3 = bundle.getString("qty3");
        final String item4 = bundle.getString("Item4");
        final String qty4 = bundle.getString("qty4");
        final String item5 = bundle.getString("Item5");
        final String qty5 = bundle.getString("qty5");
        final String item6 = bundle.getString("Item6");
        final String qty6 = bundle.getString("qty6");
        final String item7 = bundle.getString("Item7");
        final String qty7 = bundle.getString("qty7");
        final String item8 = bundle.getString("Item8");
        final String qty8 = bundle.getString("qty8");

        tvtable.setText(tabno);
        tv1.setText(item1);
        tv2 .setText(qty1 );
        tv3 .setText(item2 );
        tv4 .setText(qty2 );
        tv5 .setText(item3 );
        tv6 .setText(qty3 );
        tv7 .setText(item4 );
        tv8 .setText(qty4 );
        tv9.setText(item5);
        tv10 .setText(qty5 );
        tv11 .setText(item6 );
        tv12 .setText(qty6 );
        tv13 .setText(item7 );
        tv14 .setText(qty7 );
        tv15 .setText(item8 );
        tv16 .setText(qty8 );




    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.insert) {

            registerUser();
        }

    }
    private void registerUser() {
        String tabno = tvtable.getText().toString().trim().toLowerCase();
        String Item1 = tv1.getText().toString().trim().toLowerCase();
        String Item2 = tv3.getText().toString().trim().toLowerCase();
        String Item3 = tv5.getText().toString().trim().toLowerCase();
        String Item4 = tv7.getText().toString().trim().toLowerCase();
        String Item5 = tv9.getText().toString().trim().toLowerCase();
        String Item6 = tv11.getText().toString().trim().toLowerCase();
        String Item7 = tv13.getText().toString().trim().toLowerCase();
        String Item8 = tv15.getText().toString().trim().toLowerCase();

        String qty1 = tv2.getText().toString().trim().toLowerCase();
        String qty2 = tv4.getText().toString().trim().toLowerCase();
        String qty3 = tv6.getText().toString().trim().toLowerCase();
        String qty4 = tv8.getText().toString().trim().toLowerCase();
        String qty5 = tv10.getText().toString().trim().toLowerCase();
        String qty6 = tv12.getText().toString().trim().toLowerCase();
        String qty7 = tv14.getText().toString().trim().toLowerCase();
        String qty8 = tv16.getText().toString().trim().toLowerCase();


        register(tabno,Item1 ,Item2,Item3,Item4,Item5,Item6,Item7,Item8,qty1,qty2,qty3,qty4,qty5,qty6,qty7,qty8 );

    }
    private void register(String tabno ,String Item1,String Item2,String Item3,String Item4,String Item5,String Item6,String Item7,String Item8 ,
                          String qty1 ,String qty2,String qty3,String qty4,String qty5,String qty6,String qty7,String qty8 )
    {


        class RegisterUser extends AsyncTask<String, Void, String> {
            ProgressDialog loading;
            RegisterUserClass ruc = new RegisterUserClass();


            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ThirdActivity.this, "Please Wait",null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(String... params) {

                HashMap<String, String> data = new HashMap<String,String>();


// this code for create list<String> in hashmap

              //  List<String> valSetOne = new ArrayList<String>();
             //   valSetOne.add("params[0]");

              //  List<String> valSetTwo = new ArrayList<String>();

              //  valSetTwo.add("params[1]");valSetTwo.add("params[2]");valSetTwo.add("params[3]");valSetTwo.add("params[4]");
              //  valSetTwo.add("params[5]");valSetTwo.add("params[6]");valSetTwo.add("params[7]");valSetTwo.add("params[8]");
            //    List<String> valSetThree = new ArrayList<String>();
            //    valSetThree.add("params[9]");valSetThree.add("params[10]");valSetThree.add("params[11]");valSetThree.add("params[12]");
            //    valSetThree.add("params[13]");valSetThree.add("params[14]");valSetThree.add("params[15]");valSetThree.add("params[16]");



               data.put("table",params[0]);

                data.put("Item[]",params[1]);
                data.put("Item[]",params[2]);
                data.put("Item[]",params[3]);
                data.put("Item[]",params[5]);
                data.put("Item[]",params[6]);
                data.put("Item[]",params[7]);
                data.put("Item[]",params[8]);
                data.put("Item[]",params[9]);

                data.put("qty[]", params[10]);data.put("qty[]", params[11]);
                data.put("qty[]", params[12]);data.put("qty[]", params[13]);data.put("qty[]", params[14]);
                data.put("qty[]", params[15]);data.put("qty[]", params[16]);data.put("qty[]",params[17]);

     String result = ruc.sendPostRequest(REGISTER_URL,data);

                return  result;
            }

        }

        RegisterUser ru = new RegisterUser();
        ru.execute(tabno ,Item1 , Item2 ,Item3,Item4,Item5,Item6,Item7,Item8,qty1,qty2,qty3,qty4,qty5,qty6,qty7,qty8 );




    }


}

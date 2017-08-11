package com.example.jithu.restaurent;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by JITHU on 7/20/2017.
 */

public class SecondActivity extends Activity  implements View.OnClickListener{

    AutoCompleteTextView atv1 , atv2 , atv3 ,atv4 , atv5 , atv6 , atv7, atv8;
    EditText et1 ,et2,et3,et4,et5 , et6,et7,et8;
    TextView tv1,tv2 , rtv ;
    Button bt1 , bt2;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);

        tv1= (TextView) findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        rtv = (TextView)findViewById(R.id.tvt);

         atv1 = (AutoCompleteTextView) findViewById(R.id.atv1);
        atv2 = (AutoCompleteTextView) findViewById(R.id.atv2);
        atv3 = (AutoCompleteTextView) findViewById(R.id.atv3);
         atv4 = (AutoCompleteTextView) findViewById(R.id.atv4);
        atv5 = (AutoCompleteTextView) findViewById(R.id.atv5);
        atv6 = (AutoCompleteTextView) findViewById(R.id.atv6);
        atv7 = (AutoCompleteTextView) findViewById(R.id.atv7);
        atv8 = (AutoCompleteTextView) findViewById(R.id.atv8);


        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);
        et4 = (EditText)findViewById(R.id.et4);
        et5 = (EditText)findViewById(R.id.et5);
        et6 = (EditText)findViewById(R.id.et6);
        et7 = (EditText)findViewById(R.id.et7);
        et8 = (EditText)findViewById(R.id.et8);

        bt1 = (Button)findViewById(R.id.bt1) ;
        bt2 = (Button)findViewById(R.id.bt2);
// Get the string array
 //       String[] ITEMS = getResources().getStringArray(R.array.items_array);
// Create the adapter and set it to the AutoCompleteTextView
 //       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ITEMS);

        atv1.setThreshold(1);
        atv2.setThreshold(1);
        atv3.setThreshold(1);
        atv4.setThreshold(1);
        atv5.setThreshold(1);
        atv6.setThreshold(1);
        atv7.setThreshold(1);
        atv8.setThreshold(1);

        atv1.setAdapter(new SuggestionAdapter(this ,atv1.getText().toString()));
        atv2.setAdapter(new SuggestionAdapter(this ,atv2.getText().toString()));
        atv3.setAdapter(new SuggestionAdapter(this ,atv3.getText().toString()));
        atv4.setAdapter(new SuggestionAdapter(this ,atv4.getText().toString()));
        atv5.setAdapter(new SuggestionAdapter(this ,atv5.getText().toString()));
        atv6.setAdapter(new SuggestionAdapter(this ,atv6.getText().toString()));
        atv7.setAdapter(new SuggestionAdapter(this ,atv7.getText().toString()));
        atv8.setAdapter(new SuggestionAdapter(this ,atv8.getText().toString()));

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

        Intent intent2 = getIntent();
        Bundle bundle = intent2.getExtras();
        final String Name = bundle.getString("Item1");

        rtv.setText(Name);

}


    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.bt1){

            Intent i = new Intent(SecondActivity.this,ThirdActivity.class);
            i.putExtra("tab", rtv.getText().toString());
            i.putExtra("Item1", atv1.getText().toString());
            i.putExtra("qty1",et1.getText().toString());
            i.putExtra("Item2", atv2.getText().toString());
            i.putExtra("qty2",et2.getText().toString());
            i.putExtra("Item3", atv3.getText().toString());
            i.putExtra("qty3",et3.getText().toString());
            i.putExtra("Item4", atv4.getText().toString());
            i.putExtra("qty4",et4.getText().toString());
            i.putExtra("Item5", atv5.getText().toString());
            i.putExtra("qty5",et5.getText().toString());
            i.putExtra("Item6", atv6.getText().toString());
            i.putExtra("qty6",et6.getText().toString());
            i.putExtra("Item7", atv7.getText().toString());
            i.putExtra("qty7",et7.getText().toString());
            i.putExtra("Item8", atv8.getText().toString());
            i.putExtra("qty8",et8.getText().toString());

            startActivity(i);



        }




    }
}

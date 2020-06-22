package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class English_locality extends AppCompatActivity{
    EditText address1,address2,landmark,id;
    Spinner c;
    int i,ph;
    Button confirm;
    String name,shop_name,phone,date,_district,_block,add1,add2,lm,city,time;
    boolean flag;
    //ArrayAdapter<String> dataAdapter1,dataAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_english_locality);

        Intent value = getIntent();
        name = value.getStringExtra("name");
        shop_name = value.getStringExtra("shopname");
        phone = value.getStringExtra("phone");
        date = value.getStringExtra("date");
        _district = value.getStringExtra("district");
        _block = value.getStringExtra("block");
        flag = value.getBooleanExtra("flag",false);


     //   s = findViewById(R.id.e_state);
       // c = findViewById(R.id.e_city);
        address1 = findViewById(R.id.e_address1);
        address2 = findViewById(R.id.e_address2);
        landmark = findViewById(R.id.e_landmark);
      //  id = findViewById(R.id.e_id);
        confirm = findViewById(R.id.e3_confirm);

        address1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        address2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        landmark.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});

    /*  s.setOnItemSelectedListener(this);
        list l = new list();
        dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, l.State());
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(dataAdapter1); */
        //c.setOnItemSelectedListener(this);
       // setListCity();
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(Validate())
                    {
                        add1 = address1.getText().toString();
                        add2 = address2.getText().toString();
                        lm = landmark.getText().toString();
                        time = todaydate();
                        //ph = Integer.parseInt(phone);
                        new itemTable(Month()+Year()).execute("");

                        new onlineServer(English_locality.this,name,shop_name,Long.parseLong(phone),_district,_block,add1,add2,lm,city,date,time).execute("");

                      /*  final Runnable RunnableUpdateResults = new Runnable() {
                            public void run() {
                                Toast.makeText(getBaseContext(), "Creating form", Toast.LENGTH_SHORT).show();
                            }
                        };
                        final Handler h = new Handler();
                        new Thread() {
                            public void run() {
                                try {
                                    h.postDelayed(RunnableUpdateResults,50);
                                    join();
                                } catch (InterruptedException e) {e.printStackTrace();}
                            }
                        }.start();*/
                      if(flag) {
                          Intent i = new Intent(getApplicationContext(), English_Sector.class);
                          i.putExtra("id", time);
                          startActivity(i);
                      }
                      else
                      {
                          Intent i = new Intent(getApplicationContext(), English_Sector_Rural.class);
                          i.putExtra("id", time);
                          startActivity(i);
                      }
                    }
                else
                    Toast.makeText(getApplicationContext(),"Enter Address",Toast.LENGTH_SHORT).show();
            }
        });

    }


   /*public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        setPos(position);
        if(i>0)
        city = parent.getItemAtPosition(position).toString();
        else
            city ="";
    }
    public void onNothingSelected(AdapterView<?> arg0) {
    }

    void setPos(int position)
    {
        i = position;
    }
    int getPos()
    {
        return  i;
    }

    void setListCity()
    {
        list l = new list();
        dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, l.City());
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c.setAdapter(dataAdapter2);
    }*/

    boolean Validate()
    {
        if(address1.getText().length() > 0)
            return true;
        else
            return false;
    }

    String todaydate()
    {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String currentDate = s.format(new Date());
        return currentDate;
    }

    String Month()
    {
        SimpleDateFormat s = new SimpleDateFormat("MMM");
        String currentDate = s.format(new Date());
        return currentDate;
    }
    String Year()
    {
        SimpleDateFormat s = new SimpleDateFormat("yyyy");
        String currentDate = s.format(new Date());
        return currentDate;
    }

}

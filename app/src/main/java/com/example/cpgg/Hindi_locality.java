package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

public class Hindi_locality extends AppCompatActivity{
    EditText address1,address2,landmark,id;
    Spinner c;
    int i,ph;
    Button confirm;
    boolean flag;
    String name,shop_name,phone,date,_district,_block,add1,add2,lm,city,time;
   // ArrayAdapter<String> dataAdapter1,dataAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hindi_locality);

        Intent value = getIntent();
        name = value.getStringExtra("name");
        shop_name = value.getStringExtra("shopname");
        phone = value.getStringExtra("phone");
        date = value.getStringExtra("date");
        _district = value.getStringExtra("district");
        _block = value.getStringExtra("block");
        flag = value.getBooleanExtra("flag",false);


        //  s = findViewById(R.id.h_state);
       // c = findViewById(R.id.h_city);
        address1 = findViewById(R.id.h_address1);
        address2 = findViewById(R.id.h_address2);
        landmark = findViewById(R.id.h_landmark);
      //  pincode = findViewById(R.id.h_pincode);
        confirm = findViewById(R.id.h3_confirm);
        address1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        address2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        landmark.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});

        // c.setOnItemSelectedListener(this);
        /*  s.setOnItemSelectedListener(this);

        list_h l = new list_h();
        dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, l.State());
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(dataAdapter1);*/
        //setListCity();

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(Validate()) {
                        add1 = convertStringToUTF8(address1.getText().toString());
                        add2 = convertStringToUTF8(address2.getText().toString());
                        lm = convertStringToUTF8(landmark.getText().toString());
                        time = todaydate();
                        //ph = Integer.parseInt(phone);
                        new itemTable(Month()+Year()).execute("");

                         new onlineServer(Hindi_locality.this,name,shop_name,Long.parseLong(phone),_district,_block,add1,add2,lm,city,date,time).execute("");
                        if (flag) {
                            Intent i = new Intent(getApplicationContext(), Hindi_Sector.class);
                            i.putExtra("id", time);
                            startActivity(i);
                        }
                        else {
                            Intent i = new Intent(getApplicationContext(), Hindi_Sector_Rural.class);
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
            city = "";
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
        list_h l = new list_h();
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

    public static String convertStringToUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
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

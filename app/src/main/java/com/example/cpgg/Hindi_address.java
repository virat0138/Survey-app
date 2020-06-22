package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Hindi_address extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button urban, rural, confirm, next;
    Spinner d, b;
    int i,j;
    String name,shop_name,phone,date,_district,_block;
    boolean flag;
    ArrayAdapter<String> dataAdapter1,dataAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_hindi_address);

        Intent value = getIntent();
        name = value.getStringExtra("name");
        shop_name = value.getStringExtra("shopname");
        phone = value.getStringExtra("phone");
        date = value.getStringExtra("date");

        list_h l = new list_h();
        d = findViewById(R.id.h_district);
        b = findViewById(R.id.h_block);

        d.setOnItemSelectedListener(this);
        b.setOnItemSelectedListener(this);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, l.District());
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        d.setAdapter(dataAdapter);


        rural = findViewById(R.id.h_rural);
        urban = findViewById(R.id.h_urban);
        confirm = findViewById(R.id.h2_confirm);
        next = rural;
        urban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urban.setBackground(getDrawable(R.drawable.slider_r));
                rural.setBackground(getDrawable(R.drawable.deselect_u));
                setListNagar();
                next = urban;
                flag = true;


            }
        });
        rural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rural.setBackground(getDrawable(R.drawable.slider));
                urban.setBackground(getDrawable(R.drawable.deselect_r));
                setListBlock();
                next = rural;
                flag = false;
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listValidate())
                {
                    Intent i = new Intent(getApplicationContext(),Hindi_locality.class);
                    i.putExtra("name",name);
                    i.putExtra("shopname",shop_name);
                    i.putExtra("phone",phone);
                    i.putExtra("date", date);
                    i.putExtra("district",_district);
                    i.putExtra("block",_block);
                    i.putExtra("flag", flag);

                    startActivity(i);
                }
                else
                    Toast.makeText(getApplicationContext(),"Make your selection",Toast.LENGTH_SHORT).show();


            }
        });



    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        list l = new list();
        switch (parent.getId()) {
            case R.id.h_district:   setPos(position);
                _district = l.District().get(position);
                //_district = convertStringToUTF8(parent.getItemAtPosition(position).toString());
                switch (next.getId()) {
                    case R.id.h_rural:
                        setListBlock();
                        break;

                    case R.id.h_urban:
                        setListNagar();
                }
                break;
            case R.id.h_block:   setPosJ(position);
                         switch (next.getId()) {
                        case R.id.h_rural:
                        _block = l.Block(i).get(position);
                        break;
                        case R.id.h_urban:
                        //setListNagar();
                        _block = l.Nagar(i).get(position);

                }
                 //_block = l.Block(i).get(position);
                // _block = convertStringToUTF8(parent.getItemAtPosition(position).toString());
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
    }

    void setPos(int position)
    {
        i = position;
    }
    int getPos()
    {
        return i;
    }

    void setPosJ(int position)
    {
        j = position;
    }
    int getPosJ()
    {
        return  j;
    }

    void setListBlock()
    {
        list_h l =new list_h();
        dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, l.Block(getPos()));
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b.setAdapter(dataAdapter2);
    }

    void setListNagar()
    {
        list_h l = new list_h();
        dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, l.Nagar(getPos()));
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b.setAdapter(dataAdapter1);
    }

    boolean listValidate()
    {
        if(i > 0 && j > 0)
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
}

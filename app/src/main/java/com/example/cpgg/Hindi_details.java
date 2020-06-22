package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hindi_details extends AppCompatActivity {
    EditText name,shop_name,phone;
    TextView date;
    Button confirm;
    CheckBox today;
    DatePickerDialog.OnDateSetListener onDateSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_hindi_details);
        name = findViewById(R.id.h_name);
        shop_name = findViewById(R.id.h_shop_name);
        phone = findViewById(R.id.h_phone_no);
        date = findViewById(R.id.h_date);
       // today = findViewById(R.id.h_today);
        confirm = findViewById(R.id.h1_confirm);
        todaydate();
        name.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        shop_name.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        phone.setFilters(new InputFilter[]{new DigitsInputFilter(10, 0, 9999999999.00)});


        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int date = cal.get(Calendar.DAY_OF_MONTH);
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);

                DatePickerDialog dialog = new DatePickerDialog(Hindi_details.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        onDateSetListener,year,month,date);
                dialog.getDatePicker().findViewById(Resources.getSystem().getIdentifier("day", "id", "android")).setVisibility(View.GONE);
                dialog.getDatePicker().setMinDate(calendar.getTimeInMillis());
                dialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month++;
                if(month<10)
                    date.setText("0"+month +"/" +year);
                else
                    date.setText(month +"/" +year);
            }
        };



       // today.setOnCheckedChangeListener(new Chk_class());

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (fieldValidate()) {
                    if (name.getText().toString().matches("^[A-Za-z ]+")) {
                        if (shop_name.getText().toString().matches("^[A-Za-z ]+")) {
                    if (phone.getText().toString().matches("[0-9]+") && phone.getText().length() == 10) {

                            Intent i = new Intent(getApplicationContext(), Hindi_address.class);

                            i.putExtra("name", convertStringToUTF8(name.getText().toString()));
                            i.putExtra("shopname", convertStringToUTF8(shop_name.getText().toString()));
                            i.putExtra("phone", phone.getText().toString());
                            i.putExtra("date", date.getText().toString());

                            startActivity(i);

                    }
                    else
                    Toast.makeText(getApplicationContext(), "Invalid Number", Toast.LENGTH_SHORT).show();
                        } else
                            Toast.makeText(getApplicationContext(), "Invalid Shop Name", Toast.LENGTH_SHORT).show();
                    }       else
                        Toast.makeText(getApplicationContext(), "Invalid Name", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "All fields are mandatory", Toast.LENGTH_SHORT).show();
            }
        });
    }


    class Chk_class implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if(today.isChecked())
            {
                date.setEnabled(false);
                todaydate();
            }
            else
            {
                date.setEnabled(true);
                date.setText(null);
            }
        }


    }


    boolean fieldValidate()
    {

        if (name.getText().length() > 0 && shop_name.getText().length() > 0 && phone.getText().length() > 0 && phone.getText().length() > 0)
            return true;
        else
            return false;
    }

    void todaydate()
    {
        SimpleDateFormat s = new SimpleDateFormat("MM/yyyy");
        String currentDate = s.format(new Date());
        date.setText(currentDate);
    }

    boolean isValideDate(String date)
    {
        SimpleDateFormat s = new SimpleDateFormat("MM/yyyy");
        Date testDate = null;

        try{
            testDate = s.parse(date);
        }
        catch (ParseException e)
        {
            return false;
        }
        if(!s.format(testDate).equals(date))
        {
            return  false;
        }
        return true;
    }


    public static String convertUTF8ToString(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("ISO-8859-1"), "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
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

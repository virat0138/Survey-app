package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class English_Sector_Rural4 extends AppCompatActivity {
    CheckBox c[];
    HorizontalScrollView h[];
    int totalCheckBox;
    public final int start = 8;
    public final int end = 11;
    String phone;
    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_english__sector__rural4);


        totalCheckBox = 21;
        c = new CheckBox[totalCheckBox];
        h = new HorizontalScrollView[totalCheckBox];
        for (int i = start; i < end; i++) {
            c[i] = new CheckBox(this);
            h[i] = new HorizontalScrollView(this);
        }
        Intent in = getIntent();
        phone = in.getStringExtra("id");

        confirm = findViewById(R.id.e4_confirm_4);

        for (int i = start; i < end; i++) {
            c[i] = findViewById(getResources().getIdentifier("r_sector" + i, "id", getPackageName()));
            h[i] = findViewById(getResources().getIdentifier("r_table" + i, "id", getPackageName()));
            c[i].setText(new list().head_rural_sector().get(i));
            c[i].setOnCheckedChangeListener(new Chk_class());
        }

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enterData();
                Intent i = new Intent(getApplicationContext(), English_Sector_Rural5.class);
                i.putExtra("id",phone);
                startActivity(i);
            }
        });
    }

    class Chk_class implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            for (int i = start; i < end; i++) {
                if (c[i].isChecked()) {
                    h[i].setVisibility(View.VISIBLE);
                    setTable(i);
                } else
                    h[i].setVisibility(View.GONE);
            }
        }


    }

    void removeSuggestion()
    {
        EditText t;
        for(int i=234;i<266;i++)
        {
            t = findViewById(getResources().getIdentifier("r_e_suggestion" + i, "id", getPackageName()));
            t.setVisibility(View.GONE);
        }
    }


    void setTable(int n)
    {
        EditText t6,t7,t8;
        int add[] = {0,144,162,172,192,196,210,223,233,247,260,265,284,288,310,327,331,343,348,351,356};
        TextView t[] = new TextView[5];
        for(int i=0;i<5;i++)
            t[i] = new TextView(this);
        String name[] = {"r_e_sno","r_e_code","r_e_name","r_e_type","r_e_quantity","r_e_rate","r_e_suggestion","r_e_shopname"};
        List<ArrayList<String>> put = new list().rural_sector(n);

        for(int i=1;i<=put.size();i++) {
            int extra = add[n] + i;
            for (int j = 0; j < 5 ; j++) {
                t[j] = findViewById(getResources().getIdentifier(name[j] + extra , "id", getPackageName()));
                t[j].setText(put.get(i-1).get(j));
            }
        }

    }
    //(put.get(i-1).size()-3)
    void enterData() {

        EditText e[] = new EditText[3];
        int add[] = {0, 9, 11, 12, 16, 21, 31, 46, 53, 57, 61, 64, 68, 71, 79, 82, 83, 86, 106, 107, 112, 116, 118};
        TextView t[] = new TextView[5];
        for (int i = 0; i < 5; i++)
            t[i] = new TextView(this);
        for (int i = 0; i < 3; i++)
            e[i] = new EditText(this);

        String addRow[] = new String[8];
        String name[] = {"e_sno", "e_code", "e_name", "e_type", "e_quantity", "e_rate", "e_suggestion", "e_shopname"};

        for (int k = start; k < end; k++) {
            if (c[k].isChecked()) {
                List<ArrayList<String>> put = new list().sector_urban(k);
                for (int i = 1; i <= put.size(); i++) {
                    int extra = add[k] + i;
                    for (int j = 0; j < (put.get(i - 1).size()); j++) {
                        if (j < 5) {
                            t[j] = findViewById(getResources().getIdentifier(name[j] + extra, "id", getPackageName()));
                            addRow[j] = t[j].getText().toString();
                        } else {
                            e[j-5] = findViewById(getResources().getIdentifier(name[j] + extra, "id", getPackageName()));
                            addRow[j] = e[j-5].getText().toString();
                        }
                    }
                    new onlineTableRow(English_Sector_Rural4.this,phone, addRow[0], addRow[1], addRow[2], addRow[3], addRow[4],addRow[5], addRow[6], addRow[7]).execute("");
                    // Integer.parseInt(addRow[0])
                }
            }
        }
    }
}

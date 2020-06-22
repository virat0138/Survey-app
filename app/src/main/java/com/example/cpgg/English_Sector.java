package com.example.cpgg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class English_Sector extends AppCompatActivity {
    CheckBox c[];
    HorizontalScrollView h[];
    int totalCheckBox;
    Button confirm;
    String phone;
    EditText sug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_english__sector);

        Intent value = getIntent();
        phone = value.getStringExtra("id");
        removeSuggestion();
        totalCheckBox = 23;
        c = new CheckBox[totalCheckBox];
        h = new HorizontalScrollView[totalCheckBox];
        confirm = findViewById(R.id.e4_confirm);
        for (int i = 0; i < totalCheckBox; i++) {
            c[i] = new CheckBox(this);
            h[i] = new HorizontalScrollView(this);
        }
        List<String> Eatable = new list().getCatogeries();

        for (int i = 0; i < totalCheckBox; i++) {
            c[i] = findViewById(getResources().getIdentifier("sector" + i, "id", getPackageName()));
            h[i] = findViewById(getResources().getIdentifier("table" + i, "id", getPackageName()));
            c[i].setText(Eatable.get(i));
            c[i].setOnCheckedChangeListener(new Chk_class());
        }

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  new onlineTable().execute("");
                EditText el[] = new EditText[3];
                int add[] = {0, 9, 11, 12, 16, 21, 31, 46, 53, 57, 61, 64, 68, 71, 79, 82, 83, 86, 106, 107, 112, 116, 118};
                for (int i = 0; i < totalCheckBox; i++) {
                    if (c[i].isChecked()) {
                        List<ArrayList<String>> put = new list().sector_urban(i);
                        String addRow[] = new String[8];
                        for (int j = 0; j < put.size(); j++) {
                            for (int k = 0; k < put.get(j).size(); k++) {
                                addRow[k] = put.get(j).get(k);
                            }
                            new onlineTableRow(phone, Integer.parseInt(addRow[0]), Integer.parseInt(addRow[1]), addRow[2], addRow[3], addRow[4], Float.parseFloat(addRow[5]), addRow[6], addRow[7]).execute("");
                        }
                    }
                }*/



                        enterData();
                        Intent i = new Intent(getApplicationContext(), Last_page.class);
                        i.putExtra("id",phone);
                        startActivity(i);

            }
        });


        // dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // b.setAdapter(dataAdapter1);

    }


    class Chk_class implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            for (int i = 0; i < totalCheckBox; i++) {
                if (c[i].isChecked()) {
                    confirm.setEnabled(true);
                    h[i].setVisibility(View.VISIBLE);
                    setTable(i);
                } else
                    h[i].setVisibility(View.GONE);
            }
        }


    }

    class Suggestion_class implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            String name = getResources().getResourceEntryName(buttonView.getId()).substring(10);
            EditText e = findViewById(getResources().getIdentifier("e_suggestion" + name , "id", getPackageName()));
            if (isChecked) {
                    confirm.setEnabled(true);
                    e.setVisibility(View.VISIBLE);
                } else
                    e.setVisibility(View.GONE);

        }


    }


    void setTable(int n) {
        EditText e[] = new EditText[3];
        int add[] = {0, 9, 11, 12, 16, 21, 31, 46, 53, 57, 61, 64, 68, 71, 79, 82, 83, 86, 106, 107, 112, 116, 118};
        TextView t[] = new TextView[5];
        for (int i = 0; i < 5; i++)
            t[i] = new TextView(this);
        String name[] = {"e_sno", "e_code", "e_name", "e_type", "e_quantity", "e_rate", "e_suggestion", "e_shopname"};
        List<ArrayList<String>> put = new list().sector_urban(n);

        for (int i = 1; i <= put.size(); i++) {
            int extra = add[n] + i;
            for (int j = 0; j < (put.get(i - 1).size() - 3); j++) {
                t[j] = findViewById(getResources().getIdentifier(name[j] + extra, "id", getPackageName()));
                t[j].setText(put.get(i - 1).get(j));
                CheckBox c = findViewById(getResources().getIdentifier(name[7] + extra, "id", getPackageName()));
                c.setOnCheckedChangeListener(new Suggestion_class());
                EditText check = findViewById(getResources().getIdentifier(name[5] + extra , "id", getPackageName()));
                check.setFilters(new InputFilter[]{new DigitsInputFilter(5, 2, 99999.99)});
                sug = findViewById(getResources().getIdentifier(name[6] + extra , "id", getPackageName()));
                sug.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20),
                        new InputFilter() {
                            public CharSequence filter(CharSequence src, int start,
                                                       int end, Spanned dst, int dstart, int dend) {
                                if(src.equals("")){ // for backspace
                                    return src;
                                }
                                if(src.toString().matches("[a-zA-Z ]+")){
                                    return src;
                                }
                                return sug.getText().toString();
                            }
                        }});
                /*sug.setFilters(new InputFilter[] {
                        new InputFilter() {
                            public CharSequence filter(CharSequence src, int start,
                                                       int end, Spanned dst, int dstart, int dend) {
                                if(src.equals("")){ // for backspace
                                    return src;
                                }
                                if(src.toString().matches("[a-zA-Z ]+")){
                                    return src;
                                }
                                return sug.getText().toString();
                            }
                        }
                });*/

            }
        }

    }

    boolean checker(){

        int add[] = {0, 9, 11, 12, 16, 21, 31, 46, 53, 57, 61, 64, 68, 71, 79, 82, 83, 86, 106, 107, 112, 116, 118};


        for (int k = 0; k < totalCheckBox; k++) {
            if (c[k].isChecked()) {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();Toast.makeText(getApplicationContext(),"Help",Toast.LENGTH_SHORT).show();
                List<ArrayList<String>> put = new list().sector_urban(k);
                for (int i = 1; i <= put.size(); i++) {
                    int extra = add[k] + i;
                    EditText ed = findViewById(getResources().getIdentifier("e_suggestion" + extra, "id", getPackageName()));
                    if(ed.getText().toString().matches("[$&+:;=?@#|'<>.-^*()%!]"))
                    {
                        Toast.makeText(getApplicationContext(),"Help",Toast.LENGTH_SHORT).show();
                     return false;
                }
                }
            }
        }
        return true;
    }

    void enterData() {
        //new onlineTable(phone).execute("");
        EditText e[] = new EditText[3];
  int add[] = {0, 9, 11, 12, 16, 21, 31, 46, 53, 57, 61, 64, 68, 71, 79, 82, 83, 86, 106, 107, 112, 116, 118};

        TextView t[] = new TextView[5];
        for (int i = 0; i < 5; i++)
            t[i] = new TextView(this);
        for (int i = 0; i < 3; i++)
            e[i] = new EditText(this);

        String addRow[] = new String[8];
        String name[] = {"e_sno", "e_code", "e_name", "e_type", "e_quantity", "e_rate", "e_suggestion", "e_shopname"};

        for (int k = 0; k < totalCheckBox; k++) {
            if (c[k].isChecked()) {
                List<ArrayList<String>> put = new list().sector_urban(k);
                for (int i = 1; i <= put.size(); i++) {
                    int extra = add[k] + i;
                    for (int j = 0; j < (put.get(i - 1).size())-1; j++) {
                        if (j < 5) {
                            t[j] = findViewById(getResources().getIdentifier(name[j] + extra, "id", getPackageName()));
                            addRow[j] = t[j].getText().toString();
                        } else {
                            e[j-5] = findViewById(getResources().getIdentifier(name[j] + extra, "id", getPackageName()));
                            addRow[j] = e[j-5].getText().toString();
                        }
                    }

                   new onlineTableRow(English_Sector.this,phone, addRow[0], addRow[1], addRow[2], addRow[3], addRow[4],addRow[5], addRow[6], addRow[7]).execute("");
                   // Integer.parseInt(addRow[0])
                }
            }
        }
    }

    void removeSuggestion()
    {
        EditText t;
        CheckBox c;
        TextView t1,t2,t3,t4,s;
        for(int i=1;i<126;i++) {
            t = findViewById(getResources().getIdentifier("e_suggestion" + i, "id", getPackageName()));
            c = findViewById(getResources().getIdentifier("e_shopname" + i, "id", getPackageName()));
            t1 = findViewById(getResources().getIdentifier("e_code" + i, "id", getPackageName()));
            t.setVisibility(View.GONE);
            t1.setVisibility(View.GONE);
            c.setVisibility(View.GONE);
            s = findViewById(getResources().getIdentifier("e_sno" + i, "id", getPackageName()));
            s.setVisibility(View.GONE);
            int o = getResources().getConfiguration().orientation;
            if (o == Configuration.ORIENTATION_PORTRAIT) {
                t2 = findViewById(getResources().getIdentifier("e_name" + i, "id", getPackageName()));
                t2.setWidth(250);
                t3 = findViewById(getResources().getIdentifier("e_type" + i, "id", getPackageName()));
                t3.setWidth(170);
                t4 = findViewById(getResources().getIdentifier("e_quantity" + i, "id", getPackageName()));
                t4.setWidth(120);
            }
        }
    }
    boolean checkLimit()
    {
        EditText e[] = new EditText[3];
        int add[] = {0, 9, 11, 12, 16, 21, 31, 46, 53, 57, 61, 64, 68, 71, 79, 82, 83, 86, 106, 107, 112, 116, 118};
        TextView t[] = new TextView[5];
        for (int i = 0; i < 5; i++)
            t[i] = new TextView(this);
        for (int i = 0; i < 3; i++)
            e[i] = new EditText(this);


        String addRow[] = new String[8];
        String name[] = {"e_sno", "e_code", "e_name", "e_type", "e_quantity", "e_rate", "e_suggestion", "e_shopname"};

        for (int k = 0; k < totalCheckBox; k++) {
            if (c[k].isChecked()) {
                List<ArrayList<String>> put = new list().sector_urban(k);
                for (int i = 1; i <= put.size(); i++) {
                    int extra = add[k] + i;
                            EditText check = findViewById(getResources().getIdentifier(name[5] + extra, "id", getPackageName()));
                            String s = check.getText().toString();
                            if(s.length() > 0) {
                                double r = Double.parseDouble(s);
                                if (r > 999999.99 || r < 0.00)
                                    return false;
                            }
                    }
                    //new onlineTableRow(English_Sector.this,phone, addRow[0], addRow[1], addRow[2], addRow[3], addRow[4],addRow[5], addRow[6], addRow[7]).execute("");
                    // Integer.parseInt(addRow[0])
                }
            }
        return true;


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        new deletedata(phone).execute("");
    }
}

package com.example.cpgg;


import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class onlineServer extends AsyncTask<String,String,String> {

    EditText t;
    ResultSet r;
        Long phone;
        Context activity;
    final int id = 10;
    String name,shop_name,district,block,add1,add2,lm,city,date,fno,time;
    final String table = "SURVEY";
    private final String database = "sql12345672";
    private final String databaseform = "sql12345672";
    private final String url = "jdbc:mysql://sql12.freemysqlhosting.net/" + database;
    private final String urlform = "jdbc:mysql://sql12.freemysqlhosting.net/" + databaseform;
    private final String username = "sql12345672";
    private final String password = "jN7jsHQ13q";
    String msg;
    boolean flag;
    list h;

    onlineServer(Context c,String name, String shop_name,long phone, String district, String block, String add1, String add2, String lm, String city,String date,String time) {
        activity = c;
        flag = true;
        this.date = date;
        this.name = name;
                this.shop_name = shop_name;
                this.phone = phone;
                        this.district =district;
                        this.block =block;
                        this.add1 =add1;
                        this.add2 =add2;
                        this.lm =lm;
                        this.city =city;
                        this.time = time;
                        h = new list();
    }



    @Override
    protected void onPreExecute() {
    }

    protected String doInBackground(String... strings) {
        msg = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection == null) {
                msg = "Connection failed! Retry";
            } else {
                Statement statement = connection.createStatement();
                String query1;
                if(block.length()<16)
                query1 = "INSERT INTO "+table+"(phone_number, name,shop_name,address_1,address_2,landmark,district,block,month,Start_Time) VALUES (" + phone + ",\'" + name  + "\',\'" + shop_name  + "\',\'" + add1+ "\',\'" + add2 + "\',\'" + lm   + "\',(SELECT district_id FROM DISTRICT WHERE district_name=\'"+district+"\'),(SELECT block_id FROM BLOCK WHERE district_id = (SELECT district_id FROM DISTRICT WHERE district_name=\'"+district+"\') AND block_name = \'"+block+"\'),\'"+ date + "\',\'"+time+"\');";
                else
                query1 = "INSERT INTO "+table+"(phone_number, name,shop_name,address_1,address_2,landmark,district,nagar,month,Start_Time) VALUES (" + phone + ",\'" + name  + "\',\'" + shop_name  + "\',\'" + add1+ "\',\'" + add2 + "\',\'" + lm   + "\',(SELECT district_id FROM DISTRICT WHERE district_name=\'"+district+"\'),(SELECT nagar_id FROM NAGARPALIKA WHERE district_id = (SELECT district_id FROM DISTRICT WHERE district_name=\'"+district+"\') AND name = \'"+block+"\'),\'"+ date + "\',\'"+time+"\');";

              String query2 = "SELECT form FROM "+table+ " WHERE Start_Time = \'"+time+"\'";


                statement.executeUpdate(query1);
               r =  statement.executeQuery(query2);

              if(r != null)
               {
                       try {
                           r.next();
                           fno = r.getString(1);

                       } catch (Exception e) {
                           e.printStackTrace();
                         // msg = "" + e;
                       }

               }
             // else
                //   msg = "Not found";
               // query2 = "UPDATE "+table+" SET form = 'SNO"+ fno +"' WHERE key_number = " + Integer.parseInt(fno);
             //  statement.executeUpdate(query2);

              /* connection.close();
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(urlform, username, password);*/

               // String query3 =  "CREATE TABLE SNO" + fno  + " (S_NO VARCHAR(4), CODE_NO VARCHAR(10), ITEM_NAME VARCHAR(30), TYPE VARCHAR(50), QUANTITY VARCHAR(50), PRICE VARCHAR(10), SUGGESTION VARCHAR(100))";
               // statement.executeUpdate(query3);

                msg = "SurveyForm ID " + fno;
            }
            connection.close();

        } catch (Exception e) {
            msg = "" + e;
            //msg = "Access Denied by Server! Retry";
        }
        return msg;
    }


    @Override
    protected void onPostExecute(String s) {
        //showToast(msg);
       // t.setText("SFORM"+fno);
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }

   /* public void showToast(final String toast)
    {
        runOnUiThread(() -> Toast.makeText(English_locality.this, toast, Toast.LENGTH_SHORT).show());
    }*/

}

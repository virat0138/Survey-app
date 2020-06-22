package com.example.cpgg;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class onlineTableRow extends AsyncTask<String,String,String> {
    ResultSet r;
    EditText t;
    Context activity;
    String SNo;
    String CodeNo;
    String iteam;
    String type;
    String criteria;
    String cost;
    String selected_shop;
    String remark;
    String name,enter,time;
    boolean flag;
    final String table = "SURVEY";
    private final String database = "sql12345672";
    private final String url = "jdbc:mysql://sql12.freemysqlhosting.net/"+ database;
    private final String username = "sql12345672";
    private final String password = "jN7jsHQ13q";

    String msg;


    onlineTableRow(Context activity,String table_name,String SNo, String CodeNo, String iteam, String type, String criteria, String cost,String remark, String selected_shop){
        this.activity = activity;
        this.SNo= SNo;
        this.CodeNo = CodeNo;
        this.iteam = iteam;
        this.type = type;
        this.criteria = criteria;
        this.cost = cost;
        this.selected_shop = selected_shop;
        this.remark = remark;
        this.time = table_name;
        enter = Month() + Year();
        //    this.t = t;
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


                /*if(flag)
                {
                    flag = false;
                   query =  "CREATE TABLE IF NOT EXISTS" + table_name  + "(S_NO INTEGER PRIMARY KEY, CODE_NO INTEGER, ITEM_NAME VARCHAR(50), TYPE VARCHAR(50) ,QUANTITY VARCHAR(50),PRICE DECIMAL(8,2),SUGGESTION VARCHAR(100),EXTRA VARCHAR(100))";
                    statement.executeUpdate(query);
                } */
                String query2 = "SELECT form FROM " + table +" WHERE Start_Time = \'"+time+"\'";


                Statement statement = connection.createStatement();
                r =  statement.executeQuery(query2);

                if(r != null)
                {
                    try {
                        r.next();
                        name = r.getString(1);

                    } catch (Exception e) {
                        e.printStackTrace();
                        //   msg = "" + e;
                    }

                }
                String query = "INSERT INTO "+enter+"(SFORM, CODE_NO,PRICE) VALUES (\'"+name+"\',\'" + CodeNo + "\',\'" + cost + "\')";

                statement.executeUpdate(query);
                msg = "Uploading";
            }
            connection.close();

        } catch (Exception e) {
            msg = "" + e;
           // msg = "Access Denied by Server! Retry";
        }
        return msg;
    }

    @Override
    protected void onPostExecute(String s) {
        //Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show();
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

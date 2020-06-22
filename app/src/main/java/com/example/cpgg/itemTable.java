package com.example.cpgg;

import android.os.AsyncTask;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class itemTable extends AsyncTask<String,String,String> {

    String table,msg;
    private final String database = "sql12345672";
    private final String url = "jdbc:mysql://sql12.freemysqlhosting.net/" + database;
    private final String username = "sql12345672";
    private final String password = "jN7jsHQ13q";
    itemTable(String name)
    {
        table = name;
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

                String query = "CREATE TABLE "+table+"(SFORM VARCHAR(12), CODE_NO VARCHAR(10), PRICE decimal(6,2))";
                statement.executeUpdate(query);

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
        //Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }
}

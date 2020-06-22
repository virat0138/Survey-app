package com.example.cpgg;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cpgg.list;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class uploadData extends AsyncTask<String,String,String> {


    final String state = "Uttarakhand";
    private final String url = "jdbc:mysql://sql12.freemysqlhosting.net/sql12345672";
    private final String username = "sql12345672";
    private final String password = "jN7jsHQ13q";
    private final String database = "sql12345672";
    //private final String tablename = "CPGG";
    String msg;
    list h;
    Context activity;

        uploadData(Context t)
        {
            activity = t;
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
                int c = 0;
                String query;
                Statement statement = connection.createStatement();

                query = "CREATE TABLE DISTRICT(district_id int AUTO_INCREMENT, district_name VARCHAR(20),PRIMARY KEY(district_id));";
                statement.executeUpdate(query);
                query = "CREATE TABLE BLOCK(district_id int, block_id int AUTO_INCREMENT, block_name varchar(20), PRIMARY KEY (block_id),CONSTRAINT FOREIGN KEY(district_id) REFERENCES DISTRICT(district_id))";
                statement.executeUpdate(query);
                query = "CREATE TABLE NAGARPALIKA(district_id int, nagar_id int AUTO_INCREMENT, name varchar(40), PRIMARY KEY (nagar_id),CONSTRAINT FOREIGN KEY(district_id) REFERENCES DISTRICT(district_id));";
                statement.executeUpdate(query);

                query = "CREATE TABLE ITEMCATEGORY(category_id int AUTO_INCREMENT, category_name varchar(100),PRIMARY KEY (category_id));";
                statement.executeUpdate(query);

                query = "CREATE TABLE SHOPKEEPER(shopkeeper_id int,  shopkeeper_name varchar(20), unique_code int, PRIMARY KEY (shopkeeper_id));";
                statement.executeUpdate(query);

                query = "CREATE TABLE DATA(shopkeeper_id int, data_field VARCHAR(50),FOREIGN KEY (shopkeeper_id) REFERENCES SHOPKEEPER(shopkeeper_id));";
                statement.executeUpdate(query);

                query = "CREATE TABLE ITEMS(category_id int, item_code int, item_name_eng varchar(30),item_name_hin varchar(30), unit VARCHAR(20),FOREIGN KEY (category_id) REFERENCES ITEMCATEGORY(category_id));";
                statement.executeUpdate(query);

                query = "CREATE TABLE SURVEY(name VARCHAR(20),phone_number BIGINT, form int NOT NULL AUTO_INCREMENT PRIMARY KEY , shop_name VARCHAR(50), address_1 VARCHAR(50),address_2 VARCHAR(50), landmark VARCHAR(50), nagar int, block int, district int , month VARCHAR(30), Start_Time TIMESTAMP NULL,End_Time TIMESTAMP NULL, geo_location POINT, image longblob, CONSTRAINT FOREIGN KEY(district) REFERENCES DISTRICT(district_id));";
               // (phone_number, name,shop_name,address_1,address_2,landmark,city,district,block,month)
               //query = "CREATE TABLE SURVEYDATA(record_id int, shopkeeper_id int, start_time varchar(20), category_id int, item_id int , price int, suggestion varchar(70) , end_time timestamp , gps_location decimal , photo_id text, PRIMARY KEY (record_id), FOREIGN KEY (shopkeeper_id) REFERENCES SHOPKEEPER(shopkeeper_id), FOREIGN KEY (category_id) REFERENCES ITEMCATEGORY(category_id),FOREIGN KEY (item_id) REFERENCES ITEMS(itemt_id));";
                statement.executeUpdate(query);


                // String query1 = "INSERT INTO CPGG(phone_number, name,shop_name,address_1,address_2,landmark,state,city,district,block,month) VALUES (" + phone + ",\'" + name  + "\',\'" + shop_name  + "\',\'" + add1+ "\',\'" + add2 + "\',\'" + lm   + "\',\'" + state + "\',\'" + city+ " \',\'" +district + "\',\'" +block+ "\',\'"+ date + "\');";
                //  String query2 = "SELECT key_number FROM CPGG ORDER BY key_number DESC";

                for (int i = 1; i < h.District().size(); i++) {

                    query = "INSERT INTO DISTRICT(district_name) VALUES ( \'" + h.District().get(i) + "\');";
                    statement.executeUpdate(query);

                }
                for (int i = 1; i < h.District().size(); i++) {
                    List<String> l = h.Block(i);
                    for (int j = 0; j < l.size(); j++) {
                        c++;
                        query = "INSERT INTO BLOCK(district_id,block_name) VALUES (" + i + ",\'" + l.get(j) + "\');";
                        statement.executeUpdate(query);
                    }
                }
                c = 0;
                for (int i = 1; i < h.District().size(); i++) {
                    List<String> l = h.Nagar(i);
                    for (int j = 0; j < l.size(); j++) {
                        c++;
                        query = "INSERT INTO NAGARPALIKA(district_id,name) VALUES (" + i + ",\'" + l.get(j) + "\');";
                        statement.executeUpdate(query);
                    }
                }
                for (int i = 0; i < h.getCatogeries().size(); i++) {

                    query = "INSERT INTO ITEMCATEGORY(category_name) VALUES (\'" + h.getCatogeries().get(i) + "\');";
                    statement.executeUpdate(query);

                }
                for (int i = 0; i < h.head_rural_sector().size(); i++) {

                    query = "INSERT INTO ITEMCATEGORY(category_name) VALUES (\'" + h.head_rural_sector().get(i) + "\');";
                    statement.executeUpdate(query);

                }

                for(int i=0; i<h.getCatogeries().size();i++) {
                    List<ArrayList<String>> l1 = new list().sector_urban(i);
                    List<ArrayList<String>> l2 = new list_h().sector_urban(i);
                    for (int j = 0; j < l1.size(); j++) {
                        query = "INSERT INTO ITEMS(category_id, item_code, item_name_eng ,item_name_hin, unit) VALUES("+(i+1)+",\'"+l1.get(j).get(1)+"\',\'"+l1.get(j).get(2)+"\',\'"+convertStringToUTF8(l2.get(j).get(2))+"\',\'"+l1.get(j).get(4)+"\') ";
                        statement.executeUpdate(query);
                    }
                }
                for(int i=0; i<h.head_rural_sector().size();i++) {
                    List<ArrayList<String>> l1 = new list().rural_sector(i);
                    List<ArrayList<String>> l2 = new list_h().rural_sector(i);
                    for (int j = 0; j < l1.size(); j++) {
                        query = "INSERT INTO ITEMS(category_id, item_code, item_name_eng ,item_name_hin, unit) VALUES("+(i+24)+",\'"+l1.get(j).get(1)+"\',\'"+l1.get(j).get(2)+"\',\'"+convertStringToUTF8(l2.get(j).get(2))+"\',\'"+l1.get(j).get(4)+"\') ";
                        statement.executeUpdate(query);
                    }
                }

            }
            connection.close();

        } catch (Exception e) {
            //msg = "" + e;
             msg = "Access Denied by Server! Retry";
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

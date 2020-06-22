package com.example.cpgg;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class uploadImage  extends AsyncTask<String,String,String> {
    String msg,image,fno,id;
    Location loc;
    ResultSet r;
    Context activity;
    final String table = "SURVEY";
    private final String database = "sql12345672";
    private final String url = "jdbc:mysql://sql12.freemysqlhosting.net/"+database;
    private final String username = "sql12345672";
    private final String password = "jN7jsHQ13q";
    private final String tablename = "SURVEY";

    uploadImage(Context t, String i, Location l,String id)
    {
        image = i;
        loc = l;
        activity = t;
        this.id = id;
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
                double l[] = getlocation(loc);
                fno = "1";
                String query1 = "SELECT form FROM " + table + " WHERE Start_Time =\'"+id+"\'";
                //String query1 = "SELECT key_number FROM" + tablename + " ORDER BY key_number DESC";
                Statement statement = connection.createStatement();

                r = statement.executeQuery(query1);

                if (r != null) {
                    try {
                        r.next();
                        fno = r.getString(1);

                    } catch (Exception e) {
                        e.printStackTrace();
                          msg = "" + e;
                    }

                }



                String query2 = "UPDATE " + tablename + " SET geo_location = POINT(" + l[0] + "," + l[1] + ") , image = '" + image + "',End_Time = '"+ todaydate() +"' WHERE form = " + Integer.parseInt(fno);
                statement.executeUpdate(query2);
                msg = "" + id;
            }
                connection.close();
                //notifyAll();

        } catch (Exception e) {
              msg = "" + e;
            // msg = "Access Denied by Server! Retry";
        }
        return msg;
    }


    @Override
    protected void onPostExecute(String s) {
        //showToast(msg);
        // t.setText("SFORM"+fno);
     //Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }

   /* public void showToast(final String toast)
    {
        runOnUiThread(() -> Toast.makeText(English_locality.this, toast, Toast.LENGTH_SHORT).show());
    }*/
   public static double[] getlocation(Location lp)
   {
       double []arr = new double[3];
       if(lp != null)
       {

           double lat = lp.getLatitude();
           double lon = lp.getLongitude();
           double alt = lp.getAltitude();
           String latStr = Double.toString(lat).substring(0,7);
           String lonStr = Double.toString(lon).substring(0,7);
           lat = Double.parseDouble(latStr);
           lon = Double.parseDouble(lonStr);
           arr[0] = lat;
           arr[1] = lon;
           arr[2] = alt;

       }

       return arr;
   }

    String todaydate()
    {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String currentDate = s.format(new Date());
        return currentDate;
    }

}

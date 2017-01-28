package com.example.vitko.ordermeal;

import android.app.Dialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import static com.example.vitko.ordermeal.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        Dialog loginDialog = new Dialog(this);
        loginDialog.setContentView(R.layout.activity_main);
        Button loginButton = (Button) loginDialog.findViewById(R.id.button);

    }
    public void displayLoginMessage(View v) {
        Toast toast = Toast.makeText(getApplication(), "hello, i will make you log in", Toast.LENGTH_LONG);
        toast.show();
        login();
    }

    private void login(){
        try {
            URL loginUrl = new URL("https://goo.gl/JHpqCD");

            HttpURLConnection conn = (HttpURLConnection) loginUrl.openConnection();
            conn.setReadTimeout(15000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.setDoOutput(true);



            int responseCode=conn.getResponseCode();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

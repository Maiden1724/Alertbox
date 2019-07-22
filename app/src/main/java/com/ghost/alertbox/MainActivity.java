package com.ghost.alertbox;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonclose;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclose =(Button)findViewById(R.id.btnclose);
        builder = new AlertDialog.Builder(this);


    }

    public void CloseApp(View view) {
           builder.setMessage("do you want to close the App");




    }
}

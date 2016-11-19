package com.julianmosquera.configdospantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



      /*
       if (getResources().getBoolean(R.bool.twoPaneMode)==false){

           Toast.makeText(this, "Land", Toast.LENGTH_LONG).show();

       }else{
           Toast.makeText(this, "port", Toast.LENGTH_LONG).show();
           Intent inttent=new Intent(this,Main2Activity.class);
       }*/


    }


}

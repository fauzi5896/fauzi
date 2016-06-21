package com.example.fauzi.bekupdua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button mButton = (Button) findViewById(R.id.btn_satu);
        final TextView txtchange = (TextView) findViewById(R.id.alamat);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtchange.setText("berubah");
            }
        });

        ImageView imgvw = (ImageView) findViewById(R.id.g);
        imgvw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentPindah = new Intent(MainActivity.this, Main2.class);
                startActivity(intentPindah);
            }
        });
    }
}


    //buat di activity_main2






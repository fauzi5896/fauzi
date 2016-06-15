package com.example.fauzi.bekupdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnJumlah, btnHitung;
    TextView input1, input2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coba);
        input1 = (TextView) findViewById(R.id.angka1);
        input2 = (TextView) findViewById(R.id.angka2);
        hasil = (TextView) findViewById(R.id.hasil);

        btnHitung = (Button) findViewById(R.id.hitung);

    }
    //buat di activity_main2
    //mButton=(Button)findViewById(R.id.btn_satu);
    //final TextView txtchange = (TextView)findViewById(R.id.alamat);

    //mButton.setOnClickListener(new View.OnClickListener() {
    //  @Override
    // public void onClick(View v) {
    //   txtchange.setText("berubah");
    //}
    // });


}


package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button btAdd, btSub, btMul, btDiv;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.bil1);
        et2 = (EditText) findViewById(R.id.bil2);
        tvHasil = (TextView) findViewById(R.id.hasil);
        btAdd = (Button) findViewById(R.id.add);
        btSub = (Button) findViewById(R.id.sub);
        btMul = (Button) findViewById(R.id.mul);
        btDiv = (Button) findViewById(R.id.div);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1 + bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1 - bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1 * bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1 / bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });



    }
}
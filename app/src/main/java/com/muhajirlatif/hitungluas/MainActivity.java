package com.muhajirlatif.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvResult;
    EditText etPanjang, etLebar;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        btnHitung = findViewById(R.id.btnHitung);
        tvResult = findViewById(R.id.tvResult);

        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHitung:
                Double panjang = Double.valueOf(etPanjang.getText().toString());
                Double lebar = Double.valueOf(etLebar.getText().toString());

                Double luas = panjang * lebar;

                tvResult.setText("Luas: " + luas);
        }
    }
}

package com.e.taxamount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etTaxamount;
    TextView tvResult;
    Button btnTaxamount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTaxamount = findViewById(R.id.etTaxamount);
        tvResult = findViewById(R.id.tvResult);
        btnTaxamount = findViewById(R.id.btnTaxamount);

        btnTaxamount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etTaxamount.getText().toString())) {
                    etTaxamount.setError("Please Enter your Monthly income");
                    return;
                }
                double etTaxamount1;
                etTaxamount1 = Double.parseDouble(etTaxamount.getText().toString());
                Nabin_Taxamount Result = new Nabin_Taxamount(etTaxamount1);
                double myTax = Result.finalResult();
                tvResult.setText("Your Tax Amount is:"+Double.toString(myTax));
            }
        });

    }
}
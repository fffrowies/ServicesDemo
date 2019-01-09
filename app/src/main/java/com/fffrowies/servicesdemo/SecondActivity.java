package com.fffrowies.servicesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    boolean isBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClickEvent(View view) {

        EditText edtNumOne = findViewById(R.id.edtNumOne);
        EditText edtNumTwo = findViewById(R.id.edtNumTwo);
        TextView txvResult = findViewById(R.id.txvResult);

        int numOne = Integer.valueOf(edtNumOne.getText().toString());
        int numTwo = Integer.valueOf(edtNumTwo.getText().toString());

        if (isBound) {

            switch (view.getId()) {

                case R.id.btnAdd:

                    break;

                case R.id.btnSub:

                    break;

                case R.id.btnMul:

                    break;

                case R.id.btnDiv:

                    break;

            }
        }
    }
}

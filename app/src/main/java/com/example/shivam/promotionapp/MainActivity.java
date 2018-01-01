package com.example.shivam.promotionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEditText,mEditText1,mEditText2;
    TextView mTextView;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText=(EditText)findViewById(R.id.edtName);
        mEditText1=(EditText)findViewById(R.id.edtMail);

        mTextView=(TextView)findViewById(R.id.textView);
        mButton=(Button)findViewById(R.id.btnNext);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, email,opt;
                name=mEditText.getText().toString();
                email=mEditText1.getText().toString();
               // opt=mEditText2.getText().toString();
                //if(opt.equals("happynewyear"))
                //{
                    Intent intent = new Intent(getApplicationContext(),Questions.class);
                    startActivity(intent);
                    finish();
                //}
            }
        });
    }
}

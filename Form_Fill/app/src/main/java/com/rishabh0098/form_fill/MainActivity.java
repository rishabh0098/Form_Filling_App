package com.rishabh0098.form_fill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText name,age,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.txt_n);
        age = (EditText) findViewById(R.id.txt_a);
        gender = (EditText) findViewById(R.id.txt_g);
        b = (Button) findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString().trim();
                String a = age.getText().toString().trim();
                String g = gender.getText().toString().trim();
                Intent i = new Intent(MainActivity.this, FilledDetails.class);
                if (g.equalsIgnoreCase("Male")) {

                    i.putExtra("name","Mr. "+n);
                    i.putExtra("age",a);
                    i.putExtra("gender",g);
                    startActivity(i);

                }
                else {

                    i.putExtra("name","Ms. "+n);
                    i.putExtra("age",a);
                    i.putExtra("gender",g);
                    startActivity(i);

                }
            }
        });
    }


}

package com.rishabh0098.form_fill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by HP on 13-09-2017.
 */

public class FilledDetails extends Activity {
    TextView txt,txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filled_details);
        Intent i = getIntent();
        String n1 = i.getStringExtra("name");
        String a1 = i.getStringExtra("age");
        String g1 = i.getStringExtra("gender");
        txt = (TextView) findViewById(R.id.txtr_n);
        txt.setText(n1);
        txt = (TextView) findViewById(R.id.txtr_a);
        txt.setText(a1);
        txt = (TextView) findViewById(R.id.txtr_g);
        txt.setText(g1);
    }
}

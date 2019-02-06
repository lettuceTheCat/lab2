package edu.temple.signupform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by chizhang on 2/1/19.
 */

public class name extends AppCompatActivity {

    TextView nameviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Intent intent = getIntent();
        String str = intent.getStringExtra("userfirstname");

        Log.v("HelloFromFirstActivity", str);

        nameviewer = (TextView) findViewById(R.id.namedisplayer);
        nameviewer.setText("Welcome "+ str + " to the SignUpForm App");
    }
}

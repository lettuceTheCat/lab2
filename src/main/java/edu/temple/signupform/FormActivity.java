package edu.temple.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

        //create button
        private Button saveButton;

        private EditText firstName,email,pass,conpass;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_form);

            final Intent myIntent = new Intent(this, name.class);

            //set buttons context
            saveButton = (Button) findViewById(R.id.saveB);

            //set edittexts
            firstName = (EditText) findViewById(R.id.firstname);
            email = (EditText) findViewById(R.id.email);
            pass = (EditText) findViewById(R.id.password);
            conpass = (EditText) findViewById(R.id.passwordcon);

            final String checker = "";

            final Toast toast = Toast.makeText(getApplicationContext(),
                    "Please fill out all fields",
                    Toast.LENGTH_SHORT);



            //create on click for button
            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //start activity
                    if (firstName.getText().toString().matches(checker) || email.getText().toString().matches(checker) || pass.getText().toString().matches(checker) || conpass.getText().toString().matches(checker)){
                        toast.show();
                    }else {
                        if (pass.getText().toString().matches(conpass.getText().toString())){


                            myIntent.putExtra("userfirstname",firstName.getText().toString());
                            edu.temple.signupform.FormActivity.this.startActivity(myIntent);
                        }
                        else {
                            Toast.makeText(getApplicationContext(),
                                    "Passwords do not match",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                    Log.v("EditText", firstName.getText().toString());


                }
            });
        }
    }

package com.example.favorite_toys.explicitintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.favorite_toys.R;

public class MainActivity extends AppCompatActivity {

    private EditText mNameEntry;
    private Button mDoSomethingCoolButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDoSomethingCoolButton = (Button) findViewById(R.id.b_do_something_cool);
        mNameEntry = (EditText) findViewById(R.id.et_text_entry);

        mDoSomethingCoolButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String textEntered = mNameEntry.getText().toString();

                Context context = MainActivity.this;

                Class destinationActivity = ChildActivity.class;

                Intent startChildActivityIntent = new Intent(context, destinationActivity);

//                String message = "Button clicked!\nTODO: Start a new Activity and pass some data.";
//                Toast.makeText(context, message, Toast.LENGTH_LONG).show();

                startChildActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);

                startActivity(startChildActivityIntent);
            }
        });
    }
}
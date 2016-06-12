package com.example.benjaminlize.receivejoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String JOKE_MESSAGE_RECEIVER_STRING = "Joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receivejoke_activity_main);

        Intent receivedIntent = getIntent();
        if (getIntent() != null) {
            String jokeReceived = receivedIntent.getStringExtra
                    (JOKE_MESSAGE_RECEIVER_STRING);
            TextView jokesTextView = (TextView)findViewById(R.id.jokesReceiverTextView);
            jokesTextView.setText(jokeReceived);
            Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT);
        }

    }
}

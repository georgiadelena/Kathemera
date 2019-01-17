package com.example.android.kathemera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button initialState = (Button) findViewById(R.id.initial_button);
        initialState.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent initialIntent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(initialIntent);
            }
        });
    }
}

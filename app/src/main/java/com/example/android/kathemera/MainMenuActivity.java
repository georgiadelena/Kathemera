package com.example.android.kathemera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Elena on 7/1/2019.
 */

public class MainMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);

        Button faceState = (Button) findViewById(R.id.wash_face_button);
        faceState.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent initialIntent = new Intent(MainMenuActivity.this, WashFaceActivity.class);
                startActivity(initialIntent);
            }
        });

        Button teethState = (Button) findViewById(R.id.wash_teeth_button);
        teethState.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent teethIntent = new Intent(MainMenuActivity.this, WashTeethActivity.class);
                startActivity(teethIntent);
            }
        });

    }

}

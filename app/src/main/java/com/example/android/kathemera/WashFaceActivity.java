package com.example.android.kathemera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Elena on 13/1/2019.
 */

public class WashFaceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wash_face);
    }

    public void clickButton1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("vnd.youtube://"+"Ewc0FHeGhcQ"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void clickButton2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("vnd.youtube://"+"BiA62fKQ_Cc"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void clickButton3(View view){
        // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://"+"5QmEoIPfNPA")));
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("vnd.youtube://"+"HYCad5BU-Rw"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void clickButton4(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("vnd.youtube://"+"2pdV5zM2uEI"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

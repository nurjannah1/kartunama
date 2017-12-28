package com.nunu.kartunama;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Intent lk = new Intent(MainActivity.this,Main2Activity.class);
            lk.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            lk.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(lk);
            finish();
        }
    }
}

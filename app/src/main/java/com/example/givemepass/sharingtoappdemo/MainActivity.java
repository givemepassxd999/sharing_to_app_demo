package com.example.givemepass.sharingtoappdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String data = SharingIntent.sharingIntent(this, getIntent());
        String type = getIntent().getType();
        if(!TextUtils.isEmpty(data)) {
            if ("text/plain".equals(type)) {
                Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
            } else if (type.startsWith("image/")) {
                Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
            }
        }
    }
}

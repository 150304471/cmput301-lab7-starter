package com.example.androiduitesting;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity{
    public static final String EXTRA_CITY_NAME = "com.example.androiduitesting.CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityTextView = findViewById(R.id.show_city_name);
        Button backButton = findViewById(R.id.back_button);

        String cityName = getIntent().getStringExtra(EXTRA_CITY_NAME);
        if (cityName != null) {
            cityTextView.setText(cityName);
        }

        backButton.setOnClickListener(v -> finish());
    }
}

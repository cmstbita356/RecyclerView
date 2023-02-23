package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        ImageView imageView_image = findViewById(R.id.imageView_image);
        imageView_image.setImageResource(bundle.getInt("resID"));

        TextView textView_name = findViewById(R.id.textView_name);
        textView_name.setText(bundle.getString("name"));

        TextView textView_content = findViewById(R.id.textView_content);
        textView_content.setText(bundle.getString("content"));

        Button button_return = findViewById(R.id.button_return);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
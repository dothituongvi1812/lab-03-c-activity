package com.example.lab_03_c_activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        ImageView imageView3=findViewById(R.id.imageView3);
        TextView tvColor=findViewById(R.id.textViewColor);

        String color = getIntent().getExtras().getString("color");
        String uri=getIntent().getExtras().getString("uri");

        tvColor.setText(color);

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        imageView3.setImageDrawable(res);

        Button btnXong=findViewById(R.id.buttonXong);

        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Screen3.this, MainActivity.class);// điều hướng từ Main sang Sub
                intent.putExtra("uri",uri);
                startActivity(intent);
            }
        });





    }
}
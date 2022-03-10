package com.example.lab_03_c_activity;

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

public class Screen2 extends AppCompatActivity {
    String uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        TextView textView=findViewById(R.id.textViewThongTin);
        ImageView imageView=findViewById(R.id.imageView);

        ImageButton btnBlue=findViewById(R.id.buttonBlue);
        ImageButton btnRed=findViewById(R.id.buttonRed);
        ImageButton btnBlack=findViewById(R.id.buttonBlack);
        ImageButton btnBlueBold=findViewById(R.id.buttonBlueBold);

        Button btnXong=findViewById(R.id.buttonXong);
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trave = new Intent();
                trave.putExtra("uri", uri);
                setResult(RESULT_OK, trave);
                finish();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              uri ="@drawable/vsmart_live_xanh";
                String color="xanh";
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res = getResources().getDrawable(imageResource);
                imageView.setImageDrawable(res);
                Intent intent=new Intent(Screen2.this, Screen3.class);// điều hướng từ Screen2 sang Screen3
                startActivityForResult(intent,9999);

                intent.putExtra("uri",uri);
                intent.putExtra("color",color);

                startActivity(intent);

            }
        });
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 uri="@drawable/vs_red_a2";
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res = getResources().getDrawable(imageResource);
                imageView.setImageDrawable(res);
                Intent intent=new Intent(Screen2.this, Screen3.class);// điều hướng từ Screen2 sang Screen3
                startActivityForResult(intent,9999);
                String color="đỏ";
                intent.putExtra("uri",uri);
                intent.putExtra("color",color);

                startActivity(intent);

            }
        });
        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 uri="@drawable/vsmart_black_star1";
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res = getResources().getDrawable(imageResource);
                imageView.setImageDrawable(res);
                Intent intent=new Intent(Screen2.this, Screen3.class);// điều hướng từ Screen2 sang Screen3
                String color="đen";
                intent.putExtra("uri",uri);
                intent.putExtra("color",color);
                startActivity(intent);


            }
        });
        btnBlueBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 uri="@drawable/vs_bac1";
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res = getResources().getDrawable(imageResource);
                imageView.setImageDrawable(res);
                

                Intent intent=new Intent(Screen2.this, Screen3.class);// điều hướng từ Screen2 sang Screen3
                startActivityForResult(intent,9999);
                String color="bạc";
                intent.putExtra("uri",uri);
                intent.putExtra("color",color);

                startActivity(intent);

            }
        });


    }
}
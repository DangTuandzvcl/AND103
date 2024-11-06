package com.example.and1043;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView gifImageView = findViewById(R.id.gifImageView);

        // Sử dụng Glide để tải ảnh GIF
        Glide.with(this)
                .asGif()
                .load(R.drawable.restaurant) // Thay your_gif_image bằng tên tệp GIF của bạn
                .into(gifImageView);

        // Chuyển sang màn hình chính sau 3 giây
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }, 3000); // Thời gian hiển thị màn hình chào là 3 giây

    }
}
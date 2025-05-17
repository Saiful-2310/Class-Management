package com.example.classmanagement21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLoginTeacher = findViewById(R.id.btnLoginTeacher);
        Button btnLoginStudent = findViewById(R.id.btnLoginStudent);




        // Handle Student Login
        btnLoginStudent.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StudentLoginActivity.class);
            startActivity(intent);
        });
    }
}

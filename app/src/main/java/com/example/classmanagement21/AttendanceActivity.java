package com.example.classmanagement21;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AttendanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);


        Toast.makeText(this, "Attendance Page", Toast.LENGTH_SHORT).show();
    }
}

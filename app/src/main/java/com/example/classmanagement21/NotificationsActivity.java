package com.example.classmanagement21;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NotificationsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);


        Toast.makeText(this, "Notifications Page", Toast.LENGTH_SHORT).show();
    }
}

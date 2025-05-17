package com.example.classmanagement21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class StudentLoginActivity extends AppCompatActivity {

    private static final String STUDENT_ID = "12208021";
    private static final String PASSWORD = "Saiful";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        EditText editStudentID = findViewById(R.id.editStudentID);
        EditText editPassword = findViewById(R.id.editPassword);
        Button btnStudentLogin = findViewById(R.id.btnStudentLogin);

        btnStudentLogin.setOnClickListener(v -> {
            String enteredID = editStudentID.getText().toString().trim();
            String enteredPassword = editPassword.getText().toString().trim();

            if (enteredID.equals(STUDENT_ID) && enteredPassword.equals(PASSWORD)) {

                Intent intent = new Intent(StudentLoginActivity.this, DashboardActivity.class);
                startActivity(intent);
                Toast.makeText(StudentLoginActivity.this, "Welcome, Student!", Toast.LENGTH_SHORT).show();
                finish();
            } else {

                Toast.makeText(StudentLoginActivity.this, "Invalid ID or Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

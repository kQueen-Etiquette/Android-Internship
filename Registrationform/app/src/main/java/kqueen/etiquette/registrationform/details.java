package kqueen.etiquette.registrationform;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity {
    TextView details, user_roll, user_name, user_phone, user_email, user_pswd, user_gender, user_branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        details = findViewById(R.id.details);
        user_roll = findViewById(R.id.user_roll);
        user_name = findViewById(R.id.user_name);
        user_phone = findViewById(R.id.user_phone);
        user_email = findViewById(R.id.user_email);
        user_pswd = findViewById(R.id.user_pswd);
        user_gender = findViewById(R.id.user_gender);
        user_branch = findViewById(R.id.user_branch);

        user_roll.setText("Roll Number: "+getIntent().getStringExtra("roll_2"));
        user_name.setText("Name: "+getIntent().getStringExtra("name_2"));
        user_phone.setText("Phone Number: "+getIntent().getStringExtra("phone_number"));
        user_email.setText("Email Id: "+getIntent().getStringExtra("emails"));
        user_pswd.setText("Password: "+getIntent().getStringExtra("paswd"));
        user_gender.setText("Gender: "+getIntent().getStringExtra("gender1"));
        user_branch.setText("Branch: "+getIntent().getStringExtra("branch1"));
    }
}
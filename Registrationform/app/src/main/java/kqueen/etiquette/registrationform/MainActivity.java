package kqueen.etiquette.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    Spinner sp1, sp2;
    EditText roll, name, phone, email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        sp1 = findViewById(R.id.sp1);
        sp2 = findViewById(R.id.sp2);
        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rollno = roll.getText().toString();
                String names = name.getText().toString();
                String ph = phone.getText().toString();
                String email_id = email.getText().toString();
                String pass_word = pass.getText().toString();
                String gender_1 = sp1.getSelectedItem().toString();
                String branch_1 = sp2.getSelectedItem().toString();

                if(!rollno.isEmpty() && !names.isEmpty() && !ph.isEmpty() && !email_id.isEmpty() && !pass_word.isEmpty() && !gender_1.isEmpty() && !branch_1.isEmpty() ) {
                    Intent display = new Intent(MainActivity.this, details.class);
                    display.putExtra("roll_2", rollno);
                    display.putExtra("name_2", names);
                    display.putExtra("phone_number", ph);
                    display.putExtra("emails", email_id);
                    display.putExtra("paswd", pass_word);
                    display.putExtra("gender1", gender_1);
                    display.putExtra("branch1", branch_1);
                    startActivity(display);
                } else {
                    Toast.makeText(MainActivity.this, "Please fill all the details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
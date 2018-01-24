package tk.developeramit.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailEditText, passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEditText = (EditText) findViewById(R.id.login_emial);
        passwordEditText = (EditText) findViewById(R.id.login_password);
    }

    public void onLoginButtonClick(View view) {
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (email.trim().equalsIgnoreCase("")) {
            emailEditText.setError("Email Cannot be Empty");
            return;
        }

        if (password.trim().equalsIgnoreCase("")) {
            passwordEditText.setError("Password Cannot be Empty");
            return;
        }

        Toast.makeText(this, "Email: " + email + "\tPassword: " + password, Toast.LENGTH_SHORT).show();
    }
}
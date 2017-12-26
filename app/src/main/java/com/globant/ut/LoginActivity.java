package com.globant.ut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity implements LoginView{

    EditText edit_username;

    @BindView(R.id.edit_password)
    EditText edit_password;

    @BindView(R.id.btn_login)
    Button btn_login;

    String str_username = "", str_password = "";
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit_username = findViewById(R.id.edit_username);
        edit_password = findViewById(R.id.edit_password);
        btn_login = findViewById(R.id.btn_login);

        presenter = new LoginPresenter(this, new LoginService());

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.onLoginClicked();
                str_username = edit_username.getText().toString();
                str_password = edit_password.getText().toString();

                if(str_username.isEmpty()) {
                    edit_username.setError("Enter Username");
                    edit_username.requestFocus();
                    return;
                }

                if(str_password.isEmpty()) {
                    edit_password.setError("Enter Password");
                    edit_password.requestFocus();
                    return;
                }

                boolean isLoggedIn = new LoginService().login(str_username, str_password);
                if(isLoggedIn) {
                    new ActivityUtil(LoginActivity.this).startMainActivity();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

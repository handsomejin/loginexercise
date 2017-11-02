package com.example.loginexercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowLoginInfoActivity extends BaseActivity {

    private TextView accountText;
    private TextView passwordText;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_login_info);
        accountText = (TextView)findViewById(R.id.account);
        passwordText = (TextView)findViewById(R.id.password);
        logout = (Button)findViewById(R.id.logout);
        Intent intent = getIntent();
        String account = intent.getStringExtra("extra_account");
        String password = intent.getStringExtra("extra_password");
        accountText.setText("Account:" + account);
        passwordText.setText("Password:" + password);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

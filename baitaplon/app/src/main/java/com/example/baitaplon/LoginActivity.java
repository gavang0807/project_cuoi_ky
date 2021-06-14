package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText et_Tai_Khoan_login;
    private EditText et_Mat_Khau_login;
    private Button bt_Dang_Nhap;
    private Button bt_Dang_Ky_login;
    public static final String NAME="NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setDangNhap();
        setDangKy();
    }


    private void setDangNhap() {
        bt_Dang_Nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_Tai_Khoan_login.getText().toString();
                if(et_Tai_Khoan_login.getText().length()!=0 && et_Mat_Khau_login.getText().length()!=0){
                    if(et_Tai_Khoan_login.getText().toString().equals(RegisterActivity.USERNAME) && et_Mat_Khau_login.getText().toString().equals(RegisterActivity.PASSWORD)){
                        Intent intent = new Intent(LoginActivity.this, PickSideActivity.class);
                        intent.putExtra(NAME, name);
                        startActivity(intent);
                    } else if(et_Tai_Khoan_login.getText().toString().equals("tienanh") && et_Mat_Khau_login.getText().toString().equals("123456")){
                        Intent intent = new Intent(LoginActivity.this, PickSideActivity.class);
                        intent.putExtra(NAME, "tienanh");
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "Sai tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Hãy điền đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setDangKy() {
        bt_Dang_Ky_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        et_Tai_Khoan_login=findViewById(R.id.et_Tai_Khoan_login);
        et_Mat_Khau_login=findViewById(R.id.et_Mat_Khau_login);
        bt_Dang_Nhap=findViewById(R.id.bt_Dang_Nhap);
        bt_Dang_Ky_login=findViewById(R.id.bt_Dang_Ky_login);
    }
}
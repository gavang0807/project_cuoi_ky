package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.baitaplon.data.DataBaseManager;
import com.example.baitaplon.model.User;

public class RegisterActivity extends AppCompatActivity {
    private EditText et_Tai_Khoan_register;
    private EditText et_Mat_Khau_register;
    private Button bt_Dang_Ky_register;
    private Button bt_Huy;
    public static String USERNAME="";
    public static String PASSWORD="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        DataBaseManager dbManager = new DataBaseManager(this);
        initView();
        bt_Dang_Ky_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user=createUser();
                if(user!=null){
                    dbManager.addUser(user);
                }
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                USERNAME=et_Tai_Khoan_register.getText().toString().trim();
                PASSWORD=et_Mat_Khau_register.getText().toString().trim();
                et_Tai_Khoan_register.setText(USERNAME);
                et_Mat_Khau_register.setText(PASSWORD);
                startActivity(intent);
                finish();
            }
        });
        bt_Huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "Bạn đã hủy đăng ký", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private User createUser(){
        String username=et_Tai_Khoan_register.getText().toString();
        String password=et_Mat_Khau_register.getText().toString();
        User user=new User(username, password);
        return user;
    }

    private void initView() {
        et_Tai_Khoan_register=findViewById(R.id.et_Tai_Khoan_register);
        et_Mat_Khau_register=findViewById(R.id.et_Mat_Khau_register);
        bt_Dang_Ky_register=findViewById(R.id.bt_Dang_Ky_register);
        bt_Huy=findViewById(R.id.bt_Huy);
    }
}
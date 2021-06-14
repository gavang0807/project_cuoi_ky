package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PickSideActivity extends AppCompatActivity {
    private TextView tv_Xin_Chao;
    private RadioButton rb_Xanh, rb_Do;
    private Button bt_Choi, bt_Quay_Lai;
    public static final String NAME="NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_side);
        initView();
        setTen();
        pickside();
        getTenXanh();
        getTenDo();
        quaylai();
    }

    private void getTenDo() {
        Intent intent = getIntent();
        String name = intent.getStringExtra(PlayRedThreeCardActivity.NAME);
        tv_Xin_Chao.setText(name);
    }

    private void getTenXanh() {
        Intent intent = getIntent();
        String name = intent.getStringExtra(PlayBlueThreeCardActivity.NAME);
        tv_Xin_Chao.setText(name);
    }

    private void pickside() {
        bt_Choi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb_Xanh.isChecked()){
                    Intent intent = new Intent(PickSideActivity.this, PlayBlueThreeCardActivity.class);
                    String name = tv_Xin_Chao.getText().toString();
                    intent.putExtra(NAME, name);
                    startActivity(intent);
                }else if(rb_Do.isChecked()){
                    Intent intent = new Intent(PickSideActivity.this, PlayRedThreeCardActivity.class);
                    String name = tv_Xin_Chao.getText().toString();
                    intent.putExtra(NAME, name);
                    startActivity(intent);
                } else {
                    Toast.makeText(PickSideActivity.this, "Bạn hãy chọn một phe bài", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void quaylai() {
        bt_Quay_Lai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PickSideActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setTen() {
        Intent intent = getIntent();
        String ten = intent.getStringExtra(LoginActivity.NAME);
        tv_Xin_Chao.setText("Xin chào "+ten);
    }

    private void initView() {
        tv_Xin_Chao=findViewById(R.id.tv_Xin_Chao);
        rb_Xanh=findViewById(R.id.rb_Xanh);
        rb_Do=findViewById(R.id.rb_Do);
        bt_Choi=findViewById(R.id.bt_Choi);
        bt_Quay_Lai=findViewById(R.id.bt_Quay_Lai);
    }
}
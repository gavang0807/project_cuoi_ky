package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class PlayBlueThreeCardActivity extends AppCompatActivity {
    private TextView tv_Ten_Blue;
    private Button bt_Lat_Bai, bt_Choi_Lai, bt_Thoat;
    private ImageView img1, img2, img3, img4, img5, img6;
    public static final String NAME="NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_blue_three_card);
        initView();
        setTenXanh();
        setLatBai();
        setChoiLai();
        setThoat();
    }

    private void setChoiLai() {
        bt_Choi_Lai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.blue_back);
                img2.setImageResource(R.drawable.blue_back);
                img3.setImageResource(R.drawable.blue_back);
                img4.setImageResource(R.drawable.red_back);
                img5.setImageResource(R.drawable.red_back);
                img6.setImageResource(R.drawable.red_back);
            }
        });
    }

    private void setThoat() {
        bt_Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayBlueThreeCardActivity.this, PickSideActivity.class);
                String name = tv_Ten_Blue.getText().toString();
                intent.putExtra(NAME, name);
                startActivity(intent);
            }
        });
    }

    private void setTenXanh() {
        Intent intent = getIntent();
        String name = intent.getStringExtra(PickSideActivity.NAME);
        tv_Ten_Blue.setText(name);
    }
    private void setLatBai() {
        bt_Lat_Bai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> boBai = new ArrayList<Integer>();
                boBai.add(R.drawable.ca);
                boBai.add(R.drawable.c2);
                boBai.add(R.drawable.c3);
                boBai.add(R.drawable.c4);
                boBai.add(R.drawable.c5);
                boBai.add(R.drawable.c6);
                boBai.add(R.drawable.c7);
                boBai.add(R.drawable.c8);
                boBai.add(R.drawable.c9);
                boBai.add(R.drawable.da);
                boBai.add(R.drawable.d2);
                boBai.add(R.drawable.d3);
                boBai.add(R.drawable.d4);
                boBai.add(R.drawable.d5);
                boBai.add(R.drawable.d6);
                boBai.add(R.drawable.d7);
                boBai.add(R.drawable.d8);
                boBai.add(R.drawable.d9);
                boBai.add(R.drawable.ha);
                boBai.add(R.drawable.h2);
                boBai.add(R.drawable.h3);
                boBai.add(R.drawable.h4);
                boBai.add(R.drawable.h5);
                boBai.add(R.drawable.h6);
                boBai.add(R.drawable.h7);
                boBai.add(R.drawable.h8);
                boBai.add(R.drawable.h9);
                boBai.add(R.drawable.sa);
                boBai.add(R.drawable.s2);
                boBai.add(R.drawable.s3);
                boBai.add(R.drawable.s4);
                boBai.add(R.drawable.s5);
                boBai.add(R.drawable.s6);
                boBai.add(R.drawable.s7);
                boBai.add(R.drawable.s8);
                boBai.add(R.drawable.s9);

//                boBai.add(R.drawable.ca); boBai.set(0, 1);
//                boBai.add(R.drawable.c2); boBai.set(1, 2);
//                boBai.add(R.drawable.c3); boBai.set(2, 3);
//                boBai.add(R.drawable.c4); boBai.set(3, 4);
//                boBai.add(R.drawable.c5); boBai.set(4, 5);
//                boBai.add(R.drawable.c6); boBai.set(5, 6);
//                boBai.add(R.drawable.c7); boBai.set(6, 7);
//                boBai.add(R.drawable.c8); boBai.set(7, 8);
//                boBai.add(R.drawable.c9); boBai.set(8, 9);
//                boBai.add(R.drawable.da); boBai.set(9, 1);
//                boBai.add(R.drawable.d2); boBai.set(10, 2);
//                boBai.add(R.drawable.d3); boBai.set(11, 3);
//                boBai.add(R.drawable.d4); boBai.set(12, 4);
//                boBai.add(R.drawable.d5); boBai.set(13, 5);
//                boBai.add(R.drawable.d6); boBai.set(14, 6);
//                boBai.add(R.drawable.d7); boBai.set(15, 7);
//                boBai.add(R.drawable.d8); boBai.set(16, 8);
//                boBai.add(R.drawable.d9); boBai.set(17, 9);
//                boBai.add(R.drawable.ha); boBai.set(18, 1);
//                boBai.add(R.drawable.h2); boBai.set(19, 2);
//                boBai.add(R.drawable.h3); boBai.set(20, 3);
//                boBai.add(R.drawable.h4); boBai.set(21, 4);
//                boBai.add(R.drawable.h5); boBai.set(22, 5);
//                boBai.add(R.drawable.h6); boBai.set(23, 6);
//                boBai.add(R.drawable.h7); boBai.set(24, 7);
//                boBai.add(R.drawable.h8); boBai.set(25, 8);
//                boBai.add(R.drawable.h9); boBai.set(26, 9);
//                boBai.add(R.drawable.sa); boBai.set(27, 1);
//                boBai.add(R.drawable.s2); boBai.set(28, 2);
//                boBai.add(R.drawable.s3); boBai.set(29, 3);
//                boBai.add(R.drawable.s4); boBai.set(30, 4);
//                boBai.add(R.drawable.s5); boBai.set(31, 5);
//                boBai.add(R.drawable.s6); boBai.set(32, 6);
//                boBai.add(R.drawable.s7); boBai.set(33, 7);
//                boBai.add(R.drawable.s8); boBai.set(34, 8);
//                boBai.add(R.drawable.s9); boBai.set(35, 9);


                Random r = new Random();
                int a = r.nextInt(boBai.size());
                img1.setImageResource(boBai.get(a));
                boBai.remove(a);
                int b = r.nextInt(boBai.size());
                img2.setImageResource(boBai.get(b));
                boBai.remove(b);
                int c = r.nextInt(boBai.size());
                img3.setImageResource(boBai.get(c));
                boBai.remove(c);
                int x = r.nextInt(boBai.size());
                img4.setImageResource(boBai.get(x));
                boBai.remove(x);
                int y = r.nextInt(boBai.size());
                img5.setImageResource(boBai.get(y));
                boBai.remove(y);
                int z = r.nextInt(boBai.size());
                img6.setImageResource(boBai.get(z));

//                //hien thi diem
//                int diemXanh, diemDo;
//                diemXanh = (a + b + c)%10;
//                tv_Diem_Xanh.setText(Integer.toString(diemXanh));
//                diemDo = (x + y + z)%10;
//                tv_Diem_Do.setText(Integer.toString(diemDo));
//
//                //tinh diem
//                if (diemXanh > diemDo){
//                    Toast.makeText(PlayBlueThreeCardActivity.this, "Quân Xanh thắng!", Toast.LENGTH_SHORT).show();
//                } else if (diemXanh == diemDo){
//                    Toast.makeText(PlayBlueThreeCardActivity.this, "Hòa", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(PlayBlueThreeCardActivity.this, "Quân Đỏ thắng!", Toast.LENGTH_SHORT).show();
//                }

            }
        });
    }
    private void initView() {
        tv_Ten_Blue=findViewById(R.id.tv_Ten_Blue);
        bt_Lat_Bai=findViewById(R.id.bt_Lat_Bai);
        bt_Choi_Lai=findViewById(R.id.bt_Choi_Lai);
        bt_Thoat=findViewById(R.id.bt_Thoat);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
    }
}
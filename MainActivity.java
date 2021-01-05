package com.chien.myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Context context;
    Spinner sp_meal, sp_drink, sp_dessert;
    String s1, s2, s3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        sp_meal = findViewById(R.id.sp_meal);
        sp_dessert = findViewById(R.id.sp_dessert);
        sp_drink = findViewById(R.id.sp_drink);

        //第二組初始化
        //取得資料
        String[] drink = getResources().getStringArray(R.array.drink);
        //ArrayAdapter轉換
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                context, android.R.layout.simple_spinner_dropdown_item,
                drink
        );

        //sp_drink 加監聽器 錯誤
//        sp_drink.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String str = parent.getItemAtPosition(position).toString();
//                //Toast.makeText(context, str, Toast.LENGTH_LONG);
//            }
//        });

        //接受上方轉換來的資料
        sp_drink.setAdapter(adapter);

        //第三組初始化
        String[] dessert = {"布丁", "巧克力甜筒", "抹茶蛋糕"};
        //ArrayAdapter轉換
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                context, android.R.layout.simple_spinner_dropdown_item,
                dessert
        );
        //接受上方轉換來的資料
        adapter2.setDropDownViewResource(R.layout.mylayout);
        sp_dessert.setAdapter(adapter2);


        //BUNTTON 監聽
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               //1
               s1 = sp_meal.getSelectedItem().toString();
               //2
               s2 = sp_drink.getSelectedItem().toString();
               //3
               s3 = sp_dessert.getSelectedItem().toString();

               //Toast.makeText(context, s1+"\n"+s2+"\n"+s3, Toast.LENGTH_LONG);
               Snackbar.make(v, s1+"\t"+s2+"\t"+s3, Snackbar.LENGTH_LONG).show();
           }
        });
    }
}
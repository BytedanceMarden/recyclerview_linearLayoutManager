package com.bytedance.day20210817_demo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.my_recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        //设置水平/纵向排列
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        
        //设置滑动方向(从左到右/从右到左  or  从上到下/从下到上)
        linearLayoutManager.setReverseLayout(false);
        //添加布局管理器
        recyclerView.setLayoutManager(linearLayoutManager);

        List<String> list=new ArrayList<String>();
        for(int i=0;i<30;i++){
            list.add("hello "+i);
        }
        recyclerView.setAdapter(new MyAdapter(list));
    }
}
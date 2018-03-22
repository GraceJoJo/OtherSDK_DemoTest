package com.yonyou.jpushdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.jpush.android.api.JPushInterface;

/**
 * 测试使用的极光账号：18510829974@163.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et_alias = (EditText) findViewById(R.id.et_alias);
        Button btn_modify = (Button) findViewById(R.id.btn_modify);
        btn_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JPushInterface.setAlias(MainActivity.this,et_alias.getText().toString(),null);
                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

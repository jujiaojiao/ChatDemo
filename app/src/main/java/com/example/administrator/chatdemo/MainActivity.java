package com.example.administrator.chatdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private Button back;
    private Button send;
    private ImageButton info;
    private Button V;
    private Button voice;
    private Button T;
    private EditText et;
    private RelativeLayout bottom;
    private LinearLayout linear;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back = (Button) findViewById(R.id.back);
        send = (Button) findViewById(R.id.send);
        info = (ImageButton) findViewById(R.id.info);
        V = (Button) findViewById(R.id.sound);
        T = (Button) findViewById(R.id.write);
        voice = (Button) findViewById(R.id.pressvoice);
        et = (EditText) findViewById(R.id.edittext);
        bottom = (RelativeLayout) findViewById(R.id.bottom);
        linear = (LinearLayout) findViewById(R.id.voice);
        listview = (ListView) findViewById(R.id.listview);

        back.setOnClickListener(this);
        send.setOnClickListener(this);
        info.setOnClickListener(this);
        V.setOnClickListener(this);
        T.setOnClickListener(this);
        voice.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                this.finish();
                break;
            case R.id.send:
                String s = et.getText().toString();
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.info:
                //利用popwindow显示用户信息
                break;
            case R.id.sound:
                bottom.setVisibility(View.GONE);
                linear.setVisibility(View.VISIBLE);
                break;
            case R.id.write:
                bottom.setVisibility(View.VISIBLE);
                linear.setVisibility(View.GONE);
                break;

        }

    }

    @Override
    public boolean onLongClick(View v) {
        switch (v.getId()) {
            case R.id.pressvoice:
                Toast.makeText(this, "say hello", Toast.LENGTH_SHORT).show();
                break;
        }
        
        return false;
    }
}

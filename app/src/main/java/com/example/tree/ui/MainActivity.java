package com.example.tree.ui;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_dialog = findViewById(R.id.btn_dialog);
        Button btn_menu=findViewById(R.id.btn_menu);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog();
            }
        });
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });


    }

    public void dialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // 获取布局
        View view = View.inflate(this,R.layout.alert_dialog,null);
        builder.setView(view);
        final AlertDialog alertDialog =  builder.create();
        alertDialog.show();
    }


}

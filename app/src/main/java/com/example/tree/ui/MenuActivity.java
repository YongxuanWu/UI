package com.example.tree.ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_test,menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        TextView text=findViewById(R.id.test_text);

        switch (mi.getItemId()){
            case R.id.font_10:
                text.setTextSize(10);
                break;
            case R.id.font_16:
                text.setTextSize(16);
                break;
            case R.id.font_20:
                text.setTextSize(20);
                break;
            case R.id.normal:
                Toast.makeText(this,"点击普通菜单项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.color_red:
                text.setTextColor(Color.RED);
                break;
            case R.id.color_black:
                text.setTextColor(Color.BLACK);
                break;

        }
        return true;
    }

}

实验目的
---
    1、创建自定义布局的AlertDialog。 调用 AlertDialog.Builder 对象上的 setView() 将布局添加到 AlertDialog。
    2、使用XML定义菜单。
    3、创建上下文操作模式(ActionMode)的上下文菜单。
关键代码
---
```
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
```
```
    public void dialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // 获取布局
        View view = View.inflate(this,R.layout.alert_dialog,null);
        builder.setView(view);
        final AlertDialog alertDialog =  builder.create();
        alertDialog.show();
    }
```
```
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
```
结果截图
---
![image](https://github.com/YongxuanWu/UI/blob/master/images/p1.jpg)
![image](https://github.com/YongxuanWu/UI/blob/master/images/IMG_20190407_205339.jpg)
![image](https://github.com/YongxuanWu/UI/blob/master/images/IMG_20190407_205328.jpg)
![image](https://github.com/YongxuanWu/UI/blob/master/images/IMG_20190407_205315.jpg)

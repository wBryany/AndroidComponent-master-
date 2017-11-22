package com.allure.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.allure.module.base.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_1 = (Button) findViewById(R.id.btn_1);
        Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_1.setBackgroundColor(getResources().getColor(com.allure.module.base.R.color.wy));
        if(BuildConfig.TYPE_MOUDLE==1){
            btn_1.setVisibility(View.GONE);
            btn_2.setVisibility(View.GONE);
        }else if(BuildConfig.TYPE_MOUDLE==2){
            btn_1.setVisibility(View.GONE);
            btn_2.setVisibility(View.VISIBLE);
        }else if(BuildConfig.TYPE_MOUDLE==3){
            btn_1.setVisibility(View.VISIBLE);
            btn_2.setVisibility(View.GONE);
        }else if(BuildConfig.TYPE_MOUDLE==4){
            btn_1.setVisibility(View.VISIBLE);
            btn_2.setVisibility(View.VISIBLE);
        }
    }



    public  void go2LoginModule(View view){

        startActivityForName(this,"com.allure.module.login.LoginActivity");

    }
    public  void go2ShopModule(View view){
        startActivityForName(this,"com.allure.module.shop.ShopActivity");

    }
}

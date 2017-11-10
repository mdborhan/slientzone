package com.example.borhan.prayertimesilentmood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button LoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ServicePage(View view) {
        Intent intent = new Intent(this,ServicePage.class);

        Button LoginBtn = (Button) findViewById(R.id.loginBTN);
        startActivity(intent);
    }
}

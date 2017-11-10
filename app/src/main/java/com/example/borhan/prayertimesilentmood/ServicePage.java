package com.example.borhan.prayertimesilentmood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ServicePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_page);



    }

    public void silentpage(View view) {
        Intent intent = new Intent(this,Silentpage.class);

        Button silentzone = (Button) findViewById(R.id.silentzone);
        startActivity(intent);
    }

    public void alarmpage(View view) {
        Intent intent = new Intent(this,Alarmpage.class);

        Button alarmzone = (Button) findViewById(R.id.alarmzone);
        startActivity(intent);
    }
}

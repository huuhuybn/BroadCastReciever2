package com.dotplays.broadcastreciever2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                String sms = intent.getStringExtra("sms");

                Toast.makeText(context, sms, Toast.LENGTH_SHORT).show();
            }
        };
        IntentFilter intentFilter = new IntentFilter("ABC");

        registerReceiver(broadcastReceiver, intentFilter);


    }

    public void openActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}

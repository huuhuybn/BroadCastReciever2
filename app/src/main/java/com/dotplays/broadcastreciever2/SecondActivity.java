package com.dotplays.broadcastreciever2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void sendMessage(View view) {

        Intent intent = new Intent("ABC");
        intent.putExtra("sms","HELLO< HOW R U ?");
        sendBroadcast(intent);

    }
}

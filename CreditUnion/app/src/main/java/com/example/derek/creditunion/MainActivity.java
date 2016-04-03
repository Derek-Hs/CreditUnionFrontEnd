package com.example.derek.creditunion;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makePayment(View view) {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }

    public void requestLoan(View view) {
        Intent intent = new Intent(this, RequestLoan.class);
        startActivity(intent);
    }

    public void pendingActions(View view) {
        Intent intent = new Intent(this, PendingActions.class);
        startActivity(intent);
    }

    public void members(View view) {
        Intent intent = new Intent(this, Members.class);
        startActivity(intent);
    }

    public void xactHistory(View view) {
        Intent intent = new Intent(this, XactHistory.class);
        startActivity(intent);
    }
}


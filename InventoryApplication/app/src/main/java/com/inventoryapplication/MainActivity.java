package com.inventoryapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CardView customersButton;
    Button logOutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitializeButtons();
        ClickListenersButtons();
    }


    public void InitializeButtons(){
        customersButton = findViewById(R.id.ClientCV);
        logOutButton = findViewById(R.id.logout_button);
    }

    public void ClickListenersButtons(){
        customersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomersActivity.class);
                startActivity(intent);
//                finish();
            }
        });
    }

}
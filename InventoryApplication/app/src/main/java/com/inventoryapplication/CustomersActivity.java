package com.inventoryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomersActivity extends AppCompatActivity {

    Button backButton, addCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
        InitializeButtons();
        ClickListenersButtons();
    }


    public void InitializeButtons(){
        backButton = findViewById(R.id.back_button);
        addCustomer = findViewById(R.id.add_customer_button);

    }

    public void ClickListenersButtons(){
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomersActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        addCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomersActivity.this, AddCustomerActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
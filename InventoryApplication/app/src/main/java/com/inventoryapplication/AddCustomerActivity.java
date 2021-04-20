package com.inventoryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddCustomerActivity extends AppCompatActivity {
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);
        InitializeButtons();
        ClickListenersButtons();
    }

    public void InitializeButtons(){
        backButton = findViewById(R.id.back_button);

    }

    public void ClickListenersButtons(){
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCustomerActivity.this, CustomersActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
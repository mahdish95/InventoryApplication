package com.inventoryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InventoryActivity extends AppCompatActivity {

    Button backButton, addItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        InitializeButtons();
        ClickListenersButtons();
    }


    public void InitializeButtons(){
        backButton = findViewById(R.id.back_button);
        addItem = findViewById(R.id.add_item_button);

    }

    public void ClickListenersButtons(){
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InventoryActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InventoryActivity.this, AddItemActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
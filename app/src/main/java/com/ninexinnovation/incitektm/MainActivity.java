package com.ninexinnovation.incitektm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnOverPricing;
    Button travelFare;
    Button foodPrices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOverPricing=(Button)findViewById(R.id.btnOverPricing);
        btnOverPricing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent overPricing = new Intent(getApplicationContext(), OverPricingActivity.class);
                startActivity(overPricing);
                Log.e("rumesh", "activity overpricing");
            }
        });


        travelFare=(Button)findViewById(R.id.btnTravelFares);
        travelFare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent traverFareInt=new Intent(getApplicationContext(),TravelFareActivity.class);
                startActivity(traverFareInt);
                Log.e("rumesh","activity overpricing");
            }
        });

        foodPrices=(Button)findViewById(R.id.btnFoodPrices);
        foodPrices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodPricesActivity=new Intent(getApplicationContext(),FoodPricesActivity.class);
                startActivity(foodPricesActivity);
                Log.e("rumesh","activity overpricing");
            }
        });
    }
}

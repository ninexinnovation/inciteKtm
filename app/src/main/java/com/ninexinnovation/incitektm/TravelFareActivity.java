package com.ninexinnovation.incitektm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TravelFareActivity extends AppCompatActivity {
    Button local;
    Button taxi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_fare);
        local=(Button)findViewById(R.id.btnLocal);
        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent traverFareLocal = new Intent(getApplicationContext(), TravelFareLocal.class);
                startActivity(traverFareLocal);
                Log.e("rumesh", "activity overpricing");
            }
        });
        taxi=(Button)findViewById(R.id.btnTaxi);
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent traverFareTaxi = new Intent(getApplicationContext(), TravelFareTaxi.class);
                startActivity(traverFareTaxi);
                Log.e("rumesh", "activity overpricing");
            }
        });
    }
}

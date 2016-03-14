package com.ninexinnovation.incitektm;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.ninexinnovation.incitektm.Objects.CustomListAdapter;
import com.ninexinnovation.incitektm.Objects.JSONParser;
import com.ninexinnovation.incitektm.Objects.ListModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class OverPricingActivity extends AppCompatActivity {
    private ProgressDialog dialog;
    volatile ListView list;
    volatile CustomListAdapter adapter;
    Resources res;
    JSONArray clientData=null;
    public volatile OverPricingActivity CustomListView = null;
    public volatile  ArrayList<ListModel> CustomListViewValuesArr = new ArrayList<ListModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_pricing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addProfile=new Intent(getApplicationContext(),OverPricingCreateProfile.class);
                startActivity(addProfile);
            }
        });

        CustomListView = this;
        res = getResources();
        list = (ListView) findViewById(R.id.listView);
        dialog = ProgressDialog.show(this, "", "Loading...");
//        new Thread() {
//            public void run() {
//                String url = "https://sheetsu.com/apis/9324bc62";
//
//                JSONParser jsonParser = new JSONParser();
//                JSONObject dataObject;
//                try {
//                    dataObject = jsonParser.makeHttpRequest(url, "GET", null, null);
//                    clientData = dataObject.getJSONArray("result");
//                    Log.e("rumesh", clientData.toString());
//                    if (clientData == null) {
//                        setListData();
//                    } else {
//                        int no = clientData.length();
//                        for(int i=0;i<no;i++){
////                            clientData.getJSONObject(i);
//                            final ListModel sched = new ListModel();
//                            sched.setProfileId(clientData.getJSONObject(i).getInt("profile_id"));
//                            sched.setProfileName(clientData.getJSONObject(i).getString("title"));
//                            sched.setProductName(clientData.getJSONObject(i).getString("item"));
//                            sched.setLocation(clientData.getJSONObject(i).getString("location"));
//                            sched.setRating(clientData.getJSONObject(i).getString("rating"));
//                            sched.setDescription(clientData.getJSONObject(i).getString("description"));
//
//                            CustomListViewValuesArr.add(sched);
//                        }
////                        setListData();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                dialog.dismiss();
//                OverPricingActivity.this.runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//
//                        adapter = new CustomListAdapter(CustomListView, CustomListViewValuesArr,res);
//                        list.setAdapter(adapter);
//                    }
//                });
//
//            }
//        }.start();

        setListData();
        dialog.dismiss();
        adapter = new CustomListAdapter(CustomListView, CustomListViewValuesArr,res);
        list.setAdapter(adapter);
    }
    public void setListData()
    {

//        for (int i = 0; i < 11; i++) {

            final ListModel sched = new ListModel();
        sched.setProfileId(1);
        sched.setProfileName("abc pvt.ltd");
        sched.setProductName("Apple");
        sched.setLocation("newroad");
        sched.setRating("50");
        sched.setDescription("Apple costs 150 per kg");

            CustomListViewValuesArr.add( sched );
//        }
        sched.setProfileId(1);
        sched.setProfileName("abc pvt.ltd");
        sched.setProductName("Apple");
        sched.setLocation("newroad");
        sched.setRating("50");
        sched.setDescription("Apple costs 150 per kg");

        CustomListViewValuesArr.add( sched );

        sched.setProfileId(1);
        sched.setProfileName("abc pvt.ltd");
        sched.setProductName("Apple");
        sched.setLocation("newroad");
        sched.setRating("50");
        sched.setDescription("Apple costs 150 per kg");

        CustomListViewValuesArr.add( sched );

    }

    public void onItemClick(int mPosition) {
        Log.e("rumesh","positiong:"+mPosition);
        Intent profile=new Intent(getApplication(),OverPricingProfile.class);
        
        startActivity(profile);
    }
}

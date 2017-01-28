package com.geniusnine.android.mathsformulaandbraintrainergame.formula.integration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class IntegrationHome extends AppCompatActivity {

    ListView IntegrationListView;
    ArrayAdapter<String> adapter;
    String IntegrationList[]={"Integrals By partial fractions","Integrals Involving Roots","Integrals Involving Trognometric Functions",
                           "Transformations","Applications"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integration_home);

        IntegrationListView = (ListView) findViewById(R.id.IntegrationList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_integration_home, R.id.textViewIntegration, IntegrationList);
        IntegrationListView.setAdapter(adapter);
        IntegrationListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}
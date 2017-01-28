package com.geniusnine.android.mathsformulaandbraintrainergame.formula.derivative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class DerivativeHome extends AppCompatActivity {

    ListView derivativeListView;
    ArrayAdapter<String> adapter;
    String derivativeList[]={"Limit","Derivative","Differentiation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derivative_home);

        derivativeListView = (ListView) findViewById(R.id.DerivativeList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_derivative_home, R.id.textViewDerivative, derivativeList);
        derivativeListView.setAdapter(adapter);
        derivativeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}
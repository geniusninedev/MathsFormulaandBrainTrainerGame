package com.geniusnine.android.mathsformulaandbraintrainergame.formula.unitConversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class UnitConversionHome extends AppCompatActivity {

    ListView UnitConversionListView;
    ArrayAdapter<String> adapter;
    String UnitConversionList[]={"Length","Area","Volume","Mass","Time","Speed","Temperature","Density","Force","Energy","Power","Pressure"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_conversion_home);

        UnitConversionListView = (ListView) findViewById(R.id.UnitConversionList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_unit_conversion_home, R.id.textViewUnitConversion, UnitConversionList);
        UnitConversionListView.setAdapter(adapter);
        UnitConversionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}
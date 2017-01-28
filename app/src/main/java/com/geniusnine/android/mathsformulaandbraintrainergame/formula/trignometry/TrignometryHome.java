package com.geniusnine.android.mathsformulaandbraintrainergame.formula.trignometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class TrignometryHome extends AppCompatActivity {



    ListView TrignometryListView;
    ArrayAdapter<String> adapter;
    String TrignometryList[]={"Trigonometry Functions for a Right Triangle","Trigonometric Tables","Co-ratios","Basic Formulas","Multiple Angle Formulas",
                             "Powers OF Trigonometric Functions", "Formulas With T=tan(x/2)","Addition Formulas","Sum Of Trigonometric Functions","product Of Trigonometric Functions",
                            "Half Angle Formulas", "Angles Of A Plane Triangle","Sides And Angles Of A Plane Triangle","relationShips Among Trionometric functions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trignometry_home);

        TrignometryListView = (ListView) findViewById(R.id.TrignometryList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_trignometry_home, R.id.textViewTrignometry, TrignometryList);
        TrignometryListView.setAdapter(adapter);
        TrignometryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}
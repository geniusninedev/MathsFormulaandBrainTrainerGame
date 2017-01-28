package com.geniusnine.android.mathsformulaandbraintrainergame.formula.equations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class EquationsHome extends AppCompatActivity {

    ListView equationsListView;
    ArrayAdapter<String> adapter;
    String equations[]={"Linear Equations","System Of Two Linear Equations","Quadratic Equation","Exponential Equation","logarithmic Equation","Linear Inequation",
                        "Quadratic Inequation","Exponential Inequation","logarithmic Inequation","Trignometric Inequations","Constant","Absolute","square root",
                         "Parabolic","Cubic","Reciprocal","Sec","Cosec","Horizontal Shifting","Vertical Shifting","Reflection","Stretching"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equations_home);

        equationsListView = (ListView) findViewById(R.id.EquationsList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_equations_home, R.id.textViewEquations, equations);
        equationsListView.setAdapter(adapter);
        equationsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}
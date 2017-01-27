package com.geniusnine.android.mathsformulaandbraintrainergame.formula.algebra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class AlgebraHome extends AppCompatActivity {

    ListView algebraListView;
    ArrayAdapter<String> adapter;
    String algebraList[]={"Polonomial","Fractions","Identity","Exponentation","Roots","Arthematic progression","Geometric progression","Summations",
                           "Decimal Logarithm","Natural Logarithm","Complex Plane","Eulers formula"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_home);

        algebraListView = (ListView) findViewById(R.id.algebraList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_algebra_home, R.id.textViewAlgebra, algebraList);
        algebraListView.setAdapter(adapter);
        algebraListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });



    }
}

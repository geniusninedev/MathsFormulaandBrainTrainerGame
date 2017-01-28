package com.geniusnine.android.mathsformulaandbraintrainergame.formula.matrices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class MatricesHome extends AppCompatActivity {

    ListView MatricesListView;
    ArrayAdapter<String> adapter;
    String MatricesList[]={"Transpose Of Matrix","Addition And Subtraction Of Matrices","Multiplication Of Matrices","Determinant Of Matix","Inverse Of Matrix",
                           "Equation In Matrix Form","Properties of Matrix Calculations"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrices_home);

        MatricesListView = (ListView) findViewById(R.id.MatricesList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_matrices_home, R.id.textViewMatrices, MatricesList);
        MatricesListView.setAdapter(adapter);
        MatricesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}
package com.geniusnine.android.mathsformulaandbraintrainergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.formula.algebra.AlgebraHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.analyticGeometry.AnalyticGeometryHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.derivative.DerivativeHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.equations.EquationsHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.geometry.GeometryHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.integration.IntegrationHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.matrices.MatricesHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.statistics.StatisticsHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.trignometry.TrignometryHome;
import com.geniusnine.android.mathsformulaandbraintrainergame.formula.unitConversion.UnitConversionHome;


public class Formulas extends AppCompatActivity {

    ListView formulaListView;
    ArrayAdapter<String> adapter;
    String formulaList[]={"Geometry","Algebra","Trigonometry","Equations","Analytic geometry","Derivative",
                          "Integration","Matrices","Statistics","Units Conversion"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);
        formulaListView = (ListView) findViewById(R.id.formulalist);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_formulas, R.id.textView2, formulaList);
        formulaListView.setAdapter(adapter);
        formulaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent GeometryIntent = new Intent(Formulas.this, GeometryHome.class);
                    startActivity(GeometryIntent);
                }

                if (position == 1) {
                    Intent AlgebraIntent = new Intent(Formulas.this, AlgebraHome.class);
                    startActivity(AlgebraIntent);
                }
                if (position == 2) {
                    Intent TrignometryIntent = new Intent(Formulas.this, TrignometryHome.class);
                    startActivity(TrignometryIntent);
                }
                if (position == 3) {
                    Intent EquationsIntent = new Intent(Formulas.this, EquationsHome.class);
                    startActivity(EquationsIntent);
                }
                if (position == 4) {
                    Intent AnalyticGeometryIntent = new Intent(Formulas.this, AnalyticGeometryHome.class);
                    startActivity(AnalyticGeometryIntent);
                }
                if (position == 5) {
                    Intent DerivativeIntent = new Intent(Formulas.this, DerivativeHome.class);
                    startActivity(DerivativeIntent);
                }
                if (position == 6) {
                    Intent IntegrationIntent = new Intent(Formulas.this, IntegrationHome.class);
                    startActivity(IntegrationIntent);
                }
                if (position == 7) {
                    Intent MatricesIntent = new Intent(Formulas.this, MatricesHome.class);
                    startActivity(MatricesIntent);
                }
                if (position == 8) {
                    Intent StatisticsIntent = new Intent(Formulas.this, StatisticsHome.class);
                    startActivity(StatisticsIntent);
                }
                if (position == 9) {
                    Intent UnitConversionIntent = new Intent(Formulas.this, UnitConversionHome.class);
                    startActivity(UnitConversionIntent);
                }









            }

        });

    }
}

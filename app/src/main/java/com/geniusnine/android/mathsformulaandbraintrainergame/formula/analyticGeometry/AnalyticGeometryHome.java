package com.geniusnine.android.mathsformulaandbraintrainergame.formula.analyticGeometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class AnalyticGeometryHome extends AppCompatActivity {

    ListView analyticGeometryListView;
    ArrayAdapter<String> adapter;
    String analyticGeometryList[]={"Points","Triangle","Equation Of Line","Equation Of Circle","Ellipse","Hyperbola","Parabola","Line","Equation Of Line Joining two points A , B","Plane",
                           "Equation Of Sphere Center At M And Radius R In Rectangular Coordinates","Equation Of Ellipsoid With Center M And Semi-Axes A,B,C",
                           "Elliptic Cylinder With Axis As Z Axis","Hyperboloid Of One Sheet","Hyperboloid Of Two Sheets","Elliptic Paraboloid","Hyperbolic paraboloid"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytic_geometry_home);

        analyticGeometryListView = (ListView) findViewById(R.id.analyticGeometryList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_analytic_geometry_home, R.id.textViewAnalyticGeometry, analyticGeometryList);
        analyticGeometryListView.setAdapter(adapter);
        analyticGeometryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}

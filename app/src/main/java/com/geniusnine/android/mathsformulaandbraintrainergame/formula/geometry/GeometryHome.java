package com.geniusnine.android.mathsformulaandbraintrainergame.formula.geometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class GeometryHome extends AppCompatActivity {

    ListView GeometryListView;
    ArrayAdapter<String> adapter;
    String geometryList[]={"Triangle","Right Triangle","square","Rectangle","Parallelogram","Lozenge","Trapezoid","Convex Quadrilateral","Circle",
                        "Segment Of Circle","Sector Of Circle","Regular Polygon Of N Sides","Hexagon","Sphere","Spherical Cap","Spherical Segment","Spherical Sector",
                        "Torus","Cylinder", "Cone","Frustum Of Right Circular Cone","Pyramid","Cuboid","Triangular Prism"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_home);
        GeometryListView = (ListView) findViewById(R.id.GeometryList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_geometry_home, R.id.textViewGeometry, geometryList);
        GeometryListView.setAdapter(adapter);
        GeometryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent GeometryIntent=new Intent(GeometryHome.this,CallGeometryDetails.class);
                GeometryIntent.putExtra("key",position);
                startActivity(GeometryIntent);
            }

        });
    }
}
package com.geniusnine.android.mathsformulaandbraintrainergame.formula.statistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.mathsformulaandbraintrainergame.R;

public class StatisticsHome extends AppCompatActivity {

    ListView StatisticsListView;
    ArrayAdapter<String> adapter;
    String StatisticsList[]={"Set","Subset","Intersection","Union","Relative complement Of A in B","Absolute Complement","Symmetric Difference","Operations On Sets",
                          "Combinations","Permutations","Mean","Median","Example","Geometric Mean","Harmonic Mean","Variance","Standard Deviation","Root Mean Square",
                           "Normal distribution(gaussian Distribution)","Exponential Distribution","Poisson Distribution","Uniform Distribution"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_home);

        StatisticsListView = (ListView) findViewById(R.id.StatisticsList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_statistics_home, R.id.textViewStatistics, StatisticsList);
        StatisticsListView.setAdapter(adapter);
        StatisticsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }

        });
    }
}
package com.example.fikridzakwan.sunsetplace;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends AppCompatActivity {

    int[] gambarSunset;
    String[] namaSunset;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        namaSunset = getResources().getStringArray(R.array.nama_tempat);
        gambarSunset = new int[]{R.drawable.bromo, R.drawable.derawan, R.drawable.keraton, R.drawable.kalibiru,
        R.drawable.toba, R.drawable.kuta, R.drawable.suluban, R.drawable.selatlombok, R.drawable.umang, R.drawable.pening,
        R.drawable.gili, R.drawable.tegal, R.drawable.embung, R.drawable.losari, R.drawable.parangtritis, R.drawable.ulun, R.drawable.sundakelapa
        };

        AdapterSunset adapter = new AdapterSunset(this, gambarSunset, namaSunset);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}

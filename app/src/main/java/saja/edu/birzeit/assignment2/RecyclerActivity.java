package saja.edu.birzeit.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.alkanes_recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        Alkanes[] alkanes = new Alkanes[]{
                new Alkanes("methane","1 carbone",R.drawable.methane),
                new Alkanes("ethane","2 carbone",R.drawable.ethane),
                new Alkanes("propane","3 carbone",R.drawable.propane),
                new Alkanes("butane","4 carbone",R.drawable.butane),
                new Alkanes("pentane","5 carbone",R.drawable.pentane)


        };


        AlkanesAdapter alkanesAdapter = new AlkanesAdapter(alkanes,RecyclerActivity.this);
        recycler.setAdapter(alkanesAdapter);
    }
}
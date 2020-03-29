package de.lukaszchalat.padtm4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = {"Pies", "Kot", "Koń", "Gołąb", "Kruk", "Dzik", "Karp", "Osioł", "Chomik", "Mysz", "Jeż", "Karaluch"};
        this.target = new ArrayList<>();
        target.addAll(Arrays.asList(values));
        this.adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, this.target);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(this.adapter);
    }
}

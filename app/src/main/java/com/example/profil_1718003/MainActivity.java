package com.example.profil_1718003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    String spinner_items[] = {"English", "Indonesia", "Chinese"};
    ArrayAdapter<String>arrayAdapter;
    TextView followers, likes, tags;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spiner);
        arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, spinner_items);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        followers = findViewById(R.id.followers);
        likes = findViewById(R.id.likes);
        tags = findViewById(R.id.tags);
        if (item == "English"){
            followers.setText("Followers");
            likes.setText("Likes");
            tags.setText("Tags");
        }else if(item == "Indonesia"){
            followers.setText("Pengikut");
            likes.setText("Suka");
            tags.setText("Menandai");
        }else if(item == "Chinese"){
            followers.setText("追随者");
            likes.setText("喜欢它");
            tags.setText("马克");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

package com.example.hackateam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class searchHackers extends AppCompatActivity {

    //ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hackers);
        RecyclerView list = (RecyclerView)findViewById(R.id.godihopethisworks);
        list.setLayoutManager(new LinearLayoutManager(this));
        String[] names = {"Prerana", "Monica", "Yan", "Gagandeep"};
        list.setAdapter(new adapter(names));
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
    }

    public void openProfile(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

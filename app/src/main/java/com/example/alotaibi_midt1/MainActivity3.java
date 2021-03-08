package com.example.alotaibi_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button10 = (Button) findViewById(R.id.button4);
        Button button11 = (Button) findViewById(R.id.button5);

        String[] sushi={"Koala1","Koala2","California Tempura","Sushi site"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main, R.id.textView5, sushi));

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity2.class));
            }
        });
    }



    protected void onListItemClick(ListView listView, View view, int position, long id){
        super.onListItemClick(listView, view, position, id);

        switch(position){
            case 0:  startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu"))); break;
            case 1: startActivity(new Intent(MainActivity3.this, splash.class)); break;

        }
    }
}
package com.example.turate.googlesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText met1;
    public String query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        met1 = (EditText) findViewById(R.id.et1);
    }

    public void newActivity(View v){
        try {
            query = met1.getText().toString();
            //if query is empty
            if(query.isEmpty()){
                Toast.makeText(this, "Enter Some Query", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent googleIt = new Intent(Intent.ACTION_WEB_SEARCH);
                googleIt.putExtra(SearchManager.QUERY, query);
                startActivity(googleIt);
            }

        }
        catch (Exception e){
            Toast.makeText(this, "SOMETHING WENT WRONG", Toast.LENGTH_SHORT).show();
        }
    }
}

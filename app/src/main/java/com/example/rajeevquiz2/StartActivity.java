package com.example.rajeevquiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void quizClick(View view) {
        Intent intent = new Intent(StartActivity.this, MainActivity.class) ;
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.example, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId() ;
        if(id == R.id.about)
        {
            //openActivity();
            Intent intent = new Intent(StartActivity.this,Rajeev.class) ;
            startActivity(intent);
            //Toast.makeText(getApplicationContext(), "Resume", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item) ;
    }

    public void openActivity()
    {
        Intent intent = new Intent(StartActivity.this,Resume.class) ;
        startActivity(intent);
    }
}

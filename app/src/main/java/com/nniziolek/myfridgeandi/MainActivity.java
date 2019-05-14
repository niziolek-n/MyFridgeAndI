package com.nniziolek.myfridgeandi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CardView cd1, cd2, cd3, cd4;
    Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cd1 = (CardView) findViewById(R.id.card1);
        cd2 = (CardView) findViewById(R.id.card2);
        cd3 = (CardView) findViewById(R.id.card3);
        cd4 = (CardView) findViewById(R.id.card4);
        myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked Card 1", Toast.LENGTH_LONG).show();
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked Card 2", Toast.LENGTH_LONG).show();
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked Card 3", Toast.LENGTH_LONG).show();
            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked Card 4", Toast.LENGTH_LONG).show();
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {

            Toast.makeText(this, "Search bar", Toast.LENGTH_SHORT).show();

            return true;
        } else if (id==R.id.action_sort) {

            Toast.makeText(this, "Sorting", Toast.LENGTH_SHORT).show();

        } else if (id==R.id.action_all_products) {

            Toast.makeText(this, "All products", Toast.LENGTH_SHORT).show();

        } else if (id==R.id.action_shopping_list)   {

            Toast.makeText(this, "Shopping list", Toast.LENGTH_SHORT).show();

        } else if (id==R.id.action_settings) {

            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.vito.igra;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    static int level=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b2=(Button)findViewById(R.id.button2);
        b2.setEnabled(false);

        Button b3=(Button)findViewById(R.id.button3);
        b3.setEnabled(false);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("level");
            if(value.equalsIgnoreCase("up")&&level==0){
                level=1;
            }else if(value.equalsIgnoreCase("up")&&level==1){
                level=2;
            }
        }

        if(level>0){
            b2.setEnabled(true);
        }
        if(level>1){
            b3.setEnabled(true);
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void Uvod(View v){
        Intent intent = new Intent(this, Uvod.class);
        startActivity(intent);
    }
    public void Liki(View v){
        Intent intent = new Intent(this, Liki.class);
        startActivity(intent);
    }

    public void izhod(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void podobnost(View v){
        Intent intent = new Intent(this, Podobnost.class);
        startActivity(intent);
    }
}

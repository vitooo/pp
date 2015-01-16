package com.example.vito.igra;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Uvod extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvod);


        Bitmap slika= BitmapFactory.decodeResource(getResources(), R.drawable.crte);
        Bitmap newBitmap1 = Bitmap.createBitmap(slika, 0, 0, 72,72, null, false);
        Bitmap newBitmap2 = Bitmap.createBitmap(slika, 0, 72, 72,72, null, false);

        ImageView image1 = (ImageView)findViewById(R.id.imageView);
        image1.setImageBitmap(newBitmap1);

        ImageView image2 = (ImageView)findViewById(R.id.imageView2);
        image2.setImageBitmap(newBitmap2);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_uvod, menu);
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
    public void Naprej(View v){
        Intent intent = new Intent(this, Uvod2.class);
        startActivity(intent);
    }
}

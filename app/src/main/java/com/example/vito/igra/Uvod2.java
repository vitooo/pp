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

import java.util.Random;


public class Uvod2 extends ActionBarActivity {
    public static Bitmap slika;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvod2);
        initSliko();




        int min2 = 0;
        int max2 = 10;

        Random r = new Random();

        int i1 = r.nextInt(max2 - min2 + 1) + min2;
        int i2 = r.nextInt(max2 - min2 + 1) + min2;

        Bitmap newBitmap1 = Bitmap.createBitmap(slika, i1*72, 0, 72,72, null, false);
        Bitmap newBitmap2 = Bitmap.createBitmap(slika, i2*72, 72, 72,72, null, false);



        ImageView image1 = (ImageView)findViewById(R.id.imageButton);
        image1.setImageBitmap(newBitmap1);

        ImageView image2 = (ImageView)findViewById(R.id.imageButton2);
        image2.setImageBitmap(newBitmap2);


    }
    public void initSliko(){
        slika= BitmapFactory.decodeResource(getResources(), R.drawable.crte);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_uvod2, menu);
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
    public void pravilno(View v){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("level","up");
        startActivity(intent);
    }
    public void napacno(View v){
        Intent intent = new Intent(this, Uvod2.class);
        startActivity(intent);
    }
}

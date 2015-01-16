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


public class Podobnost extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podobnost);

        Bitmap slika= BitmapFactory.decodeResource(getResources(), R.drawable.podobno);
        Bitmap newBitmap1 = Bitmap.createBitmap(slika, 72*1, 2*72, 72,72, null, false);
        Bitmap newBitmap2 = Bitmap.createBitmap(slika, 72*1, 3*72, 72,72, null, false);
        Bitmap newBitmap3 = Bitmap.createBitmap(slika, 72*1, 4*72, 72,72, null, false);
        Bitmap newBitmap4 = Bitmap.createBitmap(slika, 72*1, 5*72, 72,72, null, false);


        ImageView image1 = (ImageView)findViewById(R.id.imageView16);
        image1.setImageBitmap(newBitmap1);

        ImageView image2 = (ImageView)findViewById(R.id.imageView17);
        image2.setImageBitmap(newBitmap2);

        ImageView image3 = (ImageView)findViewById(R.id.imageView18);
        image3.setImageBitmap(newBitmap3);

        ImageView image4 = (ImageView)findViewById(R.id.imageView19);
        image4.setImageBitmap(newBitmap4);





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_podobnost, menu);
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
    public void podobno2(View v){
        Intent intent = new Intent(this, Podobnost2.class);
        startActivity(intent);
    }
}

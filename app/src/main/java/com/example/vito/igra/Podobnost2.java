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
import android.widget.TextView;

import java.util.Random;


public class Podobnost2 extends ActionBarActivity {
    int izbira;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podobnost2);

        Bitmap slika= BitmapFactory.decodeResource(getResources(), R.drawable.podobno);
        Random r= new Random();

        izbira=r.nextInt(4);
        int x=r.nextInt(4);



        Bitmap newBitmap1 = Bitmap.createBitmap(slika, 72*x, 2*72, 72,72, null, false);x=r.nextInt(4);
        Bitmap newBitmap2 = Bitmap.createBitmap(slika, 72*x, 3*72, 72,72, null, false);x=r.nextInt(4);
        Bitmap newBitmap4 = Bitmap.createBitmap(slika, 72*x, 4*72, 72,72, null, false);x=r.nextInt(4);
        Bitmap newBitmap5 = Bitmap.createBitmap(slika, 72*x, 5*72, 72,72, null, false);x=r.nextInt(4);


        Bitmap newBitmap3 = Bitmap.createBitmap(slika, 72*x, (izbira+2)*72, 72,72, null, false);


        ImageView image1 = (ImageView)findViewById(R.id.imageView20);
        image1.setImageBitmap(newBitmap1);

        ImageView image2 = (ImageView)findViewById(R.id.imageView21);
        image2.setImageBitmap(newBitmap2);

        ImageView image3 = (ImageView)findViewById(R.id.imageView22);
        image3.setImageBitmap(newBitmap3);

        ImageView image4 = (ImageView)findViewById(R.id.imageView23);
        image4.setImageBitmap(newBitmap4);

        ImageView image5 = (ImageView)findViewById(R.id.imageView24);
        image5.setImageBitmap(newBitmap5);

        TextView tw=(TextView)findViewById(R.id.textView12);
        String s=""+izbira;
        tw.setText(s);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_podobnost2, menu);
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
    public void testTile(View v){
        TextView tw=(TextView)findViewById(R.id.textView12);
        String s=""+izbira;
        tw.setText(s);
        switch(v.getId()){
            case R.id.imageView20:
                if(izbira==0){
                    s=":)";
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("level","konec");
                    startActivity(intent);
                }else{
                    s=":( poskusi znova";
                    Intent intent = new Intent(this, Podobnost2.class);
                    startActivity(intent);
                }

            case R.id.imageView21:
                if(izbira==1){
                    s=":)";
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("level","konec");
                    startActivity(intent);
                }else{
                    s=":( poskusi znova";
                    Intent intent = new Intent(this, Podobnost2.class);
                    startActivity(intent);
                }
            case R.id.imageView23:
                if(izbira==2){
                    s=":)";
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("level","konec");
                    startActivity(intent);
                }else{
                    s=":( poskusi znova";
                    Intent intent = new Intent(this, Podobnost2.class);
                    startActivity(intent);
                }
            case R.id.imageView24:
                if(izbira==3){
                    s=":)";
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("level","konec");
                    startActivity(intent);
                }else{
                    s=":( poskusi znova";
                    Intent intent = new Intent(this, Podobnost2.class);
                    startActivity(intent);
                }

        }
        tw.setText(s);

    }
}

package com.example.vito.igra;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class Liki2 extends ActionBarActivity {
    static String[]likii={"pravokotnike","kvadrate","kroge","trikotnike"};
    int[][]knofi=new int[9][3];
    int izbira;
    int vsi;
    int odkriti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {










        /*
        0=trikotnik
        1=kvadrat
        2=pravokot.
        3=krog

         */



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liki2);

        Bitmap slika= BitmapFactory.decodeResource(getResources(), R.drawable.liki);
        Random r = new Random();

        izbira=r.nextInt(4);

        for(int i=0;i<9;i++){
            knofi[i][0]=r.nextInt(10);
            int xx=r.nextInt(4);
            if(xx==izbira){
                vsi++;
            }
            knofi[i][1]=xx;
            knofi[i][2]=0;
        }
        /*Bitmap newBitmap1 = Bitmap.createBitmap(slika, knofi[0][0]*72, knofi[0][1]*72, 72,72, null, false);
        ImageView iv=(ImageView)findViewById(R.id.imageView7);
        iv.setImageBitmap(newBitmap1);
*/
        ImageView image1 = (ImageView)findViewById(R.id.imageView7);

        ImageView image2 = (ImageView)findViewById(R.id.imageView8);

        ImageView image3 = (ImageView)findViewById(R.id.imageView9);

        ImageView image4 = (ImageView)findViewById(R.id.imageView10);

        ImageView image5 = (ImageView)findViewById(R.id.imageView11);

        ImageView image6 = (ImageView)findViewById(R.id.imageView12);

        ImageView image7 = (ImageView)findViewById(R.id.imageView13);

        ImageView image8 = (ImageView)findViewById(R.id.imageView14);

        ImageView image9 = (ImageView)findViewById(R.id.imageView15);

        Bitmap newBitmap1 = Bitmap.createBitmap(slika, knofi[0][0]*72, knofi[0][1]*72, 72,72, null, false);
        image1.setImageBitmap(newBitmap1);

        Bitmap newBitmap2 = Bitmap.createBitmap(slika, knofi[1][0]*72, knofi[1][1]*72, 72,72, null, false);
        image2.setImageBitmap(newBitmap2);

        Bitmap newBitmap3 = Bitmap.createBitmap(slika, knofi[2][0]*72, knofi[2][1]*72, 72,72, null, false);
        image3.setImageBitmap(newBitmap3);

        Bitmap newBitmap4 = Bitmap.createBitmap(slika, knofi[3][0]*72, knofi[3][1]*72, 72,72, null, false);
        image4.setImageBitmap(newBitmap4);

        Bitmap newBitmap5 = Bitmap.createBitmap(slika, knofi[4][0]*72, knofi[4][1]*72, 72,72, null, false);
        image5.setImageBitmap(newBitmap5);

        Bitmap newBitmap6 = Bitmap.createBitmap(slika, knofi[5][0]*72, knofi[5][1]*72, 72,72, null, false);
        image6.setImageBitmap(newBitmap6);

        Bitmap newBitmap7 = Bitmap.createBitmap(slika, knofi[6][0]*72, knofi[6][1]*72, 72,72, null, false);
        image7.setImageBitmap(newBitmap7);

        Bitmap newBitmap8 = Bitmap.createBitmap(slika, knofi[7][0]*72, knofi[7][1]*72, 72,72, null, false);
        image8.setImageBitmap(newBitmap8);

        Bitmap newBitmap9 = Bitmap.createBitmap(slika, knofi[8][0]*72, knofi[8][1]*72, 72,72, null, false);
        image9.setImageBitmap(newBitmap9);


        TextView tw=(TextView)findViewById(R.id.textView9);
        tw.setText("Izberi vse "+likii[izbira]);

        TextView tw1=(TextView)findViewById(R.id.textView10);
        tw1.setText("vsi: "+vsi+"  odkriti "+odkriti);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_liki2, menu);
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

    public void checkTile(View v){
        switch (v.getId()){
            case R.id.imageView7:
                if(knofi[0][1]==izbira&&knofi[0][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView7);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[0][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView8:
                if(knofi[1][1]==izbira&&knofi[1][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView8);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[1][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView9:
                if(knofi[2][1]==izbira&&knofi[2][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView9);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[2][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView10:
                if(knofi[3][1]==izbira&&knofi[3][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView10);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[3][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView11:
                if(knofi[4][1]==izbira&&knofi[4][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView11);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[4][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView12:
                if(knofi[5][1]==izbira&&knofi[5][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView12);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[5][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView13:
                if(knofi[6][1]==izbira&&knofi[6][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView13);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[6][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView14:
                if(knofi[7][1]==izbira&&knofi[7][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView14);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[7][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
            case R.id.imageView15:
                if(knofi[8][1]==izbira&&knofi[8][2]==0){
                    ImageView iv=(ImageView)findViewById(R.id.imageView15);
                    //iv.setImageAlpha(100);
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":)");
                    knofi[8][2]=1;
                    odkriti++;
                }else{
                    TextView tw=(TextView)findViewById(R.id.textView10);
                    tw.setText(":(");
                }
        }
        TextView tw=(TextView)findViewById(R.id.textView10);
        tw.setText("Vsi "+vsi+"  odkriti"+odkriti);
        if(vsi==odkriti){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("level","up");
            startActivity(intent);
        }

    }


}

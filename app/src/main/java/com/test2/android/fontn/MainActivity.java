package com.test2.android.fontn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public int REQUEST_CODE_CHECK = 1;
    public int resultCode;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    public void onButtonClick(View v) {
        if (v.getId() == R.id.save_font) {
            Intent i = new Intent(MainActivity.this, Display.class);
            startActivity(i);
        }

//        if (v.getId() == R.id.restart_font) {
//            Intent i = new Intent(MainActivity.this, MainDisplay.class);
//            startActivityForResult(i, REQUEST_CODE_CHECK);
//            i.putExtra("firstFontItem", MainActivityFragment.alphabet[0]);
//            startActivity(i);
//        }

//        if(MainDisplay.requestCode == REQUEST_CODE_CHECK && resultCode == RESULT_OK){
//            final TextView displayString = (TextView) findViewById(R.id.charView);
//            displayString.setText(MainActivityFragment.alphabet[0]);
//        }

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


}

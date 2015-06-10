package com.example.android.myapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.widget.Toast;
import android.widget.Button;
import android.view.Gravity;


public class MainActivity extends ActionBarActivity {

    private Toast myAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void runSpotifyStreamer(View view) {
        displayToast(view);
    }

    public void runSuperDuo1(View view) {
        displayToast(view);

    }

    public void runSuperDuo2(View view) {
        displayToast(view);

    }

    public void runBuildBigger(View view) {
        displayToast(view);

    }

    public void runXyzReader(View view) {
        displayToast(view);

    }

    public void runCapstone(View view) {
        displayToast(view);

    }

    public void displayToast(View view){
        Button button = (Button) view;
        String buttonTxt = (String) button.getText();
        Context context = getApplicationContext();
        String text = getString(R.string.button_launch) + " " + buttonTxt;
        int duration = Toast.LENGTH_SHORT;

        if (myAppToast != null){
            myAppToast.cancel();   //cancel other Toast when new Button pressed
        }

        myAppToast = Toast.makeText(context, text, duration);
        //myAppToast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        myAppToast.show();

    }

}

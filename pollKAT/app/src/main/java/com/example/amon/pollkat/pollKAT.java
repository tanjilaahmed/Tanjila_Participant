package com.example.amon.pollkat;


import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.util.logging.LogRecord;


public class pollKAT extends ActionBarActivity {
    public static int TIME = 5000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll_kat);
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run() {
                Intent mainIntent = new Intent(pollKAT.this,PollKatPresenterParticipant.class);
                pollKAT.this.startActivity(mainIntent);
                pollKAT.this.finish();
                finish();
            }
        }, TIME);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_poll_kat, menu);
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
}

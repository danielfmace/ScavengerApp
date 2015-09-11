package edu.virginia.cs4720.scavenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

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


    public void startService(View view) {
        Intent intent = new Intent(this, GPSService.class);
        startService(intent);
    }

    public void stopService(View view) {
        Intent intent = new Intent(this, GPSService.class);
        stopService(intent);
    }

    public void addEvent(View view) {
        EditText name = (EditText) findViewById(R.id.nameEditText);
        EditText description = (EditText) findViewById(R.id.descriptionEditText);
        EditText date = (EditText) findViewById(R.id.dateEditText);
        EditText time = (EditText) findViewById(R.id.timeEditText);

        Intent intent = new Intent(this, NewEventActivity.class);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("description", description.getText().toString());
        intent.putExtra("date", date.getText().toString());
        intent.putExtra("time", time.getText().toString());

        startActivity(intent);
    }
}

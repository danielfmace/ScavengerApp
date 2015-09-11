package edu.virginia.cs4720.scavenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class NewEventActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView descriptionTextView;
    private TextView dateTextView;
    private TextView timeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

        Intent in = getIntent();
        Bundle b = in.getExtras();

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        dateTextView = (TextView) findViewById(R.id.dateTextView);
        timeTextView = (TextView) findViewById(R.id.timeTextView);

        nameTextView.setText((String) b.get("name"));
        descriptionTextView.setText((String) b.get("description"));
        dateTextView.setText((String) b.get("date"));
        timeTextView.setText((String) b.get("time"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_event, menu);
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

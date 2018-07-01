package com.example.mary.nanjubus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        TextView notes = (TextView) findViewById(R.id.notes);

        // Set a click listener on that View
        notes.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent notesIntent = new Intent(MainActivity.this, NotesActivity.class);

                // Start the new activity
                startActivity(notesIntent);
            }
        });

    }
}

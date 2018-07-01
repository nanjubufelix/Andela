package com.example.mary.nanjubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnswersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        TextView mainActivity = (TextView) findViewById(R.id.mainActivity);

        // Set a click listener on that View
        mainActivity.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent mainActivityIntent = new Intent(AnswersActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainActivityIntent);

            }
        });


    }
}

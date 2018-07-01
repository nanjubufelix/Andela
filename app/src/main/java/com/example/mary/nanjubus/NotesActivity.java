package com.example.mary.nanjubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        TextView questionOne = (TextView) findViewById(R.id.questionOne);

        // Set a click listener on that View
        questionOne.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent questionOneIntent = new Intent(NotesActivity.this, QuestionOne.class);

                // Start the new activity
                startActivity(questionOneIntent);

            }
        });
    }
}

package com.example.mary.nanjubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class ScoreActivity extends AppCompatActivity {
TextView totalPointsTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        totalPointsTextView = findViewById(R.id.pointsTextView);

        totalPointsTextView.setText(QuizSingleton.getInstance().getTotalScore()+" Points");

        TextView answers = (TextView) findViewById(R.id.answers);

        // Set a click listener on that View
        answers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent answersIntent = new Intent(ScoreActivity.this, AnswersActivity.class);





                // Start the new activity
                startActivity(answersIntent);

            }
        });

    }
}

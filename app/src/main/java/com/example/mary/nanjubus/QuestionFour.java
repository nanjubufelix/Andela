package com.example.mary.nanjubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionFour extends AppCompatActivity {
EditText editTextFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
editTextFinal = findViewById(R.id.editText);
        Button score = (Button) findViewById(R.id.score);

        // Set a click listener on that View
        score.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent scoreIntent = new Intent(QuestionFour.this, ScoreActivity.class);

                String answer = editTextFinal.getText().toString();


                if(editTextFinal.getText().toString().isEmpty())
                {
                    Toast.makeText(QuestionFour.this,"Please answer the question",Toast.LENGTH_LONG).show();
                    return;
                }

                double score =1;

                Answer qn4Answer = new Answer("About app?",4,answer,score);

                QuizSingleton.getInstance().addAnswer(qn4Answer);

                // Start the new activity
                startActivity(scoreIntent);

            }
        });


    }

}

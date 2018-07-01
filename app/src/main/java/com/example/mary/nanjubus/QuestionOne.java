package com.example.mary.nanjubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionOne extends AppCompatActivity {

    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        Button questionTwo = (Button) findViewById(R.id.questionTwo);
        group = findViewById(R.id.qn1Radio);
        // Set a click listener on that View
        questionTwo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                int checkedButtonId = group.getCheckedRadioButtonId();
                RadioButton checkedButton = findViewById(checkedButtonId);
                if (checkedButton !=null) {
                    Intent questionTwoIntent = new Intent(QuestionOne.this, QuestionTwo.class);
                    String answer = checkedButton.getText().toString();
                    double score =0;
                    if(answer.equalsIgnoreCase("Open source java application")){
                        score =1;
                    }
                    Answer qn1Answer = new Answer("What is a geoserver?",1,answer,score);

                    QuizSingleton.getInstance().addAnswer(qn1Answer);
                    // Start the new activity
                    startActivity(questionTwoIntent);
                }
            }
        });


    }
}

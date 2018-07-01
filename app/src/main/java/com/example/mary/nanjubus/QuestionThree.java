package com.example.mary.nanjubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionThree extends AppCompatActivity {
    CheckBox oracleCheckbox, java_and_oracleCheckbox, postgesqlCheckbox, postgisCheckbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);


        oracleCheckbox = findViewById(R.id.checkBox);
        java_and_oracleCheckbox = findViewById(R.id.checkBox2);
        postgesqlCheckbox = findViewById(R.id.checkBox3);
        postgisCheckbox = findViewById(R.id.checkBox4);

        Button questionFour = (Button) findViewById(R.id.questionFour);

        // Set a click listener on that View
        questionFour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent questionFourIntent = new Intent(QuestionThree.this, QuestionFour.class);


                String combinedAnswer ="";
                int counter=0;
                if(oracleCheckbox.isChecked()){
                    combinedAnswer=combinedAnswer+"Oracle, ";
                    counter++;
                }

                if(java_and_oracleCheckbox.isChecked()){
                    combinedAnswer=combinedAnswer+"Java and Oracle, ";
                    counter++;
                }

                if(postgesqlCheckbox.isChecked()){
                    combinedAnswer=combinedAnswer+"PostgreSQL, ";
                    counter++;
                }


                if(postgisCheckbox.isChecked()){
                    combinedAnswer=combinedAnswer+"PosGIS, ";
                    counter++;
                }
                double score;
                if (counter==0){
                    Toast.makeText(QuestionThree.this,"Please answer the question",Toast.LENGTH_LONG).show();
                    return;
                }
                else if(counter<=2){
                    if(combinedAnswer.contains("Oracle") && combinedAnswer.contains("Postgresql") ){
                        score=2.0;
                    }else if(combinedAnswer.contains("Oracle")){
                        score =1.0;
                    }else if(combinedAnswer.contains("PostgreSQL")){
                        score =1.0;
                    }else{
                        score=0;
                    }
                }else{
                    score =0.0;
                }
                Intent questionThreeIntent = new Intent(QuestionThree.this, QuestionThree.class);

                Answer qn3Answer = new Answer("What data types do we use in the geoserver?",3,combinedAnswer,score);

                QuizSingleton.getInstance().addAnswer(qn3Answer);
                // Start the new activity
                // Start the new activity


                // Start the new activity
                startActivity(questionFourIntent);

            }

        });

    }
}

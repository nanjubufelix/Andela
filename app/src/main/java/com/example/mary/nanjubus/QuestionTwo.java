package com.example.mary.nanjubus;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionTwo extends AppCompatActivity {
    CheckBox rasterCheckbox, integerCheckbox, characterCheckbox, vectorCheckbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        Button questionThree = (Button) findViewById(R.id.questionThree);

        rasterCheckbox = findViewById(R.id.checkBox);
        integerCheckbox = findViewById(R.id.checkBox2);
        characterCheckbox = findViewById(R.id.checkBox3);
        vectorCheckbox = findViewById(R.id.checkBox4);

        // Set a click listener on that View
        questionThree.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent questionThreeIntent = new Intent(QuestionTwo.this, QuestionThree.class);
                String combinedAnswer ="";
                int counter=0;
                if(rasterCheckbox.isChecked()){
                    combinedAnswer=combinedAnswer+"Raster, ";
                    counter++;
                }

                if(integerCheckbox.isChecked()){
                   combinedAnswer=combinedAnswer+"Integer, ";
                   counter++;
                }

                if(characterCheckbox.isChecked()){
                    combinedAnswer=combinedAnswer+"Character, ";
                    counter++;
                }


                if(vectorCheckbox.isChecked()){
                    combinedAnswer=combinedAnswer+"Vector, ";
                    counter++;
                }
                double score;
                if (counter==0){
                    Toast.makeText(QuestionTwo.this,"Please answer the question",Toast.LENGTH_LONG).show();
                    return;
                }
                else if(counter<=2){
                    if(combinedAnswer.contains("Raster") && combinedAnswer.contains("Vector") ){
                        score=2.0;
                    }else if(combinedAnswer.contains("Raster")){
                        score =1.0;
                    }else if(combinedAnswer.contains("Vector")){
                        score =1.0;
                    }else{
                        score=0;
                    }
                }else{
                    score =0.0;
                }
                    Intent questionTwoIntent = new Intent(QuestionTwo.this, QuestionTwo.class);

                    Answer qn2Answer = new Answer("What data types do we use in the geoserver?",1,combinedAnswer,score);

                QuizSingleton.getInstance().addAnswer(qn2Answer);
                // Start the new activity
                // Start the new activity


                // Start the new activity
                startActivity(questionThreeIntent);

            }

        });

    }
}

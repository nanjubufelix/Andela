package com.example.mary.nanjubus;

import java.util.ArrayList;

public class QuizSingleton {
    private static  QuizSingleton quizSingleton= new QuizSingleton();
    private QuizSingleton(){

    }

    public static QuizSingleton getInstance(){
        return quizSingleton;
    }

    public ArrayList<Answer> getAnswersList() {
        return answersList;
    }

    ArrayList<Answer> answersList = new ArrayList<>();
    public void addAnswer(Answer x){
        answersList.add(x);
    }

    public double getTotalScore(){
        double total_score=0;
        for(Answer y:answersList){
            total_score = total_score+y.getScore();
        }
        return total_score;
    }

    public void clearQuestions(){
        answersList.clear();
    }
}

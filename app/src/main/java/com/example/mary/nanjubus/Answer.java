package com.example.mary.nanjubus;

public class Answer {

    String qn;
    int qnNumber;

    public Answer(String qn, int qnNumber, String answer, double score) {
        this.qn = qn;
        this.qnNumber = qnNumber;
        this.answer = answer;
        this.score = score;
    }

    public String getQn() {
        return qn;
    }

    public void setQn(String qn) {
        this.qn = qn;
    }

    public int getQnNumber() {
        return qnNumber;
    }

    public void setQnNumber(int qnNumber) {
        this.qnNumber = qnNumber;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    String answer;
    double score;
}

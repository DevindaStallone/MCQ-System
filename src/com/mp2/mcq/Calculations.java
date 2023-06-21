package com.mp2.mcq;

public class Calculations {
    private String text;

    public String displayText;
    public int correctAnsCount;
    public int wrongAnsCount;

    public String QNumber;
//this the class to display when the user get a correct or wrong answer
    public String getText(){

        if (QuestionSet.answer.trim().equals(QuestionSet.correctAnswer.trim())){
            displayText = "Your answer is correct. Well done...!";

        }else {
            displayText = "Your answer is wrong. Correct answer is: "+ QuestionSet.correctAnswer;
        }
        return displayText;
    }
//this is the method to display out the correct answer count and wrong answer count

    public void setQuestionNumber(String questionNumber){
        this.QNumber = questionNumber;
    }
    public void setAnswerCounts(int correctAnsCount, int wrongAnsCount){
        this.correctAnsCount = correctAnsCount;
        this.wrongAnsCount = wrongAnsCount;
        if(this.QNumber.trim().equalsIgnoreCase("10")){
            System.out.println("Check Your Results...");
            System.out.println("Correct Answer Count: " + this.correctAnsCount);
            System.out.println("Correct Wrong Count: " + this.wrongAnsCount);
            finalScore();
        }
    }

// this is the method to calculate the score of the correct answer
    private void finalScore(){
        String score;

        if (correctAnsCount==10){
            score="100%";
        } else if (correctAnsCount==9) {
            score="90%";
        } else if (correctAnsCount==8) {
            score="80%";
        } else if (correctAnsCount==7) {
            score="70%";
        } else if (correctAnsCount==6) {
            score="60%";
        } else if (correctAnsCount==5) {
            score="50%";
        } else if (correctAnsCount==4) {
            score="40%";
        } else if (correctAnsCount==3) {
            score="30%";
        } else if (correctAnsCount==2) {
            score="20%";
        } else if (correctAnsCount==1) {
            score="10%";
        }else {
            score="0%";
        }
        System.out.println("");
        System.out.println("Your Score is "+ score);
    }
}


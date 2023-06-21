package com.mp2.mcq;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//this is the parent class
public abstract class QuestionSet {
    public static String answer;
    public static String correctAnswer;
    //here we have used encapsulations
    private String fileName;

    public int correctCount;
    public int wrongCount;

    public String[] questions;

    public QuestionSet (String fName){
        this.fileName = fName;
    }
    public String getFileName(){
        return this.fileName;
    }
//this is the method where the system displays the questions one by one to the user
    public void questions(){
        System.out.println("Displaying questions form " + this.fileName);
        String line;
        //String[] questions ;
        BufferedReader file= null;
        try{
            file = new BufferedReader(new FileReader(fileName));
            while (true) {
                //here when the 10 questions are over the repetition will stop
                if (!((line = file.readLine()) != null)) {
                    break;
                }
                questions = line.split(",");
                System.out.println(questions[0] + ") "
                        + questions[1] + "\n a.) "
                        + questions[2] + "\n b.) "
                        + questions[3] + "\n c.) "
                        + questions[4] + "\n d.) "
                        + questions[5]);
                QuestionSet.correctAnswer = questions[6];
                UserInput();
            }
        } catch (FileNotFoundException exception){
            System.out.println("Requested file not existing");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //this is the method to validate the answers given by the user
    public void UserInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter your answer: ");
        QuestionSet.answer = input.nextLine();
        if (QuestionSet.answer.trim().equalsIgnoreCase("a")|| QuestionSet.answer.trim().equalsIgnoreCase("b") || QuestionSet.answer.trim().equalsIgnoreCase("c") || QuestionSet.answer.trim().equalsIgnoreCase("d")){
            Calculations calculations=new Calculations();
            System.out.println(calculations.getText());
            if(calculations.getText().equalsIgnoreCase("Your answer is correct. Well done...!")){
                correctCount = correctCount + 1;
            }
            else{
                wrongCount = wrongCount + 1;
            }
            calculations.setQuestionNumber(questions[0]);
            calculations.setAnswerCounts(correctCount, wrongCount);
        }else {
            System.out.println("");
            System.out.println("Invalid Answer. Try again");
            System.out.println("");
            System.out.print("Enter your answer: ");
            QuestionSet.answer = input.nextLine();
        }
    }
}

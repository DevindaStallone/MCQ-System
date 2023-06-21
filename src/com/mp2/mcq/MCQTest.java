package com.mp2.mcq;

import java.util.Scanner;

public class MCQTest {
    //this is the main method where all the MCQ system runs
    public static void main(String[] args) {
        //scanner object is used to get the input from the user
        Scanner input = new Scanner(System.in);
        //printing the welcome note
        System.out.println("Welcome to MDS Institute");
        System.out.print("Enter your Name: ");
        //getting name input from the user
        String name = input.next();
        System.out.println("Welcome " + name + " to the MCQ quiz");
        displayQuestions();
        again();
    }
    public static void displayQuestions(){
        //this is where the course list is printing to the console
        System.out.println("Courses -");
        String[] course ={"1. HTML","2. Java","3. C++","4. Javascript"};
        for (String i : course) {
            System.out.println(i);
        }
        validateInput();
//this if condition is running depending on the user selecting course.
        if (courseNumValue==1){
            Html html = new Html();
            html.questions();

        } else if (courseNumValue==2) {
            Java java=new Java();
            java.questions();

        } else if (courseNumValue==3) {
            Cplusplus cPlusPlus = new  Cplusplus();
            cPlusPlus.questions();

        } else if (courseNumValue==4) {
            Javascript javascript = new Javascript();
            javascript.questions();
        }

    }
    public static int courseNumValue=0;
//this is the method of getting input of the relevant course and to validate the input
    public static void validateInput(){
        try{
            Scanner input=new Scanner(System.in);
            System.out.println("");
            //this is to get the input of the course to test
            System.out.print("please select the course number: ");
            int courseNum= input.nextInt();
            //this is done to validate the input that it is not out of range
            if (courseNum<=4){
                System.out.println("");
                courseNumValue=courseNum;
            }else{
                System.out.println("Invalid selection. Try again");
                validateInput();
            }
        } catch (Exception e){ //Handle Input Miss Match Exception
            System.out.println("Invalid selection, please try again...");
        }
    }
//this is the method of repeating the MCQ test once again after one test over
    public static void again(){
        String yes="Yes";
        String no="No";
        System.out.println("");
        System.out.println("Would you like to continue...? (Yes/No)");
        System.out.println("");
        Scanner repeat = new Scanner(System.in);
        String ans = repeat.next();

        if(ans.equalsIgnoreCase(yes) || ans.equalsIgnoreCase(no)){
            if(ans.equalsIgnoreCase(yes)){
                displayQuestions();
                again();
            } else if (ans.equalsIgnoreCase(no)){
                System.out.println("");
                System.out.println("Thank you. Have a nice day");
            }
        }
        else {
            System.out.println("");
            System.out.println("Invalid Answer. Try again.");
            again();
        }
    }


}

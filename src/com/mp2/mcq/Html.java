package com.mp2.mcq;
//this child class is inherited by the parent class of QuestionSet
public class Html extends QuestionSet {
    public Html(){
        //here we have used polymorphism to call the .CSV file from the file directory of this
        super("E:\\java\\Summative assessment\\src\\com\\mp2\\mcq\\CSV\\html mcq.csv");
    }

}

package com.mp2.mcq;
//this child class is inherited by the parent class of QuestionSet

public class Cplusplus extends QuestionSet{
    public Cplusplus(){
        //here we have used polymorphism to call the .CSV file from the file directory of this
        super("E:\\java\\Summative assessment\\src\\com\\mp2\\mcq\\CSV\\c++  mcq.csv");
    }

}

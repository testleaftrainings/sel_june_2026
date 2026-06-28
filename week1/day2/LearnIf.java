package org.testleaf.week1.day2;

public class LearnIf {

    public static void main(String[] args) {
        
        int marks=50;
        //shortcut:type if and ctrl+space
        if (marks>40) {
            System.out.println("pass");
        }

        if (marks>=60) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        int marks1=80;
        if (marks1==60) {
            System.out.println("grade c");
        } else if(marks1<40) {
            System.out.println("fail");
        }else if(marks1>80){
            System.out.println("Distinction");
        } 
        else{
            System.out.println("Out of Range");
        }
    }

}

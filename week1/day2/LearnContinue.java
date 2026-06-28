package org.testleaf.week1.day2;

public class LearnContinue {
    //it skips the particular iteration
    public static void main(String[]args){
        LearnNewMethods lm=new LearnNewMethods();
        System.out.println(lm.employeeDetails("saran", "BA"));
        for (int i = 1; i <= 10; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }

    }

}

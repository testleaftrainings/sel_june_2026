package org.testleaf.week4.day1;

public class LearnOverRiding extends LearnOverloading{

/**
 * method overRiding-should have the same method name,same input parameters
 */
@Override
public void add(){
        int a=30;
        int b=50;
        System.out.println(a+b);
        super.add();
    }
    public static void main(String[] args) {
        LearnOverRiding LO1=new LearnOverRiding();
        LO1.add();
    }


}

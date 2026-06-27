package org.testleaf.week1;

public class LearnOperators {
    public static void main(String[] args) {

        //arithmetic operator
        System.out.println(10%2);//remainder
         System.out.println(10/2);//quotient
        //assignment--->assigning  value to the varaible
        int a=5,b=2;
        a+=5;//a=a+5
        System.out.println(a);
        b*=2;//b=b*2--->2*2=4
        System.out.println(b);//4
        b-=1;//b=b-1;4-1--->3
        System.out.println(b);
        //LogicalOperators
        
        System.out.println((5==3)&&(7<0));//0*0=0--->false
        System.out.println((5==5)||(7<0));//1+0-->1--->true

        //unaryOperators--1)increment2)decrement
        int x=1;
        System.out.println(++x);//2
        System.out.println(x++);//2
        System.out.println(x);//3
        System.out.println(x++);//3
       System.out.println(x);//4
       //comparison
       System.out.println(5>5);

        

        
    }

}

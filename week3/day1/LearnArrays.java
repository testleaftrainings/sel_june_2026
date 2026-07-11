package org.testleaf.week3.day1;

import java.util.Arrays;

public class LearnArrays {
    /**
     * Arrays-->nonPrimitive datatype,it is no a class but it behaves like an objec
     * implementations:
     * 1)ArrayLiteral-->syn:typa[] name={values}--->based on the data values
     * 2)Arrayinstantiation--->Based on size
     * @param args
     */
    public static void main(String[] args) {

        int marks[]={45,87,90,56,86};
        //length
        int size=marks.length;
        System.out.println(size);
        //sorting
        Arrays.sort(marks);//45,56,86,87,90
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //maxvalue
        System.out.println(marks[size-1]);

        //ArrayInstantiation-->dt v.Name=new dt[size]
        int marks1[]=new int[3];//1,2,3
        marks1[0]=76;
        marks1[1]=98;
        marks1[2]=65;
        System.out.println(marks1[3]);

        
    }

}

package org.testleaf.week3.day1;

public class PrintIntersection {
    public static void main(String[] args) {
        int num[]={3,1,5,4,7};//output--->1,4
        int num1[]={1,2,4,6};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                if (num[i]==num1[j]) {
                    System.out.println("the intersection is:"+num[i]);
                }
            }
        }
    }

}

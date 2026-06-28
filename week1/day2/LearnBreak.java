package org.testleaf.week1.day2;

public class LearnBreak {
    //it entirely stops the iteration
    public static void main(String[]args){
    for (int i = 1; i <= 10; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }

}
}

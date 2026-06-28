package org.testleaf.week1.day2;

public class LearnSwitchCase {

    public static void main(String[]args){

        String browser="Firefox";

        //shortcut:type switch do ctrl+space
        switch (browser) {
            case "Chrome":
                System.out.println("Chrome browser launched successfully");
                break;
            case "Edge":
                 System.out.println("Edge browser launched successfully");
                 break;
            case "Safari":
                 System.out.println("safari browser launched successfully");
                 break;
                 default:
                 System.out.println("IE browser launched successfully");
                
        }

    }

}

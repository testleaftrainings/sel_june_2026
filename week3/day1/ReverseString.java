package org.testleaf.week3.day1;

public class ReverseString {
//Arrayindexoutofboundexception
    public static void main(String[] args) {
        String str="saranya";//aynaras--->index->6
        //string to character
        char[] charArray=str.toCharArray();
        for (int i = charArray.length-1; i >=0; i--) {
            System.out.println(charArray[i]);
        }
    }

}

package org.testleaf.week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {
    public static void main(String[] args) {
        
        String s="Saranya";//a
        char[] charArray = s.toCharArray();

        Set<Character> unique=new TreeSet<Character>();
        Set<Character> duplicate=new TreeSet<Character>();
        for (int i = 0; i < charArray.length ; i++) {
            boolean b = unique.add(charArray[i]);
            if (!b) {
                duplicate.add(charArray[i]);
            }
        }
        System.out.println(unique);//s,a,r,n,y//a,n,r,s,y
        System.out.println(duplicate);
    }

}

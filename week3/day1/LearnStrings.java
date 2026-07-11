package org.testleaf.week3;

public class LearnStrings {
    /**
     * Strings:
     * -collection of characters,Non primitive datatype,immutable clas
     * -implemention of  string:
     *  1)String literals-->it resuse the memoryspace when java identifies the similar strings in the string pool memory.
     *  2)String instantiation--->creates a memoryspace whenever the string is instantaited.
     * @param args
     */
    public static void main(String[] args) {
        //string literal-->Datatype var.Name="value";
        String name="Welcome to Testleaf";//id=30//length starts from 1
        String name1="WELCOME TO TESTLEAF";//id=30
        //string instantition--->className obj=new Classname("values")
        String str=new String("happyLearning");//id=31
        String str1=new String("happyLearning");//id=32
        //count the characters length
        int length = name.length();
        System.out.println(length);
        //compare the strings:
        //Equals--->compares the content,casesensitive
        if (str.equals(str1)) {
            System.out.println("text matched");
        }else{
            System.out.println("text not matched");
        }
        //== method--->compares the address
        if (str==(str1)) {
             System.out.println("this is from ==method:text matched");
        }else{
             System.out.println("this is from ==method:text not matched");
        }
        //Equalignorecase
        boolean equalsIgnoreCase = name.equalsIgnoreCase(name1);
        System.out.println(equalsIgnoreCase);
        //contains--->value is presnt inside that varible but it is case sensitive
        boolean contains = str.contains(str1);
        System.out.println(contains);
        //toCharArray--string is converted to the character
        char[] charArray = name.toCharArray();
        System.out.println(charArray);
        for (int i = 0; i < charArray.length ; i++) {
            System.out.println(charArray[i]);
            
        }
        //charAt--->retreive a single character based on index
        char charAt = str.charAt(4);
        System.out.println(charAt);
        //replace
        String s="Testleaf@321";
        String replace = s.replace("@", "").replace("2", "a");
        System.out.println(replace);
        //replaceAll
        String replaceAll = s.replaceAll("[^0-9]", "");
        System.out.println(replaceAll);
        String replaceAll2 = s.replaceAll("[^A-z]", "");
        System.out.println(replaceAll2);

        //string to integer
        String ss="123";
        System.out.println(ss+10);
        int stringToInteger = Integer.parseInt(ss);
        System.out.println(stringToInteger+10);

        //split:--->the string is splited into multiple strings

        String sT="Testleaf and Qeagle";
        String[] split = sT.split("e");//0--->T,1--->stl,2--->af and Q,3-->agl
        System.out.println(split[3]);
        //qeagle
        String[] split2 = sT.split(" ");//0-->Testleaf,1--->and,2--->qeagle
        System.out.println(split2[2]);

        //substring-->crop the given strings into multiple strings
        String ss1="june";
        String substring = ss1.substring(1);
        System.out.println(substring);
        String substring2 = ss1.substring(1, 3);//endindex+1
        System.out.println(substring2);



        
    }

}

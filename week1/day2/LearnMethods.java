package org.testleaf.week1.day2;

public class LearnMethods {
    String userName="democsr";

    //syntax:Accessmodifier returntype mthdname(){}
    //loginscenario
    public void enterUname(){
        System.out.println("uname entered succesfully");
    }
    public void enterPword(){
        System.out.println("pwd entered succesfully");
    }
    public void clickLogin(){
         System.out.println("loggedin succesfully");
    }
    public static void main(String[]args){
        //instantiation:syn:Classname obj=new ClassName();
        LearnMethods lm=new LearnMethods ();
        lm.enterUname();
        lm.enterPword();
        lm.clickLogin();
        System.out.println(lm.userName);

    }


}

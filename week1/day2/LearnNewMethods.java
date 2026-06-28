package org.testleaf.week1.day2;

public class LearnNewMethods {

    //syntax:Accessmodifier returntype mthdname(i/p parameters){}

    public void calculateSalary(int basic,int bonus,float tax){
       
        float salary=basic+bonus-tax;
        System.out.println(salary);

    }

    private int noOfEmployees(){
        return 50;
    }

    String employeeDetails(String empName,String empDept){
        
        return empName+empDept;

    }
    public static void main(String[] args) {
        LearnNewMethods lm1=new LearnNewMethods();
        lm1.calculateSalary(20000, 3000, 1500.00f);
        String employeeDetails = lm1.employeeDetails("saranya", "QA");//ctrl+.-->assign to alocal varible
        System.out.println(employeeDetails);
        System.out.println(lm1.noOfEmployees());
    }

}

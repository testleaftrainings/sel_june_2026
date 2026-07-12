package org.testleaf.week3.day2;

public abstract class SingaporeBank implements RBI {
/**
 * partial abstraction--cannot create the objects
 * -both implemented and unimplemented methods
 */
private int empId;
public void bankBalance(){
    System.out.println("Minimum balance is RS:5000");
}
//UNIMPLEMENTED METHOD
public abstract void convertCurrency();

}

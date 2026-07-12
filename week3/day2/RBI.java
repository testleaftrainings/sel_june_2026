package org.testleaf.week3.day2;

public interface RBI {
    /**
     * 100%abstraction-cannot create the objects
     * -after the version of java 8,implementationis also done in interfce because
     * of backward compatability.Tis can be acheived by two keywords
     * 1)default
     * 2)static
     * -one interface can implement multiple classes.
     * -multiple inheritance is possible between the interface
     */
    public void KYC();
    public default void withDrawalLimit(){
        System.out.println("the limit is RS.25,000");
    }


    

}

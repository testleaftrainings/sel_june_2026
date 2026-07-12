package org.testleaf.week3.day2;

public class BMW extends Car {

    public void voiceCommand(){
        System.out.println("voice cmd is enabled----->BMW class");
    }
    public void turnONAC(){
        System.out.println("Ac is turned on---->BMW cLASS");
    }
    public static void main(String[] args) {
        BMW b=new BMW();
        b.applyBrake();
        b.applyGear();
        b.turnONAC();
    }

}

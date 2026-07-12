package org.testleaf.week3.day2;

public class SingaporeUnionBank extends SingaporeBank {

    @Override
    public void KYC() {
        System.out.println("PASSPORT");
    }

    @Override
    public void convertCurrency() {
       
        System.out.println("currency in dollars");
    }
    public static void main(String[] args) {
        SingaporeUnionBank sb=new SingaporeUnionBank();
        sb.bankBalance();
        sb.convertCurrency();
    }

}

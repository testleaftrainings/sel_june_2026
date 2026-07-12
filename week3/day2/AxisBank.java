package org.testleaf.week3.day2;

public class AxisBank implements RBI {

    @Override
    public void KYC() {
        System.out.println("PanCard");
    }
    public void housingLoan(){
        System.out.println("ROI--8%");
    }
    public static void main(String[] args) {
        AxisBank axis=new AxisBank();
        axis.KYC();
        axis.housingLoan();
    }

}

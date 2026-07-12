package org.testleaf.week3.day2;

public class SBI extends AxisBank implements RBI,Inter {

    @Override
    public void KYC() {
        System.out.println("AAdharCard");
    }
    public void goldLoan(){
        System.out.println("ROI---5%");
    }
    public static void main(String[] args) {
        SBI sbi=new SBI();
        sbi.KYC();
        sbi.goldLoan();
        sbi.withDrawalLimit();
        sbi.housingLoan();
        sbi.KYC();
        sbi.systemDesign();
    }
    @Override
    public void systemDesign() {
        System.out.println("design is in process");
    }

}

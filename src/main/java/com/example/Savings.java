package com.example;

public class Savings extends Axis{
    private int accBal;
    private double interest;

    // Default constructor
    public Savings() {
        super();
    }


    /**
     * 
     * @param name
     * @param age
     */
    public Savings(String name, int age, int accNo, String IFSC) {
        super(name, age, accNo, IFSC);
    }

    /**
     * 
     * @param name
     * @param age
     * @param accNo
     * @param IFSC
     * @param accBal
     * @param interest
     */
    public Savings(String name, int age, int accNo, String IFSC, int accBal, double interest) {
        super(name, age, accNo, IFSC);
        this.accBal = accBal;
        this.interest = interest;
    }

    // Getter Methods

    public int getAccBal() {
        return accBal;
    }

    public double getInterest() {
        return interest;
    }

    // Setter Methods

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * Create - From constructor
     * Balance Inquiry - balanceEnquiry method
     * Deposit - deposit method
     * Withdraw - withdraw method
     */

}

package com.example;

public class Axis {
    
    private String name;
    private int age;
    private int accNo;
    private String IFSC;

    // Default constructor
    public Axis() {
        super();
    }

    /**
     * 
     * @param name
     * @param age
     * @param accNo
     * @param IFSC
     */
    public Axis(String name, int age, int accNo, String IFSC) {
        this.name = name;
        this.age = age;
        // TODO: Generate a random and unique account number.
        this.accNo = accNo;
        // TODO: IFSC is same for all the accounts of the same bank. Hard code it.
        this.IFSC = IFSC;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getIFSC() {
        return IFSC;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

}

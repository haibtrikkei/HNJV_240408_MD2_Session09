package lop_truutruong;

import java.util.Date;

public abstract class Person {
    private String fullName;
    private boolean gender;
    private Date dob;
    private String address;

    public Person() {
    }

    public Person(String fullName, boolean gender, Date dob, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double calculateSalary();
    public abstract void showInfo();
}

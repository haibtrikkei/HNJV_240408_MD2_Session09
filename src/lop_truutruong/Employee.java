package lop_truutruong;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>{
    private String empId;
    private String company;
    private String department;
    private double fixSalary;
    private double bonus;

    public Employee() {
    }

    public Employee(String fullName, boolean gender, Date dob, String address, String empId, String company, String department, double fixSalary, double bonus) {
        super(fullName, gender, dob, address);
        this.empId = empId;
        this.company = company;
        this.department = department;
        this.fixSalary = fixSalary;
        this.bonus = bonus;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return fixSalary+bonus;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee: ");
        System.out.println("\tId: "+empId);
        System.out.println("\tFull name: "+getFullName());
        System.out.println("\tGender: "+(isGender()?"Male":"Female"));
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\tBithday: "+sf.format(getDob()));
        System.out.println("\tAddress: "+getAddress());
        System.out.println("\tCompany: "+company);
        System.out.println("\tDepartment: "+department);
        System.out.println("\tSalary: "+calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        //giam dan
//        return o.getFullName().compareTo(getFullName());

        //tang dan:
//        return getFullName().compareTo(o.getFullName());

        //sap xep tang dan theo tong luong
        return (int) (calculateSalary()-o.calculateSalary());
    }
}

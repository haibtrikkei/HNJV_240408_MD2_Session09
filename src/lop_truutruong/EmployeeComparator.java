package lop_truutruong;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.calculateSalary()-o1.calculateSalary());
    }
}

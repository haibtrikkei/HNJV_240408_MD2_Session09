package lop_truutruong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Employee[] arr;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nhan vien: ");
        n = Integer.parseInt(scanner.nextLine());

        arr = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu "+(i+1));
            arr[i] = new Employee();
            System.out.println("Nhap ma nhan vien: ");
            arr[i].setEmpId(scanner.nextLine());
            System.out.println("Nhap ho ten: ");
            arr[i].setFullName(scanner.nextLine());
            System.out.println("Nhap gioi tinh: ");
            arr[i].setGender(Boolean.parseBoolean(scanner.nextLine()));
            System.out.println("Nhap ngay sinh: ");
            SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
            arr[i].setDob(sf.parse(scanner.nextLine()));
            System.out.println("Nhap que quan: ");
            arr[i].setAddress(scanner.nextLine());
            System.out.println("Nhap ten cong ty: ");
            arr[i].setCompany(scanner.nextLine());
            System.out.println("Nhap phong ban: ");
            arr[i].setDepartment(scanner.nextLine());
            System.out.println("Nhap luong cung: ");
            arr[i].setFixSalary(Double.parseDouble(scanner.nextLine()));
            System.out.println("Nhap thuong: ");
            arr[i].setBonus(Double.parseDouble(scanner.nextLine()));
        }

        System.out.println("\nThong tin cac nhan vien: ");
        for (Employee e: arr){
            e.showInfo();
        }

        //Cau lenh sap xep mang
        Arrays.sort(arr);
        System.out.println("Danh sach sap xep tang dan theo luong: ");
        for (Employee e: arr){
            e.showInfo();
        }

        //Xep theo Comparator:
        Arrays.sort(arr, new EmployeeComparator());
        System.out.println("\nDanh sach sap xep giam dan theo luong: ");
        for (Employee e: arr){
            e.showInfo();
        }
    }
}

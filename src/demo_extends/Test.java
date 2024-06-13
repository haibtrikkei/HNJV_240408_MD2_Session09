package demo_extends;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh thu nhat cua tam giac: ");
        t.setSide1(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap vao canh thu hai cua tam giac: ");
        t.setSide2(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap vao canh thu ba cua tam giac: ");
        t.setSide3(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap vao mau sac cua tam giac: ");
        t.setColor(sc.nextLine());

        System.out.println(t);
    }
}

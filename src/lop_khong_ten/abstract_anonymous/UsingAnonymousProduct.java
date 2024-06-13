package lop_khong_ten.abstract_anonymous;

import java.util.Scanner;

public class UsingAnonymousProduct {
    public static void main(String[] args) {
        Product p = new Product() {
            @Override
            public void input() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap ma san pham: ");
                setId(sc.nextLine());
                System.out.println("Nhap ten: ");
                setName(sc.nextLine());
                System.out.println("Nhap gia: ");
                setPrice(sc.nextDouble());
            }

            @Override
            public void display() {
                System.out.println("San pham: ");
                System.out.println("\tMa san pham: "+getId());
                System.out.println("\tTen san pham: "+getName());
                System.out.println("\tGia: "+getPrice());
            }
        };

        p.input();
        p.display();
    }
}

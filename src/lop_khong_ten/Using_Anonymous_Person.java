package lop_khong_ten;

public class Using_Anonymous_Person {

    public void test(){
        Person p = new Person() {
            @Override
            public void input() {
                System.out.println("Thuc thi phuong thuc input");
            }

            @Override
            public void display() {
                System.out.println("Thuc thi phuong thuc display");
            }
        };
        p.input();
        p.display();
    }
    public static void main(String[] args) {
        Using_Anonymous_Person obj = new Using_Anonymous_Person();
        obj.test();
    }
}

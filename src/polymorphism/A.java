package polymorphism;

public class A extends B{
    @Override
    public void show() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        B b = new A();
        b.show();
    }
}

package demo_sapxep.xep_comparable;

public class Book implements Comparable<Book>{
    private String id;
    private String name;
    private double price;

    public Book() {
    }

    public Book(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return (int) (o.getPrice()-price);
    }
}

package demo_sapxep.xep_comparator;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return (int) (o2.getPrice()-o1.getPrice());
    }
}

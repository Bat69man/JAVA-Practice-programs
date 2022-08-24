import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.lang.Comparable;

class Book implements Comparable{
    private int id, price;
    private String title;

    public Book(int id, int price, String title){
        this.id = id;
        this.price = price;
        this.title = title;
    }
    public int getPrice(){ return price; }
    public int getId(){ return id; }
    public String getTitle(){ return title; }

    public int compareTo(Object a)
    {
        Book temp = (Book)a;

        if( this.price < temp.getPrice() )
            return -1;
        return 1;
    }
}

public class ComparableEx {
    public static void main(String[] args) {

        //TreeSet <Book> t = new TreeSet<Book>(new Com());

        LinkedList <Book> t = new LinkedList<>();

        Book b1 = new Book(34, 690,"Logic Bubble");
        Book b2 = new Book(5, 720, "Beautiful Mind");
        Book b3 = new Book(3, 550, "Power of Mind");

        t.add(b1);
        t.add(b2);
        t.add(b3);

        Collections.sort(t);

        System.out.println("\n  Id\t Title\t\t\t Price\n------------------------------------------");
        for(Book temp: t) {
            System.out.printf("%4d\t %s\t\t %5d\n",temp.getId(),temp.getTitle(),temp.getPrice());
        }
    }
}
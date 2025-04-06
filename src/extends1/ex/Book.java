package extends1.ex;

public class Book extends Item {
    private String author;
    private String isBn;

    public Book(String name, int price, String author, String isBn) {
        super(name, price);
        this.author = author;
        this.isBn = isBn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + this.author + ", isbn:" + this.isBn);
    }
}

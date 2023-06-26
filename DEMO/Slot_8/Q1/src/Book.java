
public class Book {

    public String title;
    public int price;

    public Book() {
    }

    public Book(String title, int price) {
        this.title = title.toUpperCase();
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

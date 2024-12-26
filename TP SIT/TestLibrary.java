class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this(name, author, price);
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }

    public boolean isAvailable() {
        return qtyInStock > 0;
    }

    public void sell(int quantity) {
        if (quantity <= qtyInStock) {
            qtyInStock -= quantity;
        } else {
            System.out.println("Error: Not enough books in stock for " + name);
        }
    }

    public void restock(int quantity) {
        qtyInStock += quantity;
    }

    public void discount(double percentage) {
        double discountAmount = price * (percentage / 100);
        price = Math.max(0, price - discountAmount);
    }
}

public class TestLibrary {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
        Author author2 = new Author("George Orwell", "georgeorwell@example.com", 'M');

        Book book1 = new Book("Harry Potter", author1, 25.0, 50);
        Book book2 = new Book("1984", author2, 15.0);
        Book book3 = new Book("Animal Farm", author2, 12.0, 20);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        book1.sell(20);
        book2.restock(10);
        book3.discount(10);

        System.out.println("After changes:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("Is book1 available? " + book1.isAvailable());
        System.out.println("Is book2 available? " + book2.isAvailable());

        book1.sell(40);
    }
}
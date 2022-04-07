package Essential.DZ_14.Second;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private int pages;
    private String author;
    private String name;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

interface Action {
    void printAuthor(Book book);
}

class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("John Doe");
        book1.setName("Some Book");
        book1.setPages(100);
        Book book2 = new Book();
        book2.setAuthor("John Doe Jr.");
        book2.setName("Some Book Jr.");
        book2.setPages(50);

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);

        list.forEach(book -> new Action() {
            @Override
            public void printAuthor(Book book) {
                System.out.println(book.getAuthor());

            };
        }.printAuthor(book));
    }
}
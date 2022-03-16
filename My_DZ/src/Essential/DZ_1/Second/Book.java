package Essential.DZ_1.Second;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the title of the book :");
        title.title = input.nextLine();

        System.out.println("Please, enter the author of the book :");
        author.author = input.nextLine();

        System.out.println("Please, enter the content of the book :");
        content.content = input.nextLine();

        title.show();
        author.show();
        content.show();
    }
}

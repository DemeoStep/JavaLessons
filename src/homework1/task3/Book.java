package homework1.task3;

import java.util.Scanner;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public void setTitle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String title = input.nextLine();

        this.title.setTitle(title);
    }

    public void setAuthor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите автора книги: ");
        String author = input.nextLine();

        this.author.setAuthor(author);
    }

    public void setContent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите содержание книги: ");
        String content = input.nextLine();

        this.content.setContent(content);
    }

    public void setBook() {
        setTitle();
        setAuthor();
        setContent();
    }

    public Book(){
        this.title = new Title();
        this.author = new Author();
        this.content = new Content();
    }

    public void show() {
        this.title.show();
        this.author.show();
        this.content.show();
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBook();
        book.show();
    }
}

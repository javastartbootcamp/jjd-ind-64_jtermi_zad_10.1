package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[3];
        int bookCount = 0;

        System.out.println("Podaj informację o trzech unikalnych książkach");

        do {
            Book newBook = readNewBook();
            if (!isDuplicate(books, newBook, bookCount)) {
                books[bookCount] = newBook;
                bookCount++;
            }
        } while (bookCount < books.length);

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    private static Book readNewBook() {
        Scanner scanner = new Scanner(System.in);
        Book newBook = new Book();

        System.out.println("Podaj tytuł");
        newBook.setTitle(scanner.nextLine());
        System.out.println("Podaj ilość stron");
        newBook.setPageCount(scanner.nextInt());
        scanner.nextLine();
        return newBook;
    }

    private static boolean isDuplicate(Book[] books, Book book, int containerCount) {
        for (int i = 0; i < containerCount; i++) {
            if (books[i].equals(book)) {
                System.out.println("Duplikat");
                return true;
            }
        }
        return false;
    }
}
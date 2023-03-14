package pl.javastart.task;

import java.util.Objects;

public class Book {

    private String title;
    private int pageCount;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pageCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return pageCount == book.pageCount && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount);
    }
}

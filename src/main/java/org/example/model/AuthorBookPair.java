package org.example.model;

public class AuthorBookPair {

    private Author author;
    private Book firstBook;

    public AuthorBookPair(Author author, Book firstBook) {
        this.author = author;
        this.firstBook = firstBook;
    }

    public AuthorBookPair() {}

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getFirstBook() {
        return firstBook;
    }

    public void setFirstBook(Book firstBook) {
        this.firstBook = firstBook;
    }

    public boolean equals(AuthorBookPair obj) {
        return this.author.equals(obj.getAuthor()) && this.firstBook.equals(obj.getFirstBook());
    }
}

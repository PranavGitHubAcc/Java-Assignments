class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return this.name;
    }
    
    public String getDetails() {
    	return this.name+" ("+this.pages+")";
    }
}

class Author {
    private String name;
    private int age;
    private String nationality;

    public Author(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return this.name;
    }
    
    public String getDetails() {
    	return this.name+" ("+this.age+","+ this.nationality+")";
    }

}

public class Library {

    private Book[] books;
    private Author[] authors;
    private int numberOfBooks;

    public Library(int size) {

        this.books = new Book[size];
        this.authors = new Author[size];
        this.numberOfBooks = 0;
    }

    public void addBook(Book book, Author auth) {
        this.books[this.numberOfBooks] = book;
        this.authors[this.numberOfBooks] = auth;
        this.numberOfBooks++;
    }

    public void printStock() {
        System.out.println("-------Book stock-------");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\""+this.books[i].getName()+"\"" + " by " + this.authors[i].getName());
        }
    }

    public static void main(String[] args) {
        Library l1 = new Library(3);
        Book b1 = new Book("Let us C", 239);
        Book b2 = new Book("Harry Potter and the Prisoner of Azkaban", 325);
        Book b3 = new Book("Hunger Games: Catching Fire", 432);

        Author a1 = new Author("Yashavant Kanetkar", 59, "Indian");
        Author a2 = new Author("J.K. Rowling", 58, "British");
        Author a3 = new Author("Suzanne Collins", 61, "American");

        l1.addBook(b1, a1);
        l1.addBook(b2, a2);
        l1.addBook(b3, a3);
        l1.printStock();
    }
}

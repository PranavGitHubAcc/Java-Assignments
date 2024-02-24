import java.sql.Date;

class LibraryItem {
    private int id;
    private Date issueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "id=" + id + ", issueDate=" + issueDate;
    }
}

class Book extends LibraryItem {
    private int pages;
    private String author;

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

	@Override
	public String toString() {
		return "Book [pages=" + pages + ", author=" + author + ", " + super.toString() + "]";
	}

}

class DVD extends LibraryItem {
    private int length;
    private String title;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	@Override
	public String toString() {
		return "DVD [length=" + length + ", title=" + title + ", " + super.toString() + "]";
	}
    
}

class Magazine extends LibraryItem {
    private int pages;
    private int version;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

	@Override
	public String toString() {
		return "Magazine [pages=" + pages + ", version=" + version + ", " + super.toString() + "]";
	}

    
}

public class Library {
    public static void main(String[] args) {

        Book bookItem = new Book();
        bookItem.setId(100);
        bookItem.setIssueDate(Date.valueOf("2023-10-15"));
        bookItem.setPages(300);
        bookItem.setAuthor("John Doe");

        DVD dvdItem = new DVD();
        dvdItem.setId(200);
        dvdItem.setIssueDate(Date.valueOf("2023-10-15"));
        dvdItem.setLength(120);
        dvdItem.setTitle("life of pie");

        Magazine magazineItem = new Magazine();
        magazineItem.setId(300);
        magazineItem.setIssueDate(Date.valueOf("2023-10-15"));
        magazineItem.setPages(50);
        magazineItem.setVersion(2);

        // Print information about each item
        System.out.println("Book Item:");
        System.out.println(bookItem);

        System.out.println("\nDVD Item:");
        System.out.println(dvdItem);

        System.out.println("\nMagazine Item:");
        System.out.println(magazineItem);
    }
}

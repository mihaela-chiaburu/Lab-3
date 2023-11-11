package MostenireSimpla;

public class Literature {
    private String title;
    private String author;
    private int publicationYear;

    public Literature(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public String toString() {
        return "Literature:" +
                "title = " + this.title + '\n' +
                "author = " + this.author + '\n' +
                "publicationYear = " + this.publicationYear + '\n' ;
    }
}

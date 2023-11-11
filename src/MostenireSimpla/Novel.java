package MostenireSimpla;

public class Novel extends Literature{
    private String genre;
    private int numberOfPages;
    private boolean isBestseller;

    public Novel(String title, String author, int publicationYear, String genre, int numberOfPages, boolean isBestseller) {
        super(title, author, publicationYear);
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.isBestseller = isBestseller;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean getBestseller() {
        return isBestseller;
    }

    public void setBestseller(boolean bestseller) {
        isBestseller = bestseller;
    }
    @Override
    public String toString() {
        return "Novel: \n" +
                "  title = " + super.getTitle() + '\n' +
                "  author = " + super.getAuthor() + '\n' +
                "  publicationYear = " + super.getPublicationYear() + '\n' +
                "  genre = " + this.getGenre() + '\n' +
                "  numberOfPages = " + this.getNumberOfPages() + '\n' +
                "  isBestseller = " + this.getBestseller() + '\n' ;
    }
}

package products;

public  class Book extends Product {
    private static final int BOOK = 1000;

    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre =  genre;
        setId(generateId());
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString (){
        return super.toString() + "\nAuthor Name: " + author + "\nPublication Name: " + publication + "\nGenre: " + genre;
    }

    @Override
    protected String generateId() {
        String temp = String.valueOf(BOOK + num);
        num++;
        return temp;

    }

}

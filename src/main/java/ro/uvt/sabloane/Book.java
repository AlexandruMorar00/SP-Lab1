package ro.uvt.sabloane;
import  java.util.*;

public class Book {
    private final String title;
    private final Collection<Author> authors = new LinkedList<>();

    public Book(String title){
        this.title=title;
    }




    public void addAuthor(Author autor) {
        authors.add(autor);
    }
    public void removeAuthor(Author autor){
        authors.remove(autor);
    }
    public Collection<Author> getAuthors(){
        return Collections.unmodifiableList(authors);
    }

}

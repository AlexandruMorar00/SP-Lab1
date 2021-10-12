package ro.uvt.sabloane;
import  java.util.*;
import java.util.stream.Collectors;

public class Book {
    private final String title;
    private final ArrayList<Author> authors = new ArrayList<>();

    public Book(String title){
        this.title=title;
    }




    public void addAuthor(Author autor) {
        authors.add(autor);
    }
    public void removeAuthor(Author autor){
        authors.remove(autor);
    }
    public ArrayList<Author> getAuthors(){

        return authors;

    }

}

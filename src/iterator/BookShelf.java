package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{

    List books = new ArrayList();

    public Book getBookAt(int index){
        return (Book)books.get(index);
    }

    public void addBook(Book book){
        books.add(book);
          }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

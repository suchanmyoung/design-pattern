package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Around the World in 80 Days"));
        bookShelf.addBook(new Book("Bible"));
        bookShelf.addBook(new Book("Cinderella"));
        bookShelf.addBook(new Book("Daddy-Long-Legs"));
        bookShelf.addBook(new Book("Evil-War"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}

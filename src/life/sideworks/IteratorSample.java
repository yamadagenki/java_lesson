package life.sideworks;

import life.sideworks.iterator.Book;
import life.sideworks.iterator.BookShelf;
import life.sideworks.iterator.Iterator;

/**
 * @author shengboxu
 */

public class IteratorSample {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("this is 1st book"));
        bookShelf.appendBook(new Book("this is 2nd book"));
        bookShelf.appendBook(new Book("this is 3rd book"));
        bookShelf.appendBook(new Book("this is 4th book"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }

}

package iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的业务集合类
 */
public class BookShelf implements Aggregate {

    private List<Book> bookList;

    public BookShelf() {
        bookList = new ArrayList<>();
    }

    /**
     * 往集合里增加元素
     * @param book
     */
    public void appendBook(Book book) {
        bookList.add(book);
    }

    /**
     * 返回集合
     * @return
     */
    public List<Book> getBookList () {
        return bookList;
    }

    public int getLength() {
        return bookList.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

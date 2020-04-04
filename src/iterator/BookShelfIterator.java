package iterator;

/**
 * 具体的迭代器
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int last = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (last < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return bookShelf.getBookList().get(last++);
    }

}

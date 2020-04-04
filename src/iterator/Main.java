package iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("人生的智慧"));
        bookShelf.appendBook(new Book("四级词汇"));
        bookShelf.appendBook(new Book("图解HTTP"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}

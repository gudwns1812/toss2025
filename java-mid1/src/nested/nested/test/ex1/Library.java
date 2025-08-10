package nested.nested.test.ex1;

public class Library {

    private final Book[] books;
    private int idx = 0;

    public Library(int count) {
        books = new Book[count];
    }

    public void addBook(String name, String author) {
        if (idx >= books.length) {
            System.out.println("책을 더 이상 추가할 수 없습니다.");
            return;
        }
        books[idx++] = new Book(name, author);
    }

    public void showBooks() {
        for (int i = 0; i < idx; i++) {
            System.out.println("책 이름: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    public static class Book {
        private String title;
        private String author;
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}

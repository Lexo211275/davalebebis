public class Main {
    public static void main(String[] args) {

                writer author1 = new writer("J.K.", "Rowling");
                writer author2 = new writer("George", "Orwell");

                book book1 = new book("Harry Potter and the Philosopher's Stone", 223, "Fantasy", author1);
                book book2 = new book("1984", 328, "Dystopian", author2);

                book[] books = {book1, book2};

                for (book book : books) {
                    System.out.println(book);
                }

    }
}
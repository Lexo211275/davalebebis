import java.util.Objects;

public class book
{
        private String title;
        private int pages;
        private String genre;
        private writer author;

        public book(String title, int pages, String genre, writer author) {
            this.title = title;
            this.pages = pages;
            this.genre = genre;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public int getPages() {
            return pages;
        }

        public String getGenre() {
            return genre;
        }

        public writer getAuthor() {
            return author;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            book book = (book) obj;
            return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, pages, genre, author);
        }

        @Override
        public String toString() {
            return "Book Title: " + title + ", Pages: " + pages + ", Genre: " + genre + ", Author: " + author.toString();
        }

}

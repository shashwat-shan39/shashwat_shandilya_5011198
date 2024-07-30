import java.util.Arrays;

// Class representing the Library with search methods
public class Library {

    // Linear search method to find a book by title
    public static Book linearSearchByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Binary search method to find a book by title (assuming the list is sorted)
    public static Book binarySearchByTitle(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }

    // Main method to demonstrate search functionalities
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "1984", "George Orwell"),
                new Book(2, "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book(3, "To Kill a Mockingbird", "Harper Lee")
        };

        // Linear search example
        Book foundBookLinear = linearSearchByTitle(books, "1984");
        if (foundBookLinear != null) {
            System.out.println("Linear Search - Book found: " + foundBookLinear);
        } else {
            System.out.println("Linear Search - Book not found");
        }

        // Sort books by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        // Binary search example
        Book foundBookBinary = binarySearchByTitle(books, "1984");
        if (foundBookBinary != null) {
            System.out.println("Binary Search - Book found: " + foundBookBinary);
        } else {
            System.out.println("Binary Search - Book not found");
        }
    }
}

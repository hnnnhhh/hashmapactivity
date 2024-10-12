import java.util.HashMap;

public class Books {
    public static void main(String[] args) {

        // This is the java activity for books
        // Book 1
        HashMap<String, Object> book_object1 = new HashMap<>();
        book_object1.put("title", "The Great Gatsby");
        book_object1.put("author", "F. Scott Fitzgerald");
        book_object1.put("id", 1);
        book_object1.put("genre", "Fiction");
        book_object1.put("publishedyear", 1925);
        book_object1.put("stock", 20);
        book_object1.put("price", 15.99);

        // Book 2
        HashMap<String, Object> book_object2 = new HashMap<>();
        book_object2.put("title", "To Kill a Mockingbird");
        book_object2.put("author", "Harper Lee");
        book_object2.put("id", 2);
        book_object2.put("genre", "Fiction");
        book_object2.put("publishedyear", 1960);
        book_object2.put("stock", 35);
        book_object2.put("price", 10.99);

        // Book 3
        HashMap<String, Object> book_object3 = new HashMap<>();
        book_object3.put("title", "1984");
        book_object3.put("author", "George Orwell");
        book_object3.put("id", 3);
        book_object3.put("genre", "Dystopian");
        book_object3.put("publishedyear", 1949);
        book_object3.put("stock", 40);
        book_object3.put("price", 9.99);


        // Using get() method to display the information of each book
        System.out.println("Book 1: " + book_object1.get("title") + ", Author: " + book_object1.get("author") + ", Genre: " + book_object1.get("genre"));
        System.out.println("Book 2: " + book_object2.get("title") + ", Author: " + book_object2.get("author") + ", Genre: " + book_object2.get("genre"));
        System.out.println("Book 3: " + book_object3.get("title") + ", Author: " + book_object3.get("author") + ", Genre: " + book_object3.get("genre"));
    }
}

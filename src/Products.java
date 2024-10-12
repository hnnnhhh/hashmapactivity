import java.util.HashMap;

public class Products {
    public static void main(String[] args) {

        // Product 1
        HashMap<String, Object> product_object1 = new HashMap<>();
        product_object1.put("name", "Laptop");
        product_object1.put("category", "Electronics");
        product_object1.put("id", 1);
        product_object1.put("price", 750);
        product_object1.put("stock", 50);
        product_object1.put("email", "supplier1@gmail.com");

        // Product 2
        HashMap<String, Object> product_object2 = new HashMap<>();
        product_object2.put("name", "Desk Chair");
        product_object2.put("category", "Furniture");
        product_object2.put("id", 2);
        product_object2.put("price", 100);
        product_object2.put("stock", 200);
        product_object2.put("email", "supplier2@gmail.com");

        // Product 3
        HashMap<String, Object> product_object3 = new HashMap<>();
        product_object3.put("name", "Notebook");
        product_object3.put("category", "Stationery");
        product_object3.put("id", 3);
        product_object3.put("price", 5);
        product_object3.put("stock", 500);
        product_object3.put("email", "supplier3@gmail.com");


        // Using get() method to display the information of each product
        System.out.println("Product 1: " + product_object1.get("name") + ", Category: " + product_object1.get("category") + ", Price: " + product_object1.get("price"));
        System.out.println("Product 2: " + product_object2.get("name") + ", Category: " + product_object2.get("category") + ", Price: " + product_object2.get("price"));
        System.out.println("Product 3: " + product_object3.get("name") + ", Category: " + product_object3.get("category") + ", Price: " + product_object3.get("price"));
    }
}

import java.util.HashMap;

public class Restaurants {
    public static void main(String[] args) {

        // This is the java activity for restaurants
        // Restaurant 1
        HashMap<String, Object> restaurant_object1 = new HashMap<>();
        restaurant_object1.put("name", "Vikings Luxury Buffet");
        restaurant_object1.put("location", "Pasay City");
        restaurant_object1.put("id", 1);
        restaurant_object1.put("cuisinetype", "Buffet");
        restaurant_object1.put("establishedyear", 2011);
        restaurant_object1.put("websiteorcontract", "www.vikings.ph");

        // Restaurant 2
        HashMap<String, Object> restaurant_object2 = new HashMap<>();
        restaurant_object2.put("name", "Antonio's Restaurant");
        restaurant_object2.put("location", "Tagaytay");
        restaurant_object2.put("id", 2);
        restaurant_object2.put("cuisinetype", "Fine Dining");
        restaurant_object2.put("establishedyear", 2002);
        restaurant_object2.put("websiteorcontract", "www.antoniosrestaurant.ph");

        // Restaurant 3
        HashMap<String, Object> restaurant_object3 = new HashMap<>();
        restaurant_object3.put("name", "Mesa Filipino Moderne");
        restaurant_object3.put("location", "Makati City");
        restaurant_object3.put("id", 3);
        restaurant_object3.put("cuisinetype", "Filipino");
        restaurant_object3.put("establishedyear", 2009);
        restaurant_object3.put("websiteorcontract", "www.mesa.ph");


        // Using get() method to display the information of each restaurant
        System.out.println("Restaurant 1: " + restaurant_object1.get("name") + ", Location: " + restaurant_object1.get("location") + ", Website: " + restaurant_object1.get("websiteorcontract"));
        System.out.println("Restaurant 2: " + restaurant_object2.get("name") + ", Location: " + restaurant_object2.get("location") + ", Website: " + restaurant_object2.get("websiteorcontract"));
        System.out.println("Restaurant 3: " + restaurant_object3.get("name") + ", Location: " + restaurant_object3.get("location") + ", Website: " +restaurant_object3.get("websiteorcontract"));
    }
}

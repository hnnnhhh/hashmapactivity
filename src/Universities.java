import java.util.HashMap;

public class Universities {
    public static void main(String[] args) {

        // This is the java activity for universities
        // University 1
        HashMap<String, Object> university_object1 = new HashMap<>();
        university_object1.put("name", "University of the Philippines");
        university_object1.put("location", "Quezon City");
        university_object1.put("id", 1);
        university_object1.put("establishedyear", 1908);
        university_object1.put("type", "Public");
        university_object1.put("website", "www.up.edu.ph");

        // University 2
        HashMap<String, Object> university_object2 = new HashMap<>();
        university_object2.put("name", "Ateneo de Manila University");
        university_object2.put("location", "Quezon City");
        university_object2.put("id", 2);
        university_object2.put("establishedyear", 1859);
        university_object2.put("type", "Private");
        university_object2.put("website", "www.ateneo.edu");

        // University 3
        HashMap<String, Object> university_object3 = new HashMap<>();
        university_object3.put("name", "De La Salle University");
        university_object3.put("location", "Manila");
        university_object3.put("id", 3);
        university_object3.put("establishedyear", 1911);
        university_object3.put("type", "Private");
        university_object3.put("website", "www.dlsu.edu.ph");


        // Using get() method to display the information of each university
        System.out.println("University 1: " + university_object1.get("name") + ", Location: " + university_object1.get("location") + ", Website: " + university_object1.get("website"));
        System.out.println("University 2: " + university_object2.get("name") + ", Location: " + university_object2.get("location") + ", Website: " + university_object2.get("website"));
        System.out.println("University 3: " + university_object3.get("name") + ", Location: " + university_object3.get("location") + ", Website: " + university_object3.get("website"));
    }
}

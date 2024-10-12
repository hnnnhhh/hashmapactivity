import java.util.HashMap;

public class Employees {
    public static void main(String[] args) {

        // Employee 1
        HashMap<String, Object> employee_object1 = new HashMap<>();
        employee_object1.put("name", "John Doe");
        employee_object1.put("department", "Sales");
        employee_object1.put("id", 1);
        employee_object1.put("age", 30);
        employee_object1.put("email", "john.doe@company.com");

        // Employee 1
        HashMap<String, Object> employee_object2 = new HashMap<>();
        employee_object2.put("name", "Jane Smith");
        employee_object2.put("department", "Human Resources");
        employee_object2.put("id", 2);
        employee_object2.put("age", 25);
        employee_object2.put("email", "jane.smith@company.com");

        // Employee 1
        HashMap<String, Object> employee_object3 = new HashMap<>();
        employee_object3.put("name", "Mark Johnson");
        employee_object3.put("department", "IT");
        employee_object3.put("id", 3);
        employee_object3.put("age", 40);
        employee_object3.put("email", "mark.johnson@company.com");


        // Using get() method to display the information of each employee
        System.out.println("Employee 1: " + employee_object1.get("name") + ", Department: " + employee_object1.get("department") + ", Email: " + employee_object1.get("email"));
        System.out.println("Employee 2: " + employee_object2.get("name") + ", Department: " + employee_object2.get("department") + ", Email: " + employee_object2.get("email"));
        System.out.println("Employee 3: " + employee_object3.get("name") + ", Department: " + employee_object3.get("department") + ", Email: " + employee_object3.get("email"));
    }
}

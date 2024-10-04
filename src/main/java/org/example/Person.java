package org.example; // Person sınıfı org.example paketinde olmalı

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // isTeen methodu
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    // Main method for testing
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        // Test get methods
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}

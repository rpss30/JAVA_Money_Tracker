package model;

// Represents a person with a certain amount of balance
public class Person {
    private String name;
    private double balance;

    // EFFECTS: constructs a person with given name and zero balance
    public Person(String name) {
        // stub
    }

    // MODIFIES: this
    // EFFECTS: adds given amount to balance
    public void addToBalance(double amount) {
        // stub
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

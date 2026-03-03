package org.example.model;

public class Collectible extends Product{

    //Constructor
    public Collectible(String id, String name, double cost){
        super(id, name, cost);
    }

    @Override
    public String toString() {
        return "Food Information: \n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Cost: " + getCost() + "\n" +
                "Active: " + isActive() + "\n";
    }
}

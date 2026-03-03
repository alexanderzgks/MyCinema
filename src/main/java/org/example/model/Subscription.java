package org.example.model;

public class Subscription extends Product{

    private String period;

    //Constructor
    public Subscription(String id, String name, double cost){
        super(id, name, cost);
    }

    //---------- GETTERS ----------
    public String getPeriod(){ return period; }

    //---------- SETTERS ----------
    public void setPeriod(String period){ this.period = period; }

    @Override
    public String toString() {
        return "Food Information: \n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Cost: " + getCost() + "\n" +
                "Period: " + getPeriod() + "\n" +
                "Active: " + isActive() + "\n";
    }
}

package org.example.model;

public class Food extends Product{

    //Food Information
    private String expiry_time;
    private int kg;

    //Constructor
    public Food(String id, String name, double cost, String expiry_time, int kg){
        super(id, name, cost);
        this.expiry_time = expiry_time;
        this.kg = kg;
    }

    //---------- GETTERS ----------
    public String getExpiryTime(){ return expiry_time; }
    public int getKg(){ return kg; }

    //---------- SETTERS ----------
    public void setExpiryTime(String expiry_time){ this.expiry_time = expiry_time; }
    public void setKg(int kg){ this.kg = kg; }


    @Override
    public String toString() {
        return "Food Information: \n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Cost: " + getCost() + "\n" +
                "Expiry Time: " + getExpiryTime() + "\n" +
                "Kg: " + getKg() + "\n" +
                "Active: " + isActive() + "\n";
    }
}

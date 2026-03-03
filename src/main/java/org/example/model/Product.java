package org.example.model;

abstract class Product {

    //Product Information
    private final String id;
    private String name;
    private double cost;
    private boolean active;

    //Constructor
    public Product(String id, String name, double cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.active = true;
    }

    //---------- GETTERS ----------
    public String getId(){ return id; }
    public String getName(){ return name; }
    public double getCost(){ return cost; }

    //---------- SETTERS ----------
    public void setName(String name){ this.name = name; }
    public void setCost(double cost){ this.cost = cost; }

    //---------- Active ----------
    public boolean isActive(){ return active; }
    public void setActive(boolean active){ this.active = active; }

}

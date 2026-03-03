package org.example.model;


public class Movie {

    //Movie Information
    private final String id;
    private String name;
    private int duration;
    private int year;
    private String languege;
    private int age_appropriateness;
    private String description;
    private boolean active;

    //Constructor
    public Movie(String id, String name, int duration, int year, String languege, int age_appropriateness, String description){
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.year = year;
        this.languege = languege;
        this.age_appropriateness = age_appropriateness;
        this.description = description;
        this.active = true;
    }

    //---------- GETTERS ----------
    public String getId(){ return id; }
    public String getMovieName(){ return name; }
    public int getDuration(){ return duration; }
    public int getYear(){ return year; }
    public String getLanguege(){ return languege; }
    public int getAgeAppropriateness(){ return age_appropriateness; }
    public String getDescription(){ return description; }

    //---------- SETTERS ----------
    public void setMovieName(String name){ this.name = name; }
    public void setDuration(int duration){ this.duration = duration; }
    public void setYear(int year){ this.year = year; }
    public void setLanguage(String language){ this.languege = language; }
    public void setAgeAppropriateness(int age_appropriateness){ this.age_appropriateness = age_appropriateness; }
    public void setDescription(String description){ this.description = description; }

    //---------- Active ----------
    public boolean isActive() { return active; }
    public void setActive(boolean active){ this.active = active; }

    @Override
    public String toString() {
        return "Movie Information: \n" +
                "ID: " + getId() + "\n" +
                "Movie: " + getMovieName() + "\n" +
                "Time: " + getDuration() + "\n" +
                "Year: " + getYear() + "\n" +
                "Language: " + getLanguege() + "\n" +
                "Age Appropriateness: " + getAgeAppropriateness() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Active: " + isActive() + "\n";
    }
}

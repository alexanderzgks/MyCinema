package org.example.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Profile {

    //Account Information
    private final String code;
    private final String id;
    private final String username;
    private String email;
    private int phone_number;
    private String password;

//    //“no Creators, like default constructor, exist”
//    //η Profile δεν έχει default (no-args) constructor
//    //έναν κενό constructor public Profile() {} και μετά
//    //setters ή public fields (ή getters/setters) για να γεμίσει τις τιμές
//    public Profile(){}

    //Αν θες immutable (μόνο constructor με args) → @JsonCreator
    @JsonCreator
    public Profile(@JsonProperty("code") String code,
                   @JsonProperty("id") String id,
                   @JsonProperty("username") String username){
        this.code = code;
        this.id = id;
        this.username = username;
    }
    //Constructor
    public Profile(String code,String id, String username, String email, int phone_number, String password){
        this.code = code;
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone_number = phone_number;
        this.password = password;
    }

    //---------- GETTERS ----------
    public String getCode(){ return code; }
    public String getId(){ return id; }
    public String getUsername(){ return username; }
    public String getEmail(){ return email; }
    public int getPhone_number(){ return phone_number; }
    public String getPassword(){ return password; }

    //---------- SETTERS ----------
    public void setEmail(String email){ this.email = email; }
    public void setPhone_number(int phone_number){ this.phone_number = phone_number; }
    public void setPassword(String password){ this.password = password; }

    @Override
    public String toString() {
        return "Account Information: \n" +
                "Code: " +getCode() + "\n" +
                "ID: " + getId() + "\n" +
                "Username: " + getUsername() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone Number: " + getPhone_number() + "\n" +
                "Password: " + getPassword() + "\n";
    }
}

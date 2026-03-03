package org.example.model;

public class Profile {

    //Account Information
    private final String id;
    private final String username;
    private String email;
    private int phone_number;
    private String password;

    //Constructor
    public Profile(String id, String username, String email, int phone_number, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone_number = phone_number;
        this.password = password;
    }

    //---------- GETTERS ----------
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
                "ID: " + getId() + "\n" +
                "Username: " + getUsername() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone Number: " + getPhone_number() + "\n" +
                "Password: " + getPassword() + "\n";
    }
}

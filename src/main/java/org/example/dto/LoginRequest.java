package org.example.dto;

import org.example.model.Profile;

public abstract class LoginRequest {

    private Profile profile;
    private String username;
    private String email;
    private String password;
    private String code;

    //---------- SETTERS ----------
    public void setProfile(Profile profile){ this.profile =profile; }
    public void setUsername(String username){ this.username = username; }
    public void setEmail(String email){ this.email = email; }
    public void setPassword(String password){ this.password = password; }
    public void setCode(String code){ this.code = code; }

    //---------- GETTERS ----------
    public Profile getProfile(){ return profile; }
    public String getUsername(){ return username; }
    public String getEmail(){ return  email; }
    public String getPassword(){ return password; }
    public String getCode(){ return code; }
}

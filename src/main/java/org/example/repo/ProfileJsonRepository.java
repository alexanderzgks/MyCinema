package org.example.repo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.model.Profile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProfileJsonRepository {

    private final ObjectMapper mapper;
    private final Path baseDir;

    public ProfileJsonRepository(Path baseDir) throws IOException {
        this.baseDir = baseDir;
        this.mapper = new ObjectMapper();
        this.mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    //Create the directory path for directory of the User
    private Path userDir(String code){
        return baseDir.resolve(code);
    }

    //Create the file path for JSON file of the User
    private Path userFile(String code){
        return userDir(code).resolve("profile.json");
    }

    //Save the profile as a JSON file of the User
    public void save(Profile profile) throws IOException{
        if(profile == null || profile.getId() == null || profile.getId().isBlank()){
            throw new IllegalArgumentException("Profile/id must not be empty");
        }
        Path dir = userDir(profile.getCode());
        //Create directory
        Files.createDirectories(dir);
        Path file = userFile(profile.getCode());
        //Create the file in the directory that I create
        mapper.writeValue(file.toFile(), profile);
    }

    //Load the profile from the JSONS files
    public Profile load(String code) throws IOException{
        Path file = userFile(code);
        if(!Files.exists(file)) return null;
        return mapper.readValue(file.toFile(), Profile.class);
    }

    //Get the username
    public String getUsername(String code) throws IOException{
        Path path= userFile(code);
        if(!Files.exists(path)){
            return "File error - File does not exist";
        }
        String json = Files.readString(path);
        JsonNode jsonNode = mapper.readTree(json);
        String username = jsonNode.get("username").asText();
        if(username==null){
            return "Username error - Username is empty";
        }
        return username;
    }

    //Get the email
    public String getEmail(String code) throws IOException{
        Path path = userFile(code);
        if(!Files.exists(path)){
            return "File error - File does not exist";
        }
        String json = Files.readString(path);
        JsonNode jsonNode = mapper.readTree(json);
        String email = jsonNode.get("email").asText();
        if(email==null){
            return "Email error - Email is empty";
        }
        return email;
    }

    //Delete the file of one user
    public boolean delete(String code) throws IOException{
        Path file = userFile(code);
        if(!Files.exists(file)) return false;
        Files.delete(file);
        return true;
    }
}

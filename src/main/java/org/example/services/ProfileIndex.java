package org.example.services;

import org.example.model.Profile;
import org.example.repo.ProfileJsonRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ProfileIndex {

    private ProfileJsonRepository repo;
    private List<String> files;
    private Map<String, String> usernames;
    private Map<String, String> emails;

    public ProfileIndex(ProfileJsonRepository repo) throws IOException{
        this.repo = repo;
        this.usernames = new HashMap<>();
        this.emails = new HashMap<>();
        start();
    }

    private void start() throws IOException {
        setFiles();
        setUsernamesAndEmail();
    }

    private void setFiles() throws IOException{
        Path path = Path.of("data","users");
        try(Stream<Path> paths = Files.list(path)){
            files = paths.map(p->p.getFileName().toString()).toList();
        }
    }

    private void setUsernamesAndEmail() throws IOException{
        String username;
        String email;
        for(String file : files){
            username = repo.getUsername(file);
            email = repo.getEmail(file);
            usernames.put(username, file);
            emails.put(email, file);
        }
    }

    public void getFiles(){
        for(String file: files){
            System.out.println(file);
        }
    }

    public void getProfile(String value, int choice) throws IOException{
        String code;
        if(choice == 0){
            code = usernames.get(value);
            Profile profile = repo.load(code);
            System.out.println(profile.toString());
        }else{
            code = emails.get(value);
            //System.out.println(code);
            Profile profile = repo.load(code);
            System.out.println(profile.toString());
        }
    }

    public void getUsername(){
        System.out.println(usernames.toString());
    }

    public boolean checkIfUsernameExist(String username){
        return usernames.containsKey(username);
    }

    public boolean checkIfEmailExist(String email){
        return emails.containsKey(email);
    }
}

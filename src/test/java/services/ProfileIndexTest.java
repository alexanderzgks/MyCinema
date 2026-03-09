package services;

import org.example.repo.ProfileJsonRepository;
import org.example.services.ProfileIndex;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

public class ProfileIndexTest {

    private ProfileJsonRepository repo;
    private ProfileIndex index;

    public ProfileIndexTest() throws IOException {
        Path path = Path.of("data", "users");
        repo = new ProfileJsonRepository(path);
        index = new ProfileIndex(repo);
    }

    @Test
    void shouldGetOneProfile() throws IOException{
        index.getProfile("AAA1@gmail.com", 1);
    }

    @Test
    void shouldGetTheListOfFiles(){
        index.getUsername();
    }

    @Test
    void shoulGetTheListOfFiles(){
        index.getFiles();
    }
}

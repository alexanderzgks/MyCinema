package repo;

import org.example.model.Profile;
import org.example.repo.ProfileJsonRepository;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;


public class ProfileJsonRepositoryTest{

    private ProfileJsonRepository repo;

    public ProfileJsonRepositoryTest() throws IOException{
        Path path = Path.of("data");
        repo = new ProfileJsonRepository(path);
    }

    ProfileJsonRepository createClass() throws IOException{
        Path path = Path.of("data");
        ProfileJsonRepository repo = new ProfileJsonRepository(path);
        return repo;
    }

    @Test
    void shouldGetTheEmail() throws IOException{
        ProfileJsonRepository repo = createClass();
        String email = repo.getEmail("MC0001");
        System.out.println(email);
    }

    @Test
    void shouldGetTheUsername() throws IOException{
        ProfileJsonRepository repo = createClass();
        String username = repo.getUsername("MC0001");
        System.out.println(username);
    }

}

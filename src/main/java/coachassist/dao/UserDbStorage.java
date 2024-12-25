package coachassist.dao;

import coachassist.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class UserDbStorage {
    public Collection<User> getUsers() {
        return List.of();
    }

    public void addUser(User user) {
        String sqlCreateUser = "INSERT INTO";
    }

    public User getUserById(Long id) {
        return null;
    }

    public User updateUser(User user) {
        return null;
    }
}

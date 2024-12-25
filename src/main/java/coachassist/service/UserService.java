package coachassist.service;

import coachassist.dao.UserDbStorage;
import coachassist.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    private final UserDbStorage userDbStorage;

    public UserService(UserDbStorage userDbStorage) {
        this.userDbStorage = userDbStorage;
    }

    public Collection<User> getUsers() {
        return List.of();
    }

    public void addUser(User user) {

    }

    public User getUserById(Long id) {
        return null;
    }

    public User updateUser(User user) {
        return null;
    }
}

package coachassist.controller;

import coachassist.model.User;
import coachassist.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/countByUsername")
    public ResponseEntity<Long> getUserCountByUsername(@RequestParam String name) {
        long count = userService.countUsersByUsername(name);
        return ResponseEntity.ok(count);
    }
}

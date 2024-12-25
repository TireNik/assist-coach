package coachassist.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @NotBlank
    @Column(name = "login", nullable = false)
    private String login;

    @NotBlank
    @Column(name = "password", nullable = false)
    private String password;

    @NotNull
    @PastOrPresent
    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    @Column(name = "birthday")
    private LocalDate birthday;

}

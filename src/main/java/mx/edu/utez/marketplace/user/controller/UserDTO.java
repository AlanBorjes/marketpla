package mx.edu.utez.marketplace.user.controller;

import mx.edu.utez.marketplace.person.model.Person;
import mx.edu.utez.marketplace.role.model.Role;
import org.springframework.lang.NonNull;

import java.util.Set;

public class UserDTO {
    private long id;
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private Person person;
    @NonNull
    private Set<Role> roles;
    public UserDTO() {
    }

    public UserDTO(@NonNull String username, @NonNull String password, @NonNull Person person, @NonNull Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.roles = roles;
    }

    public UserDTO(long id, @NonNull String username, @NonNull String password, @NonNull Person person, @NonNull Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.person = person;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public Person getPerson() {
        return person;
    }

    public void setPerson(@NonNull Person person) {
        this.person = person;
    }

    @NonNull
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(@NonNull Set<Role> roles) {
        this.roles = roles;
    }
}

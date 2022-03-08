package mx.edu.utez.marketplace.role.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.marketplace.user.model.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true, length = 20)
    private String description;
    @ManyToMany
    @JoinTable(name = "user_role",
    joinColumns =  @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "user_ids"))
    @JsonIgnore
    private Set<User> users;

    public Role() {
    }

    public Role(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}

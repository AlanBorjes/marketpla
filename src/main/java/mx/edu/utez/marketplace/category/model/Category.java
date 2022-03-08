package mx.edu.utez.marketplace.category.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.marketplace.status.model.Status;
import mx.edu.utez.marketplace.subcategory.model.Subcategory;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "text", unique = true)
    private String description;

    @ManyToOne
    @JoinColumn(name = "status_id")
    @NonNull
    private Status status;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Subcategory> subcategoryList;

    public Category( String description, Status status) {
        this.description = description;
        this.status = status;
    }

    public Category(long id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Category(String description) {
        this.description = description;
    }

    public Category() {
    }

    public Category(long id, String description) {
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
}

package mx.edu.utez.marketplace.category.controller;

import mx.edu.utez.marketplace.category.model.Category;
import mx.edu.utez.marketplace.status.model.Status;
import mx.edu.utez.marketplace.utils.Message;
import org.springframework.http.ResponseEntity;

public class CategoryDTO {
    private long id;
    private String description;
    private Status status;

    public CategoryDTO(String description, Status status) {
        this.description = description;
        this.status = status;
    }

    public CategoryDTO() {
    }

    public CategoryDTO(String description) {
        this.description = description;
    }

    public CategoryDTO(long id, String description) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

package mx.edu.utez.marketplace.product.controller;

import mx.edu.utez.marketplace.status.model.Status;
import mx.edu.utez.marketplace.subcategory.model.Subcategory;

import java.util.List;

public class ProductDTO {
    private long id;
    private String name;
    private String description;
    private double price;
    private  int quantity;
    private String brand;
    private Status status;
    private Subcategory subcategory;
    private List<ProductImageDTO> images;

    public ProductDTO() {
    }

    public ProductDTO(String name, String description, double price, int quantity, String brand, Status status, List<ProductImageDTO> images) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.status = status;
        this.images = images;
    }

    public ProductDTO(long id, String name, String description, double price, int quantity, String brand, Status status, List<ProductImageDTO> images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.status = status;
        this.images = images;
    }

    public ProductDTO(long id, String name, String description, double price, int quantity, String brand, Status status, Subcategory subcategory, List<ProductImageDTO> images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.status = status;
        this.subcategory = subcategory;
        this.images = images;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<ProductImageDTO> getImages() {
        return images;
    }

    public void setImages(List<ProductImageDTO> images) {
        this.images = images;
    }
}

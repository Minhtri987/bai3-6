package Hutech.bai36.entity;

import Hutech.bai36.validator.annotation.ValidCategoryId;
import jakarta.persistence.*;
import Hutech.bai36.validator.annotation.ValidUserId;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    @NotEmpty(message = "Title must not be empty")
    @Size(max=50,min=1,message = "Title must be less than 50 characters")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="price")
    @NotNull(message = "Price is required")
    private Double price;

    @ManyToOne
    @JoinColumn(name="category_id")
//    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    @ValidUserId
    private User user;
    public Book(){}
    public Book(Long id, String title, String author, Double price, Category category,User user) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.user=user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
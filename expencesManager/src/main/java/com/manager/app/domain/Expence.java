package com.manager.app.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expences")
public class Expence {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "expence_date")
    private Date expenceDate;

    public Expence() {

    }

    public Expence(Long id, String name, Double price,  User user, Date expenceDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.user = user;
        this.expenceDate = expenceDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getExpenceDate() {
        return expenceDate;
    }

    public void setExpenceDate(Date expenceDate) {
        this.expenceDate = expenceDate;
    }

    @Override
    public String toString() {
        return "Expence{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", user=" + user +
                ", expenceDate=" + expenceDate +
                '}';
    }
}


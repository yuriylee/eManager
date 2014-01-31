package com.manager.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "earnings")
public class Earning {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Double amount;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Earning() {

    }

    public Earning(String name, User user, Double amount, Long id) {
        this.name = name;
        this.user = user;
        this.amount = amount;
        this.id = id;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Earning{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", user=" + user +
                '}';
    }
}

package com.manager.app.domain;

import javax.persistence.*;
import java.util.Date;

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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "earning_date")
    private Date earningDate;

    public Earning() {

    }

    public Earning(String name, User user, Double amount, Long id, Date earningDate) {
        this.name = name;
        this.user = user;
        this.amount = amount;
        this.id = id;
        this.earningDate = earningDate;
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

    public Date getEarningDate() {
        return earningDate;
    }

    public void setEarningDate(Date earningDate) {
        this.earningDate = earningDate;
    }

    @Override
    public String toString() {
        return "Earning{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", user=" + user +
                ", earningDate=" + earningDate +
                '}';
    }
}

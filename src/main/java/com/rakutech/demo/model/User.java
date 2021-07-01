package com.rakutech.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="user")
public class User {
    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(nullable = false, length = 45)
    private String email;

    @Column(nullable = false, length = 65)
    private String password;

    @Override
    public String toString() {
        return String.format("Id=%d, firstName='%s', email='%s', password='%s'",
                Id, firstName, email, password);
    }

    public User(String firstName, String email, String password) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

}


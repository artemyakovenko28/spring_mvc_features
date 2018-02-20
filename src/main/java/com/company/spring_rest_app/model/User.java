package com.company.spring_rest_app.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    private Long id;

    @Size(min = 5, max = 20, message = "{user.name.size}")
    private String name;

    @Size(min = 6, max = 15, message = "{user.password.size}")
    @Pattern(regexp = "\\S+", message = "{user.password.pattern}")
    private String password;

    @NotEmpty(message = "{user.email.empty}")
    @Email(message = "{user.email.valid}")
    private String email;

    private String role;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

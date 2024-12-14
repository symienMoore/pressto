package org.lightwave.pressto.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.context.annotation.Primary;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    String firstName;
    String lastName;

    @Column(unique = true)
    String email;

    @Column(unique = true)
    String password;

    @Column(unique = true)
    String username;

    Boolean is_active;
    Boolean is_admin;
    Boolean is_banned;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

//    public User(UUID id, String firstName, String lastName, String email, String password, String username, Boolean is_active, Boolean is_admin, Boolean is_banned, Date createdAt, Date updatedAt) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//        this.username = username;
//        this.is_active = is_active;
//        this.is_admin = is_admin;
//        this.is_banned = is_banned;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public UUID getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

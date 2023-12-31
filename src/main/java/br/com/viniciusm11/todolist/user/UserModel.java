package br.com.viniciusm11.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * 
 */
@Data
@Entity(name = "tbl_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID Id;

    @Column(unique = true)
    private String name;
    private String username;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}

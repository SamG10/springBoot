package com.example.spring_boot_demo1.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column()
    @NotBlank()
    String firstname;

    @Column()
    @NotBlank()
    String lastname;

    @Column()
    int age;
}

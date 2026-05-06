package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StuMAnEntity {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@NotBlank(message = "name cant be empty")
private String name;
private String department;
@Email(message = "invalid form")
private String email;
private String course;
}


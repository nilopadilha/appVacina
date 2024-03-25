package br.com.appVacina.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idemail", nullable = false)
    private Long id;
}

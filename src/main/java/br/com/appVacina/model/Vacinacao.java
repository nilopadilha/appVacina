package br.com.appVacina.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="vacinacao")
public class Vacinacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvacinacao", nullable = false)
    private Long id;
}

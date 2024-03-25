package br.com.appVacina.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="vacinas")
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvacina", nullable = false)
    private Long id;
}

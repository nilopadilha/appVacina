package br.com.appVacina.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="enderecos")

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idendereco", nullable = false)
    private Long id;
}

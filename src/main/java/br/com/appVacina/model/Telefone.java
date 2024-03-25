package br.com.appVacina.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="telefones")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtelefone", nullable = false)
    private Long id;
}

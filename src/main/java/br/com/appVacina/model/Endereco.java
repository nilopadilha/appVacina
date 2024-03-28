package br.com.appVacina.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="enderecos")

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idendereco", nullable = false)
    private Long id;
    @Column(name = "logradouro", nullable = false)
    private String logradouro;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro", nullable = false)
    private String  bairro;
    @Column(name = "cidade", nullable = false)
    private String  cidade;
    @Column(name = "uf", nullable = false)
    private String  uf;
    @Column(name = "cep", nullable = false)
    private String  cep;
    @Column(name = "pontoreferencia")
    private String  pontoReferencia;
    @Column(name = "complemento")
    private String  complemento;


}

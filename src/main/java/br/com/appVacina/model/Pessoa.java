package br.com.appVacina.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="pessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpessoa", nullable = false)
    private Long id;
    @NotBlank
    @Size(min = 1, max = 100)
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "datanascimento", nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "nome", nullable = false)
    private String Cpf;

  /*  pessoaId (fk) String null
    endereco : List<Endereco>
    email : List<Email>
    teleonfe : List<Telefone>
*/

}

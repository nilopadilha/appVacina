package br.com.appVacina.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
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
    @Column(name = "cpf", nullable = false)
    private String Cpf;
    @OneToMany(mappedBy = "pessoa_endereco_id", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Endereco> enderecos = new ArrayList<>();
    @OneToMany(mappedBy = "pessoa_email_id", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Email> emails = new ArrayList<>();;
    @OneToMany(mappedBy = "pessoa_telefone_id", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Telefone> telefones = new ArrayList<>();;

  /*  pessoaId (fk) String null*/

}

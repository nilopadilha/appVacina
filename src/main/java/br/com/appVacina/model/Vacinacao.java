package br.com.appVacina.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="vacinacao")
public class Vacinacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvacinacao", nullable = false)
    private Long id;

    @Column(name = "usuarioVacinado", nullable = false)
    private Pessoa usuarioVacinado;

    @Column(name = "vacina", nullable = false)
    private Vacina vacina;


}


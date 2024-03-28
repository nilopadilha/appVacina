package br.com.appVacina.model;

import br.com.appVacina.model.enums.TipoEmail;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idemail", nullable = false)
    private Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Enumerated(value = EnumType.STRING)
    private TipoEmail tipoEmail;
}

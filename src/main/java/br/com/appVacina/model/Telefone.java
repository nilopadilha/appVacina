package br.com.appVacina.model;

import br.com.appVacina.model.enums.TipoEmail;
import br.com.appVacina.model.enums.TipoTelefone;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="telefones")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtelefone", nullable = false)
    private Long id;
    @Column(name = "numero", nullable = false, length = 10)
    private String numero;
    @Column(name = "ddd", nullable = false, length = 3)
    private String ddd;
    @Enumerated(value = EnumType.STRING)
    private TipoTelefone tipoTelefone;
}

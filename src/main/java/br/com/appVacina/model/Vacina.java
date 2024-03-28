package br.com.appVacina.model;


import br.com.appVacina.model.enums.TipoEmail;
import br.com.appVacina.model.enums.TipoReforco;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="vacinas")

public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idvacina", nullable = false)
    private Long id;

    @Column(name = "lote", nullable = false)
    private String lote;

    @Column(name = "nomeDaVacina", nullable = false, length = 10)
    private String nomeDaVacina;

    @Column(name = "dataFabricacao")
    private LocalDate dataFabricacao;

    @Column(name = "dataValidade")
    private LocalDate dataValidade;

    @Column(name = "indicacaoIdade", nullable = false)
    private String IndicacaoIdade;

    @Column(name = "ciclo")
    private Integer ciclo; // em dias

    @Enumerated(value = EnumType.STRING)
    private TipoReforco tipoReforco;

}

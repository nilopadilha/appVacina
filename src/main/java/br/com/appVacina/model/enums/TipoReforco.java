package br.com.appVacina.model.enums;

import lombok.Getter;

@Getter
public enum TipoReforco {
    MENSAL("mensaal"),
    BIMESTRAL("bimestral"),
    TRIMESTRAL("trimestral"),
    ANUAL("anual");

    private final String descricao;

    TipoReforco(String descricao) {
        this.descricao = descricao;
    }
}

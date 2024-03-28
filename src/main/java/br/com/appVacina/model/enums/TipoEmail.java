package br.com.appVacina.model.enums;

import lombok.Getter;

@Getter
public enum TipoEmail {
    PESSOAL("pessoal"), TRABALHO("trabalho");

    private final String descricao;

    TipoEmail(String descricao) {
        this.descricao = descricao;
    }

}

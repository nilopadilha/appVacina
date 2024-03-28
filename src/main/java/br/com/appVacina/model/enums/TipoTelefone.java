package br.com.appVacina.model.enums;

import lombok.Getter;


@Getter
public enum TipoTelefone {
    RESIDENCIAL ("residencial"), RECADO("recado"), PESSOAL("pessoal"), TRABALHO("trabalho");

    private final String descricao;


    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }


}

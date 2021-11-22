package br.com.mths.devdojo.model;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filmes {

    @Name("id_filme")
    private Integer id;
    private String nomeFilme;
    private String categoriaFilme;
    private String duracaoFilme;

}

package br.com.mths.springbootessentials2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Films {

    private Long id;
    private String nome;
    private String categoria;

}

package br.com.mths.springbootessentials2.repository;

import br.com.mths.springbootessentials2.model.Films;

import java.util.List;

public interface FilmRepository {

    List<Films> listAll();

}

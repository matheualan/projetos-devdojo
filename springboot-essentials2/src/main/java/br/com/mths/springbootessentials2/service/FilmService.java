package br.com.mths.springbootessentials2.service;

import br.com.mths.springbootessentials2.model.Films;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    public List<Films> listAll() {
        return List.of(new Films(1L, "Trinity Brothers", "Comédia/Ação"),
                new Films(2L, "Cheech & Chong", "Comédia"),
                new Films(3L,"Alice no País das Maravilhas", "Ficção Científica"));
    }
}

package br.com.mths.devdojo.service;

import br.com.mths.devdojo.model.Filmes;
import br.com.mths.devdojo.repository.FilmesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FilmesService {

//    private final FilmesRepository filmesRepository;

    private List<Filmes> filmes = List.of(new Filmes(1, "Irmãos Trinity", "Comédia/Ação", "1h15m"),
                new Filmes(2, "Harry Potter", "Ficção Científica", "2h10m"),
                new Filmes(3, "Revolução das Máquinas", "Desenho", "1h30m"));

    public List<Filmes> listAll() {
        return filmes ;
    }

    public Filmes findById(Integer id) {
        return filmes.stream()
                .filter(filme -> filme.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Filme não encontrado"));
    }

}

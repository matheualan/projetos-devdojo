package br.com.mths.devdojo.controller;

import br.com.mths.devdojo.model.Filmes;
import br.com.mths.devdojo.service.FilmesService;
import br.com.mths.devdojo.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("filmes")
@Log4j2
@RequiredArgsConstructor
public class FilmesController {

    private final DateUtil dateUtil;
    private final FilmesService filmesService;

    @GetMapping("/")
    public ResponseEntity<List<Filmes>> findAll() {
        log.info(dateUtil.dateFormatted(LocalDateTime.now()).concat(" Log GET (findAll)"));
        return ResponseEntity.ok(filmesService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Filmes> findById(@PathVariable Integer id) {
        log.info(dateUtil.dateFormatted(LocalDateTime.now()).concat(" Log GET (getAll)"));
        return ResponseEntity.ok(filmesService.listAll().get(0));
    }

}

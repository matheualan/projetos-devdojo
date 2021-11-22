package br.com.mths.springbootessentials2.controller;

import br.com.mths.springbootessentials2.dateutil.DateUtil;
import br.com.mths.springbootessentials2.model.Films;
import br.com.mths.springbootessentials2.service.FilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/films")
@Log4j2
//@AllArgsConstructor //anotação lombok para criar construtor com todos atributos da classe
@RequiredArgsConstructor //faz o mesmo que o de cima porém com/deixa os atributos como 'final'
public class FilmsController {

    private final DateUtil dateUtil;
    private final FilmService filmService;

//    public FilmsController(DateUtil dateUtil) {
//        this.dateUtil = dateUtil;
//    }

    @GetMapping
    public List<Films> getAll() {
        log.info(dateUtil.dataFormatada(LocalDateTime.now()));
        return ResponseEntity<>(filmService.listAll());
    }
}
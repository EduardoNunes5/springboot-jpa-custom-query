package com.devsuperior.movieflix.controllers;


import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService service;


    @GetMapping
    public Page<MovieDTO> findByGenre(@RequestParam(required = false) Long genreId, @PageableDefault(sort = {"title"}, direction = Sort.Direction.ASC) Pageable pageable){
        return service.findByGenre(genreId, pageable);
    }

    @GetMapping("/{id}")
    public MovieDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}

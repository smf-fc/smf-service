package com.namdq.smf.service.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface BaseController<T> {

    @GetMapping
    Page<T> get(@RequestParam int page, @RequestParam int size);

    @PostMapping()
    T create(@Valid @RequestBody T t);

    @GetMapping("/{id}")
    T get(@PathVariable long id);

    @PutMapping("/{id}")
    T update(@PathVariable long id, @Valid @RequestBody T t);

    @DeleteMapping("/{id}")
    void delete(@PathVariable long id);
}

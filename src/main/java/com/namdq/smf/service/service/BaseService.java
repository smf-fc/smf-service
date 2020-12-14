package com.namdq.smf.service.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<T> {
    T create(T t);

    T get(long id);

    Page<T> get(Pageable pageable);

    T update(long id, T t);

    void delete(long id);
}

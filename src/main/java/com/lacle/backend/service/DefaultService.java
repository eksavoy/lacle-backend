package com.lacle.backend.service;

import java.util.List;

public interface DefaultService<T> {

    T get(Long id);

    List<T> getAll();

    void create(T object);

    T update(T object);

    void delete(Long id);

    void delete(T object);

}

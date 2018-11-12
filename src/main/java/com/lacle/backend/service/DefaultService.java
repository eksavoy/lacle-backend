package com.lacle.backend.service;

import javax.validation.Valid;
import java.util.List;

public interface DefaultService<T> {

    T get(Long id);

    List<T> getAll();

    T create(@Valid T object);

    T update(@Valid T object);

    void delete(Long id);

    void delete(@Valid T object);

}

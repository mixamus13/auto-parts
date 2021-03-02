package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.exceptions.ExceptionRepository;

public interface RepositoryManipulation<T> {

    T create();

    T update(T name) throws ExceptionRepository;

    T getByName(String name) throws ExceptionRepository;

    void delete(String id) throws ExceptionRepository;
}

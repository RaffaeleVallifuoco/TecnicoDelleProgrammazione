package it.raffo.dao;

import java.util.List;

public interface InterfacciaDao<T> {

    public List<T> findAll();

    public T findbyId(Integer id);

    public void insertMany(List<T> tipo);

}
package it.raffo.dao;

import java.util.List;

public interface DaoInterface<T> {

    public List<T> findAll();

    public T findbyId(Integer id);

    public void insertMany(List<T> type);

}

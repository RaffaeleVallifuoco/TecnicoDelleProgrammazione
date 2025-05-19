package it.raffo.dao;

import java.util.List;

public interface DaoInterface<T> {

    public List<T> findAll();

    public void insertMany(List<T> type);

}

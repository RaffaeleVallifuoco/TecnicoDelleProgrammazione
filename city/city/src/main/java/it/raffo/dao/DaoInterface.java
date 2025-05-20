package it.raffo.dao;

import java.util.List;

public interface DaoInterface<T> {

    public void insert(T istance);

    public List<T> findAll();

    public void remove(Integer pk);

    public void update(Integer id, String updatedValue);

}

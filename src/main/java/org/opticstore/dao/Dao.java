package org.opticstore.dao;


public interface Dao<T> {

    void add(T element);

    T find(Integer id);
}

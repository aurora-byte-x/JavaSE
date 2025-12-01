package com.aurora.generics.Practice;

import java.util.*;

public class DAO <T>{

    Map<String, T> map;

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        return new ArrayList<>(map.values());
    }

//    public List<T> list() {
//        ArrayList<T> list = new ArrayList<>();
//        Collection<T> values = map.values();
//        for (T entity : values) {
//            list.add(entity);
//        }
//        return list;
//    }

    public void delete(String id) {
        map.remove(id);
    }
}

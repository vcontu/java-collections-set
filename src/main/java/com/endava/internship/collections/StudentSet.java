package com.endava.internship.collections;

import java.util.*;

public class StudentSet<Student> implements Set<Student> {

    private transient NavigableMap<Student, Object> map;

    private static final Object DUMMY = new Object();

    StudentSet(){
        map = new TreeMap<>();
    }

    @Override
    public int size() {
        //TODO
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        //TODO
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        //TODO
        return map.containsKey(o);
    }

    @Override
    public Iterator<Student> iterator() {
        //TODO
        return map.navigableKeySet().iterator();
    }

    @Override
    public Object[] toArray() {
        //TODO
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        //TODO
        return null;
    }

    @Override
    public boolean add(Student student) {
        //TODO
        return map.put(student, DUMMY) == null;
    }

    @Override
    public boolean remove(Object o) {
        //TODO
        return map.remove(o) == DUMMY;
    }

    @Override
    public void clear() {
        //TODO
        map.clear();
    }

    @Override
    public boolean addAll(Collection<? extends Student> collection) {
        //TODO
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }
}

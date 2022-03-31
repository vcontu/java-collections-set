package com.endava.internship.collections;

import java.util.*;

public class StudentSet implements Set<Student> {
    Map<Student, Integer> studentSet;
    private static final Integer DEFAULT_VALUE = -1;

    public StudentSet() {
        studentSet = new HashMap<>();
    }

    @Override
    public int size() {
        return studentSet.size();
    }

    @Override
    public boolean isEmpty() {
        return studentSet.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Student student : studentSet.keySet()) {
            if (student.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Student> iterator() {
        return studentSet.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        int i = 0;
        Object[] result = new Object[studentSet.size()];
        for (Student student : this) {
            result[i++] = student;
        }
        return result;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        //TODO
//        return Arrays.stream(ts).toArray();
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Student student) {
        return studentSet.put(student, DEFAULT_VALUE) == null;
    }

    @Override
    public boolean remove(Object o) {
        return DEFAULT_VALUE.equals(studentSet.remove(o));
    }

    @Override
    public void clear() {
        studentSet.clear();
    }

    @Override
    public boolean addAll(Collection<? extends Student> collection) {
        // TO DO
        throw new UnsupportedOperationException();
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

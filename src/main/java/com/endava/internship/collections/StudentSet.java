package com.endava.internship.collections;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet implements Set<Student> {
    Set<Student> students;

    public StudentSet(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public int size() {
        return this.students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        } else {
            return o.equals(this);
        }
    }

    /*******************************************************/
    @Override
    public Iterator<Student> iterator() {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }
        return iterator;
    }

    @Override
    public Object[] toArray() {
        //TODO
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
        return false;
    }

    @Override
    public boolean remove(Object o) {
        //TODO
        return false;
    }

    @Override
    public void clear() {
        this.students.clear();
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

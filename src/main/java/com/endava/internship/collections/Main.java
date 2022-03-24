package com.endava.internship.collections;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentSet = new StudentSet();

        Student s1 = new Student("Jora", LocalDate.of(1998, 7, 23), "Boschetar");
        Student s2 = new Student("Clava", LocalDate.of(1988, 11, 19), "Mulgatoare");
        Student s3 = new Student("Aurel", LocalDate.of(1971, 3, 30), "Tractorist");
        Student s4 = new Student("Varvara", LocalDate.of(1991, 9, 14), "Deritecatoare");
        Student s5 = new Student("Fanel", LocalDate.of(2000, 2, 13), "Alcoolic");
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);

        System.out.println(studentSet.size());
        System.out.println(studentSet.isEmpty());
        System.out.println(studentSet.contains(s5));
        System.out.println(studentSet.iterator());
        System.out.println(Arrays.toString(studentSet.toArray()));
        System.out.println(studentSet.add(new Student("Zohan", LocalDate.of(1995, 12,25), "Frizer")));
        System.out.println(studentSet.remove(s5));
//        System.out.println(studentSet.clear());
    }
}

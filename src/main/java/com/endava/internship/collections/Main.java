package com.endava.internship.collections;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student alex = new Student("Alexandru", LocalDate.of(1999, Month.OCTOBER, 4), "student utm");
        Student alex2 = new Student("Alexandru", LocalDate.of(2000, Month.OCTOBER, 6), "student utm");
        Student alex3 = new Student("Alexandru", LocalDate.of(2000, Month.OCTOBER, 4), "student utm");
        Student ion = new Student("Ion", LocalDate.of(2002, Month.OCTOBER, 4), "student utm");
        Student marcel = new Student("Marcel", LocalDate.of(2000, Month.OCTOBER, 6), "student utm");


        Set<Student> studentSet = new StudentSet<>();
        studentSet.add(alex2);
        studentSet.add(marcel);
        studentSet.add(ion);
        studentSet.add(alex);
        studentSet.add(alex3);
        studentSet.add(alex);


        for (Student student : studentSet){
            System.out.println(student.getName() + "\t" +student.getDateOfBirth());
        }

//        TreeSet treeSet = new TreeSet();

        System.out.println(studentSet.size());

        System.out.println(studentSet.remove(ion));
        System.out.println("After removal of 1 item size = " + studentSet.size());
        studentSet.clear();
        System.out.println("After clearing the set size = " + studentSet.size());
    }
}

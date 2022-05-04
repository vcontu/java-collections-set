package com.endava.internship.collections;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StudentSetTest {

    private Set<Student> studentSet;

    private static Student st1;
    private static Student st2;
    private static Student st3;
    private static Student st4;
    private static Student st5;
    private static Student st6;

    @BeforeAll
    static void initialize() {
        st1 = new Student("Andrei", LocalDate.of(1998, 7, 23), "Student anul I");
        st2 = new Student("Tatiana", LocalDate.of(1988, 11, 19), "Studenta anul I");
        st3 = new Student("Victor", LocalDate.of(1971, 3, 30), "Student anul III");
        st4 = new Student("Olga", LocalDate.of(1991, 9, 14), "Studenta anul IV");
        st5 = new Student("Mihai", LocalDate.of(2000, 2, 13), "Student anul II");
        st6 = new Student("Ion", LocalDate.of(1999, 3, 8), "Student anul III");
    }

    @BeforeEach
    void setUp() {
        studentSet = new StudentSet();
    }

    @Test
    void size() {
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);
        studentSet.add(st6);

        assertThat(studentSet).hasSize(6);
    }

    @Test
    void isEmpty() {
        assertThat(studentSet).isEmpty();
    }

    @Test
    void contains() {
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);

        assertAll(
                () -> assertThat(studentSet.contains(st1)).isTrue(),
                () -> assertThat(studentSet.contains(st2)).isTrue(),
                () -> assertThat(studentSet.contains(st5)).isFalse()
        );
    }

    @Test
    void iterator() {
        studentSet.add(st6);
        studentSet.add(st2);
        studentSet.add(st1);

        Iterator<Student> iterator = studentSet.iterator();

        assertAll(
                () -> assertThat(iterator.hasNext()).isTrue(),
                () -> assertThat(iterator.next()).isNotNull(),
                () -> assertThat(iterator.next()).isIn(st6, st2)
        );
    }

    @Test
    void toArray() {
        studentSet.add(st4);
        studentSet.add(st1);
        studentSet.add(st6);

        assertAll(
                () -> assertThat(studentSet.toArray()).isNotEmpty(),
                () -> assertThat(studentSet.toArray()).hasSize(3),
                () -> assertThat(studentSet.toArray(new Student[0])).hasSameClassAs(new Student[0])
        );
    }

    @Test
    void add() {
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st6);

        assertAll(
                () -> assertThat(studentSet).isNotEmpty(),
                () -> assertThat(studentSet).contains(st1, st2, st3, st4, st6),
                () -> assertThat(studentSet).containsOnly(st1, st2, st3, st4, st6),
                () -> assertThat(studentSet).hasSize(5),
                () -> assertThat(studentSet.toString()).isNotEmpty(),
                () -> assertThat(studentSet.add(st1)).isFalse(),
                () -> assertThat(studentSet.add(st5)).isTrue()
        );
    }

    @Test
    void addAll() {
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);

        Set<Student> newStudentSet = new StudentSet();
        newStudentSet.add(st4);
        newStudentSet.add(st5);
        newStudentSet.add(st6);

        studentSet.addAll(newStudentSet);

        assertAll(
                () -> assertThat(studentSet).hasSize(6),
                () -> assertThat(studentSet).contains(st1, st2, st3, st4, st5, st6),
                () -> assertThat(studentSet).containsOnly(st1, st2, st3, st4, st5, st6),
                () -> assertThat(studentSet.addAll(newStudentSet)).isFalse()
        );
    }

    @Test
    void remove() {
        studentSet.add(st2);
        studentSet.add(st4);

        studentSet.remove(st2);
        studentSet.remove(st4);


        assertAll(
                () -> assertThat(studentSet).isEmpty(),
                () -> assertThat(studentSet.toArray()).isEmpty(),
                () -> assertThat(studentSet).hasSize(0),
                () -> assertThat(studentSet).doesNotContain(st2, st4),
                () -> assertThat(studentSet.remove(st2)).isFalse(),
                () -> assertThat(studentSet.remove(st4)).isFalse()
        );
    }

    @Test
    void clear() {
        studentSet.add(st4);
        studentSet.add(st1);
        studentSet.add(st2);

        studentSet.clear();

        assertAll(
                () -> assertThat(studentSet).doesNotContain(st4, st1, st2),
                () -> assertThat(studentSet).isEmpty(),
                () -> assertThat(studentSet).hasSize(0),
                () -> assertThat(studentSet).isNotNull(),
                () -> assertThat(studentSet.add(st4)).isTrue()
        );
    }
}
package collections;

import com.endava.internship.collections.Student;
import com.endava.internship.collections.StudentSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CompareStudentTestWithTreeSet {
    Student student1 = new Student(
            "Artur",
            LocalDate.of(2005, 5, 5),
            "asdf"
    );
    Student student2 = new Student(
            "John",
            LocalDate.of(2004, 4, 4),
            "asdf"
    );
    Student student3 = new Student(
            "John",
            LocalDate.of(2003, 3, 3),
            "asdf"
    );
    Student student4 = new Student(
            "Joe",
            LocalDate.of(2002, 2, 2),
            "asdf"
    );

    Set<Student> students;
    Set<Student> treeSet;

    @Before
    public void init() {
        students = new StudentSet();
        treeSet = new TreeSet<>();
    }

    @After
    public void clear() {
        students = null;
    }

    @Test
    public void iteratorWorks() {
        students.addAll(Arrays.asList(student1, student2, student3, student4));
        treeSet.addAll(Arrays.asList(student1, student2, student3, student4));

        Iterator<Student> studentIterator = students.iterator();
        Iterator<Student> treeSetIterator = treeSet.iterator();
        assertEquals(treeSetIterator.next(), studentIterator.next());
        assertEquals(treeSetIterator.next(), studentIterator.next());
        assertEquals(treeSetIterator.next(), studentIterator.next());
        assertEquals(treeSetIterator.next(), studentIterator.next());
    }

    @Test
    public void toObjectArray() {
        students.addAll(Arrays.asList(student1, student2, student3, student4));
        treeSet.addAll(Arrays.asList(student1, student2, student3, student4));
        assertArrayEquals(students.toArray(), treeSet.toArray());
    }

    @Test
    public void toGenericArray() {
        //TODO: Doesnt work
        students.addAll(Arrays.asList(student1, student2, student3, student4));
        treeSet.addAll(Arrays.asList(student1, student2, student3, student4));
        Student[] studentArray = new Student[10];
        assertArrayEquals(students.toArray(studentArray), treeSet.toArray(studentArray));
    }
}

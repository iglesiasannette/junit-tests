import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {


    Student annette = new Student(1, "annette");

    //this takes care of having to instantiate a new student object in every test
    @Before
    public void setUp() {
        annette = new Student(1, "annette");
    }

    @Test
    public void testIfStudentCanBeCreated() {
//        Student annette = new Student(1, "annette");
        Student justin = null;
        assertNotNull(annette);
        assertNull(justin);
    }

    //
    @Test
    public void testFieldsIfSetOrGet() {
//        Student annette = new Student(1,"annette");
        assertEquals(1, annette.getId());
        assertEquals("annette", annette.getName());
        assertNotNull(annette.getGrades());

    }

    @Test
    public void testIfAddGradeWorks() {
//        Student annette = new Student(1, "annette");
        annette.addGrade(80);
        assertSame(80, annette.getGrades().get(0)); //.get gets the first element of the grades array
        //now we want to see if the grades are being added to the arraylist
        assertSame(1, annette.getGrades().size()); //this is testing if there is 1 element in the array
        assertNotSame(2, annette.getGrades().size());
    }

    @Test
    public void testIfGradeAvgIsCorrect() {
//        Student annette = new Student(1, "annette");
        annette.addGrade(80);
        annette.addGrade(90);
        assertEquals(85, annette.getGradeAverage(), 0); //assert equals is a deprecated method and
        // needs a third parameter (delta) requiring the margin of error

    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setUp(){

        emptyCohort = new Cohort();


        cohortWithOne = new Cohort();
        Student annette = new Student(1, "annette");
        cohortWithOne.addStudent(annette);
        annette.addGrade(75);

        cohortWithMany = new Cohort();
        Student eric = new Student(1, "eric");
        eric.addGrade(75);
        Student ej = new Student(2, "ej");
        ej.addGrade(80);
        Student dereck = new Student(3, "dereck");
        dereck.addGrade(80);
        cohortWithMany.addStudent(eric);
        cohortWithMany.addStudent(ej);
        cohortWithMany.addStudent(dereck);



    }

    @Test
    public void ifCohortCanBeInstantiated(){
        Cohort ceres = new Cohort();
        Cohort andromeda = null;
        assertNotNull(ceres);
        assertNull(andromeda);
    }

    @Test
    public void ifStudentCanBeAdded(){
        assertEquals(0, emptyCohort.getStudents().size());
        Student bob = new Student(4,"bob");
        emptyCohort.addStudent(bob);
        assertEquals(1,emptyCohort.getStudents().size());

        assertEquals(1,cohortWithOne.getStudents().size());
        assertEquals(3, cohortWithMany.getStudents().size());

    }

    @Test
    public void ifCohortGradeAverageCorrect(){
        assertEquals(75, cohortWithOne.getCohortAverage(), 0);
        assertEquals(78,cohortWithMany.getCohortAverage(),1);


    }
}

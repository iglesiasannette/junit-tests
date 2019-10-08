//We will follow the best practices of TDD and we will create our tests first and write
// production code once we see the test fail. We will create a Student and a StudentTest
// class for a grades application, let's analyse the requirements for the Student class:

//1. id should be a long number used to represent a "unique user" in our application.
//2. name is a String that holds the name of the student.
//3. grades is an ArrayList that contains a list of Integer numbers.

//The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
//The Student class should have the following methods:

import java.util.ArrayList;

public  class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;


    public Student(long id, String name) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();//instantiated arrayList. not a parameter but belongs to the student object
    }


    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;

    }

    public void setId(long id) {
        this.id = id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public ArrayList<Integer> setGrades(ArrayList<Integer> grades) {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);

    }

    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++)
            total += this.grades.get(i);
            return total / this.grades.size();

    }


}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP8;

/**
 *
 * @author Admin
 */
public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSE = 30;

    public Student (String name, String address){
        super( name , address);
        this.numCourses = 0;
        courses = new String[MAX_COURSE];
        grades = new int[MAX_COURSE];

    }
    @Override
    public String toString(){
        return "Sturdent :"+ super.toString();
    }
    // adds a course and its grade - No input validation
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++ numCourses;
    }
    //printss all courses taken and their grade
    public void printGrandes(){
        System.out.println(this);
        for( int i  = 0; i< numCourses; i++){
            System.out.println(""+courses[i] +":"+grades[i]);

        }
        System.out.println();
    }
    // computes the average grade
    public double getAverageGrade(){
        int sum = 0;
        for (int i = 0; i <numCourses; i++){
            sum+= grades[i];
        }
        return (double)sum/numCourses;
    }
}
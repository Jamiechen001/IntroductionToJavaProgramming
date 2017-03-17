package me.jamiechen.object_oriented;

/**
 * Course 类
 *
 * Created by JamieChen on 2017/2/28 0028.
 */
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                students[i] = null;
                numberOfStudents--;
            }
        }
    }
}

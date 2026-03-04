package org.example;

import hospital.characters.Doctor;
import hospital.interfaces.IStudentDoctor;

public class StudentDoctor extends Doctor implements IStudentDoctor {

    private String currentCourse;
    private int weeklyWorkHoursCount;
    private int weeklyStudyHoursCount;
    private String university;

    public StudentDoctor(String name, int age, String dni, String gender,
                         String phoneNumber, String licenseNumber, String department,
                         double salary, String currentCourse, int weeklyWorkHoursCount,
                         int weeklyStudyHoursCount, String university) {
        super(name, age, dni, gender, phoneNumber, licenseNumber, department, salary);
        this.currentCourse = currentCourse;
        this.weeklyWorkHoursCount = weeklyWorkHoursCount;
        this.weeklyStudyHoursCount = weeklyStudyHoursCount;
        this.university = university;
    }

    // Getters
    public String getCurrentCourse() { return currentCourse; }
    public int getWeeklyWorkHoursCount() { return weeklyWorkHoursCount; }
    public int getWeeklyStudyHoursCount() { return weeklyStudyHoursCount; }
    public String getUniversity() { return university; }

    // Setters
    public void setCurrentCourse(String currentCourse) { this.currentCourse = currentCourse; }
    public void setWeeklyWorkHoursCount(int weeklyWorkHoursCount) { this.weeklyWorkHoursCount = weeklyWorkHoursCount; }
    public void setWeeklyStudyHoursCount(int weeklyStudyHoursCount) { this.weeklyStudyHoursCount = weeklyStudyHoursCount; }
    public void setUniversity(String university) { this.university = university; }

    @Override
    public void weeklyWorkHours() {
        System.out.println(">>> [STUDENT] Dr. " + getName() + " works " + weeklyWorkHoursCount + " hours per week at the hospital.");
    }

    @Override
    public void weeklyStudyHours() {
        System.out.println(">>> [STUDENT] Dr. " + getName() + " studies " + weeklyStudyHoursCount + " hours per week.");
    }

    @Override
    public void eat() {
        System.out.println(">>> [STUDENT] Dr. " + getName() + " eats quickly between rounds and classes.");
    }

    @Override
    public void currentCourse() {
        System.out.println(">>> [STUDENT] Dr. " + getName() + " is currently in: " + currentCourse + " at " + university + ".");
    }

    @Override
    public void showInfo() {
        System.out.println("====== STUDENT DOCTOR ======");
        System.out.println(this);
        System.out.println("  Current Course      : " + currentCourse);
        System.out.println("  University          : " + university);
        System.out.println("  Weekly Work Hours   : " + weeklyWorkHoursCount + "h");
        System.out.println("  Weekly Study Hours  : " + weeklyStudyHoursCount + "h");
        System.out.println("============================");
    }

    @Override
    public String toString() {
        return "[StudentDoctor] " + super.toString() +
                " | Course: " + currentCourse +
                " | University: " + university +
                " | Work h/w: " + weeklyWorkHoursCount +
                " | Study h/w: " + weeklyStudyHoursCount;
    }
}
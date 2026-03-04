package org.example;

import hospital.characters.Doctor;
import hospital.interfaces.ISpecialistDoctor;

public class SpecialistDoctor extends Doctor implements ISpecialistDoctor {

    private String specialtyName;
    private int weeklyHours;
    private int vacationDays;

    public SpecialistDoctor(String name, int age, String dni, String gender,
                            String phoneNumber, String licenseNumber, String department,
                            double salary, String specialtyName, int weeklyHours, int vacationDays) {
        super(name, age, dni, gender, phoneNumber, licenseNumber, department, salary);
        this.specialtyName = specialtyName;
        this.weeklyHours = weeklyHours;
        this.vacationDays = vacationDays;
    }

    // Getters
    public String getSpecialtyName() { return specialtyName; }
    public int getWeeklyHours() { return weeklyHours; }
    public int getVacationDays() { return vacationDays; }

    // Setters
    public void setSpecialtyName(String specialtyName) { this.specialtyName = specialtyName; }
    public void setWeeklyHours(int weeklyHours) { this.weeklyHours = weeklyHours; }
    public void setVacationDays(int vacationDays) { this.vacationDays = vacationDays; }

    @Override
    public void weeklyWorkHours() {
        System.out.println(">>> [SPECIALIST] Dr. " + getName() + " works " + weeklyHours + " hours per week.");
    }

    @Override
    public void eat() {
        System.out.println(">>> [SPECIALIST] Dr. " + getName() + " is on lunch break in the cafeteria.");
    }

    @Override
    public void vacation() {
        System.out.println(">>> [SPECIALIST] Dr. " + getName() + " has " + vacationDays + " vacation days remaining.");
    }

    @Override
    public void specialty() {
        System.out.println(">>> [SPECIALIST] Dr. " + getName() + " specializes in: " + specialtyName + ".");
    }

    @Override
    public void showInfo() {
        System.out.println("====== SPECIALIST DOCTOR ======");
        System.out.println(this);
        System.out.println("  Specialty     : " + specialtyName);
        System.out.println("  Weekly Hours  : " + weeklyHours + "h");
        System.out.println("  Vacation Days : " + vacationDays);
        System.out.println("===============================");
    }

    @Override
    public String toString() {
        return "[SpecialistDoctor] " + super.toString() +
                " | Specialty: " + specialtyName +
                " | Weekly Hours: " + weeklyHours +
                " | Vacation Days: " + vacationDays;
    }
}

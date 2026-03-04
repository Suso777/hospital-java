package org.example;

public abstract class Doctor extends Character {

    private String licenseNumber;
    private String department;
    private double salary;

    public Doctor(String name, int age, String dni, String gender,
                  String phoneNumber, String licenseNumber, String department, double salary) {
        super(name, age, dni, gender, phoneNumber);
        this.licenseNumber = licenseNumber;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getLicenseNumber() { return licenseNumber; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Setters
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return super.toString() +
                " | License: " + licenseNumber +
                " | Department: " + department +
                " | Salary: " + salary + "€";
    }
}
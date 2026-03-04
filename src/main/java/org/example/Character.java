package org.example;

public abstract class Character {

    private String name;
    private int age;
    private String dni;
    private String gender;
    private String phoneNumber;

    public Character(String name, int age, String dni, String gender, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDni() { return dni; }
    public String getGender() { return gender; }
    public String getPhoneNumber() { return phoneNumber; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setDni(String dni) { this.dni = dni; }
    public void setGender(String gender) { this.gender = gender; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public abstract void showInfo();

    @Override
    public String toString() {
        return "Name: " + name +
                " | Age: " + age +
                " | DNI: " + dni +
                " | Gender: " + gender +
                " | Phone: " + phoneNumber;
    }
}
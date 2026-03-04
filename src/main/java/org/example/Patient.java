package org.example;

public abstract class Patient extends Character {

    private String diagnosis;
    private String medicalHistory;
    private String bloodType;

    public Patient(String name, int age, String dni, String gender,
                   String phoneNumber, String diagnosis, String medicalHistory, String bloodType) {
        super(name, age, dni, gender, phoneNumber);
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
        this.bloodType = bloodType;
    }

    // Getters
    public String getDiagnosis() { return diagnosis; }
    public String getMedicalHistory() { return medicalHistory; }
    public String getBloodType() { return bloodType; }

    // Setters
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }
    public void setBloodType(String bloodType) { this.bloodType = bloodType; }

    @Override
    public String toString() {
        return super.toString() +
                " | Diagnosis: " + diagnosis +
                " | Blood Type: " + bloodType +
                " | Medical History: " + medicalHistory;
    }
}
package org.example;

import org.example.characters.Patient;
import org.example.interfaces.IAmbulancePatient;

public class AmbulancePatient extends Patient implements IAmbulancePatient {

    private String ambulanceCode;
    private String surgeonName;
    private String roomNumber;
    private String rehabilitationPlan;

    public AmbulancePatient(String name, int age, String dni, String gender,
                            String phoneNumber, String diagnosis, String medicalHistory,
                            String bloodType, String ambulanceCode, String surgeonName,
                            String roomNumber, String rehabilitationPlan) {
        super(name, age, dni, gender, phoneNumber, diagnosis, medicalHistory, bloodType);
        this.ambulanceCode = ambulanceCode;
        this.surgeonName = surgeonName;
        this.roomNumber = roomNumber;
        this.rehabilitationPlan = rehabilitationPlan;
    }

    // Getters
    public String getAmbulanceCode() { return ambulanceCode; }
    public String getSurgeonName() { return surgeonName; }
    public String getRoomNumber() { return roomNumber; }
    public String getRehabilitationPlan() { return rehabilitationPlan; }

    // Setters
    public void setAmbulanceCode(String ambulanceCode) { this.ambulanceCode = ambulanceCode; }
    public void setSurgeonName(String surgeonName) { this.surgeonName = surgeonName; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public void setRehabilitationPlan(String rehabilitationPlan) { this.rehabilitationPlan = rehabilitationPlan; }

    @Override
    public void admission() {
        System.out.println(">>> [AMBULANCE] " + getName() + " arriving via ambulance " + ambulanceCode + " — emergency admission.");
    }

    @Override
    public void operation() {
        System.out.println(">>> [AMBULANCE] " + getName() + " is being operated on by Dr. " + surgeonName + ".");
    }

    @Override
    public void room() {
        System.out.println(">>> [AMBULANCE] " + getName() + " moved to ICU room " + roomNumber + " post-operation.");
    }

    @Override
    public void treatment() {
        System.out.println(">>> [AMBULANCE] " + getName() + " receiving post-op treatment for: " + getDiagnosis() + ".");
    }

    @Override
    public void rehabilitation() {
        System.out.println(">>> [AMBULANCE] " + getName() + " starting rehabilitation plan: " + rehabilitationPlan + ".");
    }

    @Override
    public void exit() {
        System.out.println(">>> [AMBULANCE] " + getName() + " has been discharged after full recovery.");
    }

    @Override
    public void showInfo() {
        System.out.println("====== AMBULANCE PATIENT ======");
        System.out.println(this);
        System.out.println("  Ambulance Code     : " + ambulanceCode);
        System.out.println("  Surgeon            : " + surgeonName);
        System.out.println("  Room               : " + roomNumber);
        System.out.println("  Rehabilitation Plan: " + rehabilitationPlan);
        System.out.println("===============================");
    }

    @Override
    public String toString() {
        return "[AmbulancePatient] " + super.toString() +
                " | Ambulance: " + ambulanceCode +
                " | Surgeon: " + surgeonName +
                " | Room: " + roomNumber +
                " | Rehab: " + rehabilitationPlan;
    }
}
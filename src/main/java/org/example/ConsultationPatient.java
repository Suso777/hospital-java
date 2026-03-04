package org.example;


import org.example.characters.Patient;
import org.example.interfaces.IConsultationPatient;

public class ConsultationPatient extends Patient implements IConsultationPatient {

    private String appointmentDate;
    private String assignedNurse;
    private String roomNumber;

    public ConsultationPatient(String name, int age, String dni, String gender,
                               String phoneNumber, String diagnosis, String medicalHistory,
                               String bloodType, String appointmentDate, String assignedNurse, String roomNumber) {
        super(name, age, dni, gender, phoneNumber, diagnosis, medicalHistory, bloodType);
        this.appointmentDate = appointmentDate;
        this.assignedNurse = assignedNurse;
        this.roomNumber = roomNumber;
    }

    // Getters
    public String getAppointmentDate() { return appointmentDate; }
    public String getAssignedNurse() { return assignedNurse; }
    public String getRoomNumber() { return roomNumber; }

    // Setters
    public void setAppointmentDate(String appointmentDate) { this.appointmentDate = appointmentDate; }
    public void setAssignedNurse(String assignedNurse) { this.assignedNurse = assignedNurse; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    @Override
    public void admission() {
        System.out.println(">>> [CONSULTATION] " + getName() + " is completing admission at reception.");
    }

    @Override
    public void nurseControl() {
        System.out.println(">>> [CONSULTATION] Nurse " + assignedNurse + " is taking vitals of " + getName() + ".");
    }

    @Override
    public void room() {
        System.out.println(">>> [CONSULTATION] " + getName() + " has been assigned to room " + roomNumber + ".");
    }

    @Override
    public void treatment() {
        System.out.println(">>> [CONSULTATION] " + getName() + " is receiving treatment for: " + getDiagnosis() + ".");
    }

    @Override
    public void nextAppointment() {
        System.out.println(">>> [CONSULTATION] Next appointment for " + getName() + " scheduled on: " + appointmentDate + ".");
    }

    @Override
    public void exit() {
        System.out.println(">>> [CONSULTATION] " + getName() + " has been discharged successfully.");
    }

    @Override
    public void showInfo() {
        System.out.println("====== CONSULTATION PATIENT ======");
        System.out.println(this);
        System.out.println("  Assigned Nurse : " + assignedNurse);
        System.out.println("  Room Number    : " + roomNumber);
        System.out.println("  Next Appointment: " + appointmentDate);
        System.out.println("==================================");
    }

    @Override
    public String toString() {
        return "[ConsultationPatient] " + super.toString() +
                " | Nurse: " + assignedNurse +
                " | Room: " + roomNumber +
                " | Next Appointment: " + appointmentDate;
    }
}
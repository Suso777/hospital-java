package org.example;


import org.example.doctors.SpecialistDoctor;
import org.example.doctors.StudentDoctor;
import org.example.patients.AmbulancePatient;
import org.example.patients.ConsultationPatient;

public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║         HOSPITAL MANAGEMENT SYSTEM       ║");
        System.out.println("╚══════════════════════════════════════════╝\n");

        // ── CONSULTATION PATIENTS ──────────────────────────────────────
        ConsultationPatient consultationPatient1 = new ConsultationPatient(
                "Laura García", 34, "12345678A", "Female", "612345678",
                "Hypertension", "No previous surgeries", "A+",
                "2026-03-15", "Ana López", "204"
        );

        ConsultationPatient consultationPatient2 = new ConsultationPatient(
                "Carlos Ruiz", 52, "87654321B", "Male", "698765432",
                "Type 2 Diabetes", "Appendectomy 2015", "B-",
                "2026-03-20", "Pedro Martín", "107"
        );

        // ── AMBULANCE PATIENTS ─────────────────────────────────────────
        AmbulancePatient ambulancePatient1 = new AmbulancePatient(
                "Marta Sánchez", 41, "11223344C", "Female", "655443322",
                "Fractured femur", "Allergy to penicillin", "O+",
                "AMB-001", "Dr. Fernández", "UCI-3", "Physiotherapy 6 weeks"
        );

        AmbulancePatient ambulancePatient2 = new AmbulancePatient(
                "José Pérez", 67, "44332211D", "Male", "677889900",
                "Acute myocardial infarction", "Controlled hypertension", "AB+",
                "AMB-002", "Dr. Romero", "UCI-1", "Cardiac rehabilitation 3 months"
        );

        // ── SPECIALIST DOCTORS ─────────────────────────────────────────
        SpecialistDoctor specialistDoctor1 = new SpecialistDoctor(
                "Elena Torres", 45, "55667788E", "Female", "611223344",
                "MD-4521", "Cardiology", 4200.00,
                "Cardiology", 40, 25
        );

        SpecialistDoctor specialistDoctor2 = new SpecialistDoctor(
                "Roberto Navarro", 50, "99887766F", "Male", "622334455",
                "MD-7832", "Traumatology", 4800.00,
                "Traumatology", 45, 22
        );

        // ── STUDENT DOCTORS ────────────────────────────────────────────
        StudentDoctor studentDoctor1 = new StudentDoctor(
                "Paula Jiménez", 26, "33445566G", "Female", "633445566",
                "RES-1001", "Internal Medicine", 1200.00,
                "MIR Year 2 - Internal Medicine", 30, 20, "Universidad Complutense de Madrid"
        );

        StudentDoctor studentDoctor2 = new StudentDoctor(
                "Andrés Molina", 28, "66554433H", "Male", "644556677",
                "RES-1002", "Surgery", 1200.00,
                "MIR Year 3 - General Surgery", 35, 15, "Universidad de Barcelona"
        );

        // ══════════════════════════════════════════════════════════════
        //  PRINT ALL CHARACTERS
        // ══════════════════════════════════════════════════════════════

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  CONSULTATION PATIENTS");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        consultationPatient1.showInfo();
        System.out.println();
        consultationPatient2.showInfo();

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  AMBULANCE PATIENTS");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        ambulancePatient1.showInfo();
        System.out.println();
        ambulancePatient2.showInfo();

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  SPECIALIST DOCTORS");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        specialistDoctor1.showInfo();
        System.out.println();
        specialistDoctor2.showInfo();

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  STUDENT DOCTORS");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        studentDoctor1.showInfo();
        System.out.println();
        studentDoctor2.showInfo();

        // ══════════════════════════════════════════════════════════════
        //  DEMONSTRATE METHODS (POLYMORPHISM)
        // ══════════════════════════════════════════════════════════════

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  CONSULTATION PATIENT WORKFLOW");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        consultationPatient1.admission();
        consultationPatient1.nurseControl();
        consultationPatient1.room();
        consultationPatient1.treatment();
        consultationPatient1.nextAppointment();
        consultationPatient1.exit();

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  AMBULANCE PATIENT WORKFLOW");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        ambulancePatient1.admission();
        ambulancePatient1.operation();
        ambulancePatient1.room();
        ambulancePatient1.treatment();
        ambulancePatient1.rehabilitation();
        ambulancePatient1.exit();

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  SPECIALIST DOCTOR WORKFLOW");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        specialistDoctor1.specialty();
        specialistDoctor1.weeklyWorkHours();
        specialistDoctor1.eat();
        specialistDoctor1.vacation();

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  STUDENT DOCTOR WORKFLOW");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        studentDoctor1.currentCourse();
        studentDoctor1.weeklyWorkHours();
        studentDoctor1.weeklyStudyHours();
        studentDoctor1.eat();

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║           END OF HOSPITAL SESSION        ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
}
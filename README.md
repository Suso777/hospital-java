# 🏥 Hospital Management System

Un ejercicio de OOP en Java que implementa un sistema de gestión hospitalaria usando encapsulación, herencia, polimorfismo, abstracción, interfaces y principios SOLID.

## 📁 Estructura del Proyecto

```
hospital/
└── src/main/java/hospital/
    ├── Main.java
    ├── characters/
    │   ├── Character.java       ← Clase superclase abstracta
    │   ├── Patient.java         ← Clase abstracta
    │   └── Doctor.java          ← Clase abstracta
    ├── patients/
    │   ├── ConsultationPatient.java
    │   └── AmbulancePatient.java
    ├── doctors/
    │   ├── SpecialistDoctor.java
    │   └── StudentDoctor.java
    └── interfaces/
        ├── IAdmission.java
        ├── IConsultationPatient.java
        ├── IAmbulancePatient.java
        ├── IWorkSchedule.java
        ├── ISpecialistDoctor.java
        └── IStudentDoctor.java
```

## 🧬 Jerarquía de Clases

```
Character (clase superclase abstracta)
├── Patient (abstracta)
│   ├── ConsultationPatient  implementa IConsultationPatient
│   └── AmbulancePatient     implementa IAmbulancePatient
└── Doctor (abstracta)
    ├── SpecialistDoctor     implementa ISpecialistDoctor
    └── StudentDoctor        implementa IStudentDoctor
```

## 🔑 Conceptos OOP Aplicados

### Encapsulación
Todos los atributos en todas las clases se declaran como privados. El acceso se proporciona exclusivamente a través de getters y setters públicos.

### Herencia

- `Patient` y `Doctor` extienden `Character` (superclase).
- `ConsultationPatient` y `AmbulancePatient` extienden `Patient`.
- `SpecialistDoctor` y `StudentDoctor` extienden `Doctor`.

### Polimorfismo

- `showInfo()` se declara abstracto en `Character` y se sobrescribe de manera diferente en cada clase concreta.
- `toString()` se sobrescribe en cada nivel de la jerarquía, llamando a `super.toString()` para encadenar datos.

### Abstracción

- `Character`, `Patient` y `Doctor` son clases abstractas — no pueden instanciarse directamente.
- Las interfaces definen contratos que las clases concretas deben cumplir.

### Interfaces

| Interfaz | Extiende | Implementada por |
|----------|----------|------------------|
| `IAdmission` | — | (base para interfaces de paciente) |
| `IConsultationPatient` | `IAdmission` | `ConsultationPatient` |
| `IAmbulancePatient` | `IAdmission` | `AmbulancePatient` |
| `IWorkSchedule` | — | (base para interfaces de doctor) |
| `ISpecialistDoctor` | `IWorkSchedule` | `SpecialistDoctor` |
| `IStudentDoctor` | `IWorkSchedule` | `StudentDoctor` |

## 🧱 Principios SOLID

| Principio | Aplicación |
|-----------|-----------|
| **S** — Responsabilidad Única | Cada clase tiene una clara responsabilidad (flujo de paciente, horario de doctor, etc.) |
| **O** — Abierto/Cerrado | Se pueden agregar nuevos tipos de pacientes o doctores sin modificar clases existentes |
| **L** — Sustitución de Liskov | `ConsultationPatient` y `AmbulancePatient` pueden reemplazar `Patient` sin romper comportamientos |
| **I** — Segregación de Interfaz | Las interfaces son pequeñas y específicas (ej: `IConsultationPatient` ≠ `IAmbulancePatient`) |
| **D** — Inversión de Dependencia | `Main` depende de abstracciones (`Character`, interfaces) no de implementaciones concretas |

## 👩💻 Cómo Ejecutar

### Requisitos Previos

- Java JDK 11+
- Maven 3.6+ (opcional, para compilación avanzada)

### Compilar

```bash
find src -name "*.java" > sources.txt
javac -d out @sources.txt
```

### Ejecutar

```bash
java -cp out hospital.Main
```

## 📚 Conceptos Clave

- **Clases Abstractas**: No se pueden instanciar, sirven como plantillas para subclases.
- **Métodos Abstractos**: Deben ser implementados por todas las subclases concretas.
- **Interfaces**: Definen un contrato de métodos que deben implementar las clases.
- **Polimorfismo**: El mismo método puede comportarse de manera diferente según la clase que lo implemente.
- **Encapsulación**: Los datos internos están protegidos y se accede a través de métodos públicos.

## 📄 Licencia

Este proyecto es de código abierto y está disponible bajo la licencia MIT.

## 👤 Autor

**Suso777** - [Perfil de GitHub](https://github.com/Suso777)

---

**Última actualización**: 5 de marzo de 2026

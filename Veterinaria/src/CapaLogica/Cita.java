package CapaLogica;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private LocalDate fechaEntrada;  // The entry date for the appointment
    private LocalTime horaCita;      // The time of the appointment
    private String observaciones;    // Additional observations or notes for the appointment
    private String nombreMascota;    // The name of the pet for the appointment

    // Default constructor
    public Cita() {
    }

    // Constructor with parameters to initialize the appointment details
    public Cita(LocalDate fechaEntrada, LocalTime horaCita, String observaciones, String nombreMascota) {
        this.fechaEntrada = fechaEntrada;  // Set the entry date for the appointment
        this.horaCita = horaCita;          // Set the appointment time
        this.observaciones = observaciones; // Set the additional observations
        this.nombreMascota = nombreMascota; // Set the pet's name
    }

    // Getter and Setter methods for the class attributes

    public LocalDate getFechaEntrada() {
        return fechaEntrada;  // Return the entry date of the appointment
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;  // Set the entry date of the appointment
    }

    public LocalTime getHoraCita() {
        return horaCita;  // Return the time of the appointment
    }

    public void setHoraCita(LocalTime horaCita) {
        this.horaCita = horaCita;  // Set the time of the appointment
    }

    public String getObservaciones() {
        return observaciones;  // Return any additional notes for the appointment
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;  // Set the additional observations
    }

    public String getNombreMascota() {
        return nombreMascota;  // Return the pet's name for the appointment
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;  // Set the pet's name for the appointment
    }

    // Override the toString() method to display the details of the appointment
    @Override
    public String toString() {
        return "Cita{" +
                "fechaEntrada=" + fechaEntrada +
                ", horaCita=" + horaCita +
                ", observaciones='" + observaciones + '\'' +
                ", nombreMascota=" + nombreMascota +
                '}';  // Format the appointment details as a string
    }
}

package CapaLogica;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservacion {
    private String nombreMascota; // Name of the pet
    private LocalDate fechaEntrada; // Check-in date
    private LocalDate fechaSalida; // Check-out date
    private LocalTime horaReservacion; // Reservation time
    private String observacion; // Observations related to the reservation

    // Constructor of the class
    public Reservacion() {
    }

    // Constructor with parameters to initialize the reservation details
    public Reservacion(LocalDate fechaEntrada, LocalDate fechaSalida, LocalTime horaReservacion, String observacion) {
        this.nombreMascota = nombreMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.horaReservacion = horaReservacion;
        this.observacion = observacion;
    }

    // Getter and Setter for pet's name
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    // Getter and Setter for check-in date
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    // Getter and Setter for check-out date
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    // Getter and Setter for reservation time
    public LocalTime getHoraReservacion() {
        return horaReservacion;
    }

    public void setHoraReservacion(LocalTime horaReservacion) {
        this.horaReservacion = horaReservacion;
    }

    // Getter and Setter for observation related to the reservation
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    // Overridden toString method to represent the reservation details as a string
    @Override
    public String toString() {
        return "Reservacion{" +
                ", nombreMascota='" + nombreMascota + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", horaReservacion=" + horaReservacion +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}

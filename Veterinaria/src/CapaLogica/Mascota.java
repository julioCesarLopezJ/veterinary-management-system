package CapaLogica;

public class Mascota {
    private String nombreMascota; // Name of the pet
    private String foto; // Photo of the pet
    private String observaciones; // Observations about the pet
    private int ranking; // Ranking of the pet
    private Reservacion reservacion; // Reservation linked to the pet
    private Cita cita; // Appointment linked to the pet

    // Constructor of the class
    public Mascota() {
    }

    // Constructor with parameters to initialize the pet's details
    public Mascota(String nombreMascota, String foto, String observaciones, int ranking) {
        this.nombreMascota = nombreMascota;
        this.foto = foto;
        this.observaciones = observaciones;
        this.ranking = ranking;
        this.reservacion = new Reservacion(); // Initializing a new reservation
        this.cita = new Cita(); // Initializing a new appointment
    }

    // Getter and Setter for pet's name
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    // Getter and Setter for pet's photo
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    // Getter and Setter for pet's observations
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // Getter and Setter for pet's ranking
    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    // Getter and Setter for the reservation associated with the pet
    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    // Getter and Setter for the appointment associated with the pet
    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    // Overridden toString method to represent the pet's details as a string
    @Override
    public String toString() {
        return "Mascota{" +
                "nombreMascota='" + nombreMascota + '\'' +
                ", foto='" + foto + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", ranking=" + ranking +
                ", reservacion=" + reservacion +
                ", cita=" + cita +
                '}';
    }
}

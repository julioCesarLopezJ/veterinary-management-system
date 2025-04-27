package CapaLogica;

public class Usuario {
    private String nombreCompleto; // Full name of the user
    private String cedula; // User's ID or identification number
    private int telefono; // User's phone number
    private String direccion; // User's address
    private String estado; // Status of the user (e.g., active, inactive)
    private String rol; // Role of the user (e.g., admin, client)
    private Cita cita; // The appointment associated with the user
    private Reservacion reservacion; // The reservation associated with the user

    // Constructor of the class
    public Usuario() {
    }

    // Constructor with parameters to initialize the user details
    public Usuario(String nombreCompleto, String cedula, int telefono, String direccion, String estado, String rol) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.rol = rol;
        this.cita = new Cita(); // Default appointment
        this.reservacion = new Reservacion(); // Default reservation
    }

    // Getter and Setter for full name
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Getter and Setter for user's ID
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Getter and Setter for user's phone number
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Getter and Setter for user's address
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter and Setter for user's status
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Getter and Setter for user's role
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Getter and Setter for user's appointment (Cita)
    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    // Getter and Setter for user's reservation (Reservacion)
    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    // Overridden toString method to represent the user details as a string
    @Override
    public String toString() {
        return "Usuario {" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", cedula=" + cedula +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", estado='" + estado + '\'' +
                ", rol='" + rol + '\'' +
                ", cita=" + cita +
                ", reservacion=" + reservacion +
                '}';
    }
}

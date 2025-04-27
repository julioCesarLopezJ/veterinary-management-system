package CapaLogica;

public class Cliente {
    private String nombreCompleto;  // Full name of the client
    private int cedula;             // ID number of the client
    private int telefono;           // Phone number of the client
    private String direccion;       // Address of the client
    private String correo;          // Email address of the client
    private Mascota mascota;        // The pet associated with the client

    // Default constructor
    public Cliente() {
    }

    // Constructor with parameters to initialize the client's details
    public Cliente(String nombreCompleto, int cedula, int telefono, String direccion, String correo) {
        this.nombreCompleto = nombreCompleto;  // Set the full name of the client
        this.cedula = cedula;                  // Set the ID number of the client
        this.telefono = telefono;              // Set the phone number of the client
        this.direccion = direccion;            // Set the address of the client
        this.correo = correo;                  // Set the email address of the client
        this.mascota = new Mascota();          // Initialize an empty pet (Mascota)
    }

    // Getter and Setter methods for the class attributes

    public String getNombreCompleto() {
        return nombreCompleto;  // Return the full name of the client
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;  // Set the full name of the client
    }

    public int getCedula() {
        return cedula;  // Return the client's ID number
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;  // Set the client's ID number
    }

    public int getTelefono() {
        return telefono;  // Return the client's phone number
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;  // Set the client's phone number
    }

    public String getDireccion() {
        return direccion;  // Return the client's address
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;  // Set the client's address
    }

    public String getCorreo() {
        return correo;  // Return the client's email address
    }

    public void setCorreo(String correo) {
        this.correo = correo;  // Set the client's email address
    }

    public Mascota getMascota() {
        return mascota;  // Return the pet associated with the client
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;  // Set the pet associated with the client
    }

    // Override the toString() method to display the client's details
    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", cedula=" + cedula +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", mascota=" + mascota +
                '}';  // Format the client details as a string
    }
}

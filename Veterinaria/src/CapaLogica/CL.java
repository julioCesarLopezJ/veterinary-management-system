package CapaLogica;

// Class representing the logic layer of the system, responsible for managing
public class CL {

    // Arrays to store users, clients, pets, reservations, and appointments
    Usuario[] Usuarios = new Usuario[5];
    Cliente[] Clientes = new Cliente[5];
    Mascota[] Mascotas = new Mascota[5];
    Reservacion[] Reservaciones = new Reservacion[5];
    Cita[] Citas = new Cita[5];

    // Indices to control the number of records in the arrays
    int indiceUsuario = 0;
    int indiceCliente = 0;
    int indiceMascota = 0;
    int indiceReservacion = 0;
    int indiceCita = 0;

    // Method to register a new user
    // Returns 'false' if the user is already registered (by their ID), otherwise 'true'
    public boolean RegistrarUsuario(Usuario usuario) {
        if (BuscarUsuario(usuario.getCedula()) != null) {
            return false; // The ID is already registered
        }

        boolean resultado = false;
        if (indiceUsuario < Usuarios.length) {
            Usuarios[indiceUsuario] = usuario;  // Save the new user in the array
            indiceUsuario++;                    // Increment the index
            resultado = true;                    // Successful registration
        }
        return resultado; // Return the result of the operation
    }

    // Method to search for a user by their ID
    // Returns the user if found, or 'null' if not found
    public Usuario BuscarUsuario(String cedula) {
        for (Usuario usuario : Usuarios) {
            if (usuario != null && usuario.getCedula().equals(cedula)) {
                return usuario; // User found
            }
        }
        return null; // If not found, return null
    }

    // Method to register a new client
    // Returns 'false' if the client is already registered (by their ID), otherwise 'true'
    public boolean RegistrarCliente(Cliente cliente) {
        if (BuscarCliente(cliente.getCedula()) != null) {
            return false; // The ID is already registered
        }

        boolean resultado = false;
        if (indiceCliente < Clientes.length) {
            Clientes[indiceCliente] = cliente;  // Save the new client in the array
            indiceCliente++;                    // Increment the index
            resultado = true;                    // Successful registration
        }
        return resultado; // Return the result of the operation
    }

    // Method to search for a client by their ID
    // Returns the client if found, or 'null' if not found
    public Cliente BuscarCliente(int cedula) {
        for (Cliente cliente : Clientes) {
            if (cliente != null && cliente.getCedula() == cedula) {
                return cliente; // Client found
            }
        }
        return null; // If not found, return null
    }

    // Method to register a new pet
    // Returns 'false' if the pet is already registered, otherwise 'true'
    public boolean RegistrarMascota(Mascota mascota) {
        if (BuscarMascota(mascota.getNombreMascota()) != null) {
            return false; // The pet is already registered
        }

        boolean resultado = false;
        if (indiceMascota < Mascotas.length) {
            Mascotas[indiceMascota] = mascota;  // Save the new pet in the array
            indiceMascota++;                    // Increment the index
            resultado = true;                    // Successful registration
        }
        return resultado; // Return the result of the operation
    }

    // Method to search for a pet by its name
    // Returns the pet if found, or 'null' if not found
    public Mascota BuscarMascota(String nombre) {
        for (Mascota mascota : Mascotas) {
            if (mascota != null && mascota.getNombreMascota().equals(nombre)) {
                return mascota; // Pet found
            }
        }
        return null; // If not found, return null
    }

    // Method to get all registered clients
    public Cliente[] VerClientesRegistrados() {
        return Clientes; // Return the array of clients
    }

    // Method to register a new reservation at the hotel
    // Returns 'true' if the reservation was successful, otherwise 'false'
    public boolean Reservacion(Reservacion reservacion) {
        boolean resultado = false;
        if (indiceReservacion < Reservaciones.length) {
            Reservaciones[indiceReservacion] = reservacion;  // Save the new reservation
            indiceReservacion++;                               // Increment the index
            resultado = true;                                   // Successful registration
        }
        return resultado; // Return the result of the operation
    }

    // Method to register a new appointment
    // Returns 'true' if the appointment was successfully registered, otherwise 'false'
    public boolean RegistrarCitas(Cita cita) {
        boolean resultado = false;
        if (indiceCita < Citas.length) {
            Citas[indiceCita] = cita;  // Save the new appointment in the array
            indiceCita++;              // Increment the index
            resultado = true;           // Successful registration
        }
        return resultado; // Return the result of the operation
    }
}

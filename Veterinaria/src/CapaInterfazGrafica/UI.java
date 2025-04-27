package CapaInterfazGrafica;

import Controladores.ControladorUsuarios;
import CapaLogica.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalTime;

/*
Main User Interface for the Veterinary System
Handles user registration, login, and client management functionalities.
 */

public class UI {

    static PrintStream out = System.out;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static ControladorUsuarios controlador = new ControladorUsuarios();
    static CL cl = new CL();

    public static void main(String[] args) throws IOException {
        int opcion = 0;

        do {
            mostrarMenuPrincipal();
            opcion = seleccionarMenuPrincipal();
            procesarMenuPrincipal(opcion);
        } while (opcion != 0);
    }

    // Displays the main menu
    public static void mostrarMenuPrincipal() {
        out.println("1. Register User");
        out.println("2. Login");
        out.println("0. Exit");
    }

    // Selects an option from the main menu
    public static int seleccionarMenuPrincipal() throws IOException {
        out.print("Select an option: ");
        return Integer.parseInt(in.readLine());
    }

    // Processes the selected option from the main menu
    public static void procesarMenuPrincipal(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                registrarUsuario();
                break;
            case 2:
                iniciarSesion();
                break;
            case 0:
                out.println("Exiting system...");
                break;
            default:
                out.println("Invalid option");
                break;
        }
    }

    // Registers a new user
    public static void registrarUsuario() throws IOException {
        out.print("Enter user's full name: ");
        String nombreCompleto = in.readLine();
        out.print("Enter user's ID: ");
        String cedula = in.readLine();
        out.print("Enter user's phone number: ");
        int telefono = Integer.parseInt(in.readLine());
        out.print("Enter user's address: ");
        String direccion = in.readLine();
        out.print("Enter user's status: ");
        String estado = in.readLine();
        out.print("Enter user's role: ");
        String rol = in.readLine();

        Usuario usuario = new Usuario(nombreCompleto, cedula, telefono, direccion, estado, rol);
        if (controlador.registrarUsuario(usuario)) {
            out.println("User registered successfully.");
            out.println(usuario.toString());
        } else {
            out.println("ID already registered.");
        }
    }

    // Logs a user into the system
    public static void iniciarSesion() throws IOException {
        String cedula;
        while (true) {
            try {
                out.print("Enter ID to login: ");
                cedula = in.readLine();
                break;
            } catch (NumberFormatException e) {
                out.println("Error: ID must be a number. Try again.");
            }
        }
        Usuario usuario = controlador.iniciarSesion(cedula);

        if (usuario != null) {
            out.println("Login successful.");
            out.println("User Full Name: " + usuario.getNombreCompleto());
            mostrarMenuOpciones();
        } else {
            out.println("ID not registered.");
        }
    }

    // Displays the menu after login
    public static void mostrarMenuOpciones() throws IOException {
        int opcion = 0;
        do {
            out.println("Welcome to Moka Veterinary System. What would you like to do?");
            out.println("1. Register Client");
            out.println("2. Select Client");
            out.println("3. View Registered Clients");
            out.println("4. Register Appointment");
            out.println("5. Make Hotel Reservation");
            out.println("0. Exit");

            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    public static int seleccionarOpcion() throws IOException {
        out.print("Select an option: ");
        return Integer.parseInt(in.readLine());
    }

    public static void procesarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                seleccionarCliente();
                break;
            case 3:
                verClientesRegistrados();
                break;
            case 4:
                registrarCita();
                break;
            case 5:
                reservacionHotel();
                break;
            case 0:
                out.println("Exiting system...");
                break;
            default:
                out.println("Invalid option");
                break;
        }
    }

    // Registers a new client
    public static void registrarCliente() throws IOException {
        out.print("Enter client's full name: ");
        String nombreCompleto = in.readLine();
        out.print("Enter client's ID: ");
        int cedula = Integer.parseInt(in.readLine());
        out.print("Enter client's phone number: ");
        int telefono = Integer.parseInt(in.readLine());
        out.print("Enter client's address: ");
        String direccion = in.readLine();
        out.print("Enter client's email: ");
        String correo = in.readLine();

        Cliente cliente = new Cliente(nombreCompleto, cedula, telefono, direccion, correo);

        if (cl.RegistrarCliente(cliente)) {
            out.println("Client registered successfully.");
            out.println(cliente.toString());
        } else {
            out.println("ID already registered. Try another one.");
        }
    }

    // Selects a client by ID
    public static void seleccionarCliente() throws IOException {
        int cedula = 0;
        while (true) {
            try {
                out.print("Enter client ID: ");
                cedula = Integer.parseInt(in.readLine());
                break;
            } catch (NumberFormatException e) {
                out.println("Client not registered. Try again.");
            }
        }
        Cliente cliente = cl.BuscarCliente(cedula);

        if (cliente != null) {
            out.println("Login successful.");
            out.println("Now you can register pets, manage appointments, and book hotel stays for client: " + cliente.getNombreCompleto());
            mostrarMenuCliente();
        } else {
            out.println("ID not registered.");
        }
    }

    // Displays the client-specific menu
    public static void mostrarMenuCliente() throws IOException {
        int opcion = 0;
        do {
            out.println("What would you like to do?");
            out.println("1. Register Pet");
            out.println("2. Make Hotel Reservation");
            out.println("3. Register Appointment");
            out.println("0. Exit");

            opcion = seleccionarMenuCliente();
            procesarMenuCliente(opcion);
        } while (opcion != 0);
    }

    public static int seleccionarMenuCliente() throws IOException {
        out.print("Select an option: ");
        return Integer.parseInt(in.readLine());
    }

    public static void procesarMenuCliente(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                registrarMascota();
                break;
            case 2:
                reservacionHotel();
                break;
            case 3:
                registrarCita();
                break;
            case 0:
                out.println("Exiting system...");
                break;
            default:
                out.println("Invalid option");
                break;
        }
    }

    // Registers a new pet
    public static void registrarMascota() throws IOException {
        out.print("Enter pet's name: ");
        String nombreMascota = in.readLine();
        out.print("Enter pet's photo: ");
        String foto = in.readLine();
        out.print("Add observations: ");
        String observaciones = in.readLine();
        out.print("Enter pet ranking: ");
        int ranking = Integer.parseInt(in.readLine());

        Mascota mascota = new Mascota(nombreMascota, foto, observaciones, ranking);

        if (cl.RegistrarMascota(mascota)) {
            out.println("Pet registered successfully.");
            out.println(mascota);
        } else {
            out.println("Pet already registered. Try another name.");
        }
    }

    // Makes a hotel reservation for a pet
    private static void reservacionHotel() throws IOException {
        out.print("Enter owner's ID: ");
        int cedula = Integer.parseInt(in.readLine());

        Cliente cliente = cl.BuscarCliente(cedula);
        if (cliente == null) {
            out.println("Client not registered. Please register the client first.");
            return;
        }

        out.print("Enter pet's name: ");
        String nombreMascota = in.readLine();
        out.print("Enter check-in date (YYYY-MM-DD): ");
        LocalDate fechaEntrada = LocalDate.parse(in.readLine());
        out.print("Enter check-out date (YYYY-MM-DD): ");
        LocalDate fechaSalida = LocalDate.parse(in.readLine());
        out.print("Enter reservation time (HH:mm): ");
        LocalTime horaReservacion = LocalTime.parse(in.readLine());
        out.print("Add observations: ");
        String observacion = in.readLine();

        Reservacion reservacion = new Reservacion(fechaEntrada, fechaSalida, horaReservacion, observacion);

        if (cl.Reservacion(reservacion)) {
            out.println("Reservation successful for pet '" + nombreMascota + "'.");
        } else {
            out.println("Could not complete reservation.");
        }
    }

    // Registers a new appointment
    private static void registrarCita() throws IOException {
        out.print("Enter owner's ID: ");
        int cedula = Integer.parseInt(in.readLine());

        Cliente cliente = cl.BuscarCliente(cedula);
        if (cliente == null) {
            out.println("Client not registered. Please register the client first.");
            return;
        }

        out.print("Enter pet's name: ");
        String nombreMascota = in.readLine();
        out.print("Enter appointment date (YYYY-MM-DD): ");
        LocalDate fechaEntrada = LocalDate.parse(in.readLine());
        out.print("Enter appointment time (HH:mm): ");
        LocalTime horaCita = LocalTime.parse(in.readLine());
        out.print("Add observations: ");
        String observaciones = in.readLine();

        Cita cita = new Cita(fechaEntrada, horaCita, observaciones, nombreMascota);

        if (cl.RegistrarCitas(cita)) {
            out.println("Appointment registered successfully for pet '" + nombreMascota + "'.");
        } else {
            out.println("Could not register appointment.");
        }
    }

    // Displays all registered clients
    public static void verClientesRegistrados() throws IOException {
        Cliente[] clientes = UI.cl.VerClientesRegistrados();
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println(cliente.toString());
            }
        }
    }
}

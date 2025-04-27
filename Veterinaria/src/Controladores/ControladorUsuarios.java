package Controladores;

import CapaLogica.Usuario;

import java.util.HashMap;
import java.util.Map;

public class ControladorUsuarios {
    // Map to store registered users, where the key is the user's ID (cedula)
    private Map<String, Usuario> usuariosRegistrados = new HashMap<>();

    // Register a new user
    public boolean registrarUsuario(Usuario usuario) {
        // Check if the user is already registered by their ID (cedula)
        if (usuariosRegistrados.containsKey(usuario.getCedula())) {
            return false; // User already registered
        }
        // Add the user to the map
        usuariosRegistrados.put(usuario.getCedula(), usuario);
        return true; // Registration successful
    }

    // Log in by the user's ID (cedula)
    public Usuario iniciarSesion(String cedula) {
        // Return the user object if found, otherwise return null
        return usuariosRegistrados.get(cedula);
    }
}

package com.taller.tallermecanico.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Gestiona las conexiones a la base de datos para el sistema de taller mecánico.
 * Esta clase utilitaria proporciona una forma centralizada de obtener conexiones a la base de datos
 * usando JDBC con MySQL. Utiliza un patrón similar a singleton para la gestión de conexiones.
 * 
 * @author rafaelvales
 */
public class Conexion {

    /** La URL JDBC para la conexión a la base de datos MySQL. */
    private static final String URL = "jdbc:mysql://localhost:3306/TallerDb";
    
    /** El nombre de usuario de la base de datos. */
    private static final String USER = "root";
    
    /** La contraseña de la base de datos. */
    private static final String PASSWORD = "123456789";

    /**
     * Establece y devuelve una conexión a la base de datos MySQL.
     * Si la conexión falla, se imprime un mensaje de error y se devuelve null.
     *
     * @return un objeto Connection si tiene éxito, null si la conexión falla
     */
    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Conexión exitosa a la base de datos");
            return conn;
        } catch (SQLException e) {
            System.out.println(" Error al conectar: " + e.getMessage());
            return null;
        }
    }
}
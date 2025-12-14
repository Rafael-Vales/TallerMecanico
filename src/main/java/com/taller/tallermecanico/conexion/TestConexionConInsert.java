package com.taller.tallermecanico.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase de prueba para verificar la conectividad de la base de datos y las operaciones de inserción.
 * Esta clase demuestra cómo establecer una conexión y realizar
 * una operación de inserción de prueba en la tabla clientes.
 * 
 * @author rafaelvales
 */
public class TestConexionConInsert {

    /**
     * Método principal que prueba la conexión a la base de datos e inserta un registro de cliente de prueba.
     * Este método establece una conexión, inserta un cliente de ejemplo y maneja
     * cualquier excepción SQL que pueda ocurrir.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Connection conn = Conexion.getConnection();

        if (conn != null) {
            String sql = "INSERT INTO clientes (nombre, telefono, vehiculo) VALUES (?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, "Cliente Test");
                stmt.setString(2, "123456789");
                stmt.setString(3, "Peugeot 208");

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Cliente de prueba insertado correctamente.");
                }
            } catch (SQLException e) {
                System.out.println(" Error al insertar cliente:");
                e.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(" Error al cerrar conexión:");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println(" No se pudo obtener la conexión.");
        }
    }
}
package com.taller.tallermecanico;

import com.taller.tallermecanico.conexion.Conexion;
import com.taller.tallermecanico.view.MainView; 
import java.sql.Connection;

/**
 * Punto de entrada principal para el Sistema de Gestión de Taller Mecánico.
 * Esta clase inicializa la conexión a la base de datos y lanza la interfaz gráfica
 * de usuario principal. Si la conexión a la base de datos falla, la aplicación no se iniciará.
 * 
 * @author rafaelvales
 */
public class TallerMecanico {

    /**
     * Método principal que inicia la aplicación.
     * Establece una conexión a la base de datos y lanza la ventana de vista principal.
     * Si no se puede establecer la conexión, la aplicación sale con un mensaje de error.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Connection conn = Conexion.getConnection();

        if (conn != null) {
            System.out.println("Todo listo para iniciar el sistema...");

    
            java.awt.EventQueue.invokeLater(() -> {
                new MainView().setVisible(true);
            });

        } else {
            System.out.println("No se pudo conectar a la base de datos. Cerrando...");
        }
    }
}
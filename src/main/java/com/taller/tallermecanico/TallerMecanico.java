package com.taller.tallermecanico;

import com.taller.tallermecanico.conexion.Conexion;
import com.taller.tallermecanico.view.MainView; 
import java.sql.Connection;

public class TallerMecanico {

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
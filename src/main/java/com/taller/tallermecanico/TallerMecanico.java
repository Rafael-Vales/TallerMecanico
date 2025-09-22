package com.taller.tallermecanico;

import com.taller.tallermecanico.conexion.Conexion;
import java.sql.Connection;

public class TallerMecanico {

    public static void main(String[] args) {
        Connection conn = Conexion.obtenerConexion();
        if (conn != null) {
            
            System.out.println("Todo listo para iniciar el sistema...");
        } else {
            System.out.println("No se pudo conectar a la base de datos. Cerrando...");
        }
    }
}
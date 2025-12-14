package com.taller.tallermecanico.dao;

import com.taller.tallermecanico.model.Mecanico;
import com.taller.tallermecanico.conexion.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Objeto de Acceso a Datos (DAO) para gestionar entidades de mecánico (Mecanico) en la base de datos.
 * Esta clase proporciona métodos para operaciones CRUD en registros de mecánicos, incluyendo
 * guardar, listar, actualizar, eliminar y recuperar mecánicos por ID.
 * 
 * @author rafaelvales
 */
public class MecanicoDao {

    /**
     * Guarda un nuevo mecánico en la base de datos.
     *
     * @param m el objeto mecánico a guardar
     * @return true si el mecánico se guardó exitosamente, false en caso contrario
     */
    public boolean guardarMecanico(Mecanico m) {
        String sql = "INSERT INTO mecanico (nombre, dni, especialidad, sueldo) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, m.getNombre());
            stmt.setInt(2, m.getDni());
            stmt.setString(3, m.getEspecialidad());
            stmt.setDouble(4, m.getSueldo());

            stmt.executeUpdate();
            System.out.println(" Mecanico guardado con éxito.");
            return true;

        } catch (SQLException e) {
            System.out.println(" Error al guardar mecanico: " + e.getMessage());
            return false;
        }
    }

    /**
     * Recupera todos los mecánicos de la base de datos, ordenados por nombre en orden ascendente.
     *
     * @return una lista de todos los mecánicos en la base de datos
     */
    public List<Mecanico> listarMecanicos() {
        List<Mecanico> lista = new ArrayList<>();
        String sql = "SELECT * FROM mecanico ORDER BY nombre ASC";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Mecanico m = new Mecanico();
                m.setId(rs.getInt("id"));
                m.setNombre(rs.getString("nombre"));
                m.setDni(rs.getInt("dni"));
                m.setEspecialidad(rs.getString("especialidad"));
                m.setSueldo(rs.getDouble("sueldo"));
                lista.add(m);
            }

        } catch (SQLException e) {
            System.out.println(" Error al listar mecanicos: " + e.getMessage());
        }

        return lista;
    }

    /**
     * Elimina un mecánico de la base de datos por su ID.
     *
     * @param id el identificador único del mecánico a eliminar
     * @return true si el mecánico se eliminó exitosamente, false en caso contrario
     */
    public boolean eliminarMecanico(int id) {
        String sql = "DELETE FROM mecanico WHERE id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("🗑️ Mecanico eliminado con éxito.");
            return true;

        } catch (SQLException e) {
            System.out.println(" Error al eliminar mecanico: " + e.getMessage());
            return false;
        }
    }

    /**
     * Actualiza un mecánico existente en la base de datos.
     *
     * @param m el objeto mecánico con información actualizada
     * @return true si el mecánico se actualizó exitosamente, false en caso contrario
     */
    public boolean actualizarMecanico(Mecanico m) {
        String sql = "UPDATE mecanico SET nombre = ?, dni = ?, especialidad = ?, sueldo = ? WHERE id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, m.getNombre());
            stmt.setInt(2, m.getDni());
            stmt.setString(3, m.getEspecialidad());
            stmt.setDouble(4, m.getSueldo());
            stmt.setInt(5, m.getId());

            stmt.executeUpdate();
            System.out.println(" Mecanico actualizado con éxito.");
            return true;

        } catch (SQLException e) {
            System.out.println(" Error al actualizar mecanico: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Recupera un mecánico de la base de datos por su ID.
     *
     * @param id el identificador único del mecánico a recuperar
     * @return el objeto mecánico si se encuentra, null en caso contrario
     */
    public Mecanico obtenerMecanicoPorId(int id) {
    Mecanico mecanico = null;
    String sql = "SELECT * FROM mecanico WHERE id = ?";

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            mecanico = new Mecanico();
            mecanico.setId(rs.getInt("id"));
            mecanico.setNombre(rs.getString("nombre"));
            mecanico.setDni(rs.getInt("dni"));
            mecanico.setEspecialidad(rs.getString("especialidad"));
            mecanico.setSueldo(rs.getDouble("sueldo"));
        }

    } catch (SQLException e) {
        System.out.println(" Error al obtener mecánico por ID: " + e.getMessage());
    }

    return mecanico;
}
    
}
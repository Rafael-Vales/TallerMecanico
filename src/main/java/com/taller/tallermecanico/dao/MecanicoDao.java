package com.taller.tallermecanico.dao;

import com.taller.tallermecanico.model.Mecanico;
import com.taller.tallermecanico.conexion.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MecanicoDao {

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
            System.out.println("✏️ Mecanico actualizado con éxito.");
            return true;

        } catch (SQLException e) {
            System.out.println(" Error al actualizar mecanico: " + e.getMessage());
            return false;
        }
    }
    
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
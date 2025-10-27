package com.taller.tallermecanico.dao;

import com.taller.tallermecanico.model.Cliente;
import com.taller.tallermecanico.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    public static boolean guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (nombre, telefono, vehiculo) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getTelefono());
            stmt.setString(3, cliente.getVehiculo());

            stmt.executeUpdate();
            System.out.println(" Cliente guardado exitosamente.");
            return true;

        } catch (SQLException e) {
            System.out.println(" Error al guardar cliente: " + e.getMessage());
            return false;
        }
        
        
    }
    
    public List<Cliente> listarClientes() {
    List<Cliente> clientes = new ArrayList<>();
    String sql = "SELECT * FROM cliente ORDER BY nombre ASC";

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setTelefono(rs.getString("telefono"));
            cliente.setVehiculo(rs.getString("vehiculo"));

            clientes.add(cliente);
        }

        System.out.println(" Lista de clientes obtenida.");
    } catch (SQLException e) {
        System.out.println(" Error al listar clientes: " + e.getMessage());
    }

    return clientes;
}
    
    public boolean eliminarCliente(int id) {
    String sql = "DELETE FROM cliente WHERE id = ?";

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);
        int filasAfectadas = stmt.executeUpdate();

        return filasAfectadas > 0;

    } catch (SQLException e) {
        System.out.println("Error al eliminar cliente: " + e.getMessage());
        return false;
    }
}
    
    public boolean actualizarCliente(Cliente cliente) {
    String sql = "UPDATE cliente SET nombre = ?, telefono = ?, vehiculo = ? WHERE id = ?";
    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, cliente.getNombre());
        stmt.setString(2, cliente.getTelefono());
        stmt.setString(3, cliente.getVehiculo());
        stmt.setInt(4, cliente.getId());

        stmt.executeUpdate();
        return true;
    } catch (SQLException e) {
        System.out.println(" Error al actualizar cliente: " + e.getMessage());
        return false;
    }
}
}

package com.taller.tallermecanico.dao;

import com.taller.tallermecanico.model.Odt;
import com.taller.tallermecanico.model.Cliente;
import com.taller.tallermecanico.model.Mecanico;
import com.taller.tallermecanico.conexion.Conexion;
import com.taller.tallermecanico.dao.OdtDao;
import com.taller.tallermecanico.model.Odt;
import javax.swing.table.DefaultTableModel;
import java.util.List;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Objeto de Acceso a Datos (DAO) para gestionar órdenes de trabajo (ODT) en la base de datos.
 * Esta clase proporciona métodos para operaciones CRUD en registros de órdenes de trabajo, incluyendo
 * guardar, listar, actualizar, eliminar y recuperar órdenes de trabajo por ID.
 * Las órdenes de trabajo están vinculadas tanto a clientes como a mecánicos a través de relaciones de clave foránea.
 * 
 * @author rafaelvales
 */
public class OdtDao {

    /**
     * Guarda una nueva orden de trabajo en la base de datos.
     *
     * @param o el objeto orden de trabajo a guardar
     * @return true si la orden de trabajo se guardó exitosamente, false en caso contrario
     */
    public boolean guardarOdt(Odt o) {
String sql = "INSERT INTO odt (cliente_id, mecanico_id, descripcion, estado, fecha_ingreso, fecha_entrega, costo_total) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, o.getCliente().getId());
            stmt.setInt(2, o.getMecanico().getId());
            stmt.setString(3, o.getDescripcion());
            stmt.setString(4, o.getEstado());
            stmt.setDate(5, Date.valueOf(o.getFechaIngreso()));
            stmt.setDate(6, Date.valueOf(o.getFechaEntrega()));
            stmt.setDouble(7, o.getCostoTotal());

            stmt.executeUpdate();
            System.out.println(" ODT guardada con éxito.");
            return true;

        } catch (SQLException e) {
            System.out.println(" Error al guardar ODT: " + e.getMessage());
            return false;
        }
    }

    /**
     * Recupera todas las órdenes de trabajo de la base de datos con su información de cliente y mecánico asociada.
     * Los resultados se ordenan por ID de orden de trabajo en orden descendente (más recientes primero).
     *
     * @return una lista de todas las órdenes de trabajo en la base de datos
     */
    public List<Odt> listarOdts() {
        List<Odt> lista = new ArrayList<>();
        String sql = """
            SELECT o.id, o.descripcion, o.estado, o.fecha_ingreso, o.fecha_entrega, o.costo_total,
                   c.id as cliente_id, c.nombre as cliente_nombre,
                   m.id as mecanico_id, m.nombre as mecanico_nombre
            FROM odt o
            JOIN cliente c ON o.cliente_id = c.id
            JOIN mecanico m ON o.mecanico_id = m.id
            ORDER BY o.id DESC
            """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("cliente_id"));
                cliente.setNombre(rs.getString("cliente_nombre"));

                Mecanico mecanico = new Mecanico();
                mecanico.setId(rs.getInt("mecanico_id"));
                mecanico.setNombre(rs.getString("mecanico_nombre"));

                Odt o = new Odt();
                o.setId(rs.getInt("id"));
                o.setCliente(cliente);
                o.setMecanico(mecanico);
                o.setDescripcion(rs.getString("descripcion"));
                o.setEstado(rs.getString("estado"));
                o.setFechaIngreso(rs.getDate("fecha_ingreso").toLocalDate());
                o.setFechaEntrega(rs.getDate("fecha_entrega").toLocalDate());
                o.setCostoTotal(rs.getDouble("costo_total"));

                lista.add(o);
            }

        } catch (SQLException e) {
            System.out.println(" Error al listar ODTs: " + e.getMessage());
        }

        return lista;
    }

    /**
     * Elimina una orden de trabajo de la base de datos por su ID.
     *
     * @param id el identificador único de la orden de trabajo a eliminar
     * @return true si la orden de trabajo se eliminó exitosamente, false en caso contrario
     */
    public boolean eliminarOdt(int id) {
        String sql = "DELETE FROM odt WHERE id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("ODT eliminada con éxito.");
            return true;

        } catch (SQLException e) {
            System.out.println(" Error al eliminar ODT: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Recupera una orden de trabajo de la base de datos por su ID, incluyendo información de cliente y mecánico asociada.
     *
     * @param id el identificador único de la orden de trabajo a recuperar
     * @return el objeto orden de trabajo si se encuentra, null en caso contrario
     */
    public Odt buscarOdtPorId(int id) {
    String sql = """
        SELECT o.id, o.descripcion, o.estado, o.fecha_ingreso, o.fecha_entrega, o.costo_total,
               c.id as cliente_id, c.nombre as cliente_nombre,
               m.id as mecanico_id, m.nombre as mecanico_nombre
        FROM odt o
        JOIN cliente c ON o.cliente_id = c.id
        JOIN mecanico m ON o.mecanico_id = m.id
        WHERE o.id = ?
    """;

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("cliente_id"));
            cliente.setNombre(rs.getString("cliente_nombre"));

            Mecanico mecanico = new Mecanico();
            mecanico.setId(rs.getInt("mecanico_id"));
            mecanico.setNombre(rs.getString("mecanico_nombre"));

            Odt o = new Odt();
            o.setId(rs.getInt("id"));
            o.setCliente(cliente);
            o.setMecanico(mecanico);
            o.setDescripcion(rs.getString("descripcion"));
            o.setEstado(rs.getString("estado"));
            o.setFechaIngreso(rs.getDate("fecha_ingreso").toLocalDate());
            o.setFechaEntrega(rs.getDate("fecha_entrega").toLocalDate());
            o.setCostoTotal(rs.getDouble("costo_total"));

            return o;
        }

    } catch (SQLException e) {
        System.out.println("Error al buscar ODT por ID: " + e.getMessage());
    }

    return null;
}
    
    /**
     * Actualiza una orden de trabajo existente en la base de datos.
     *
     * @param o el objeto orden de trabajo con información actualizada
     * @return true si la orden de trabajo se actualizó exitosamente, false en caso contrario
     */
    public boolean actualizarOdt(Odt o) {
    String sql = """
        UPDATE odt SET cliente_id = ?, mecanico_id = ?, descripcion = ?, estado = ?, 
                       fecha_ingreso = ?, fecha_entrega = ?, costo_total = ?
        WHERE id = ?
        """;

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, o.getCliente().getId());
        stmt.setInt(2, o.getMecanico().getId());
        stmt.setString(3, o.getDescripcion());
        stmt.setString(4, o.getEstado());
        stmt.setDate(5, java.sql.Date.valueOf(o.getFechaIngreso()));
        stmt.setDate(6, java.sql.Date.valueOf(o.getFechaEntrega()));
        stmt.setDouble(7, o.getCostoTotal());
        stmt.setInt(8, o.getId());

        stmt.executeUpdate();
        return true;

    } catch (SQLException e) {
        System.out.println("Error al actualizar ODT: " + e.getMessage());
        return false;
    }
}
}
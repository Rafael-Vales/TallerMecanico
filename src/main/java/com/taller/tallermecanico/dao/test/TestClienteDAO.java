package com.taller.tallermecanico.dao.test;

import com.taller.tallermecanico.dao.ClienteDao;
import com.taller.tallermecanico.dao.ClienteDao;
import com.taller.tallermecanico.model.Cliente;

/**
 * Clase de prueba para verificar la funcionalidad de guardado de ClienteDao.
 * Esta clase crea un cliente de ejemplo e intenta guardarlo en la base de datos.
 * 
 * @author rafaelvales
 */
public class TestClienteDAO {

    /**
     * Método principal que prueba el guardado de un cliente en la base de datos.
     * Crea un cliente de prueba con datos de ejemplo y usa ClienteDao para persistirlo.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(0, "Juan Pérez", "2234567890", "Ford Fiesta");
        ClienteDao dao = new ClienteDao();

        dao.guardarCliente(cliente);
    }
}
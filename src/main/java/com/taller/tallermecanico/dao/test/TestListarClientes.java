package com.taller.tallermecanico.dao.test;

import com.taller.tallermecanico.dao.ClienteDao;
import com.taller.tallermecanico.model.Cliente;

import java.util.List;

/**
 * Clase de prueba para verificar la funcionalidad de listado de ClienteDao.
 * Esta clase recupera todos los clientes de la base de datos y los imprime en la consola.
 * 
 * @author rafaelvales
 */
public class TestListarClientes {

    /**
     * Método principal que prueba el listado de todos los clientes de la base de datos.
     * Recupera todos los clientes usando ClienteDao e imprime la información de cada cliente.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();
        List<Cliente> clientes = dao.listarClientes();

        for (Cliente c : clientes) {
            System.out.println(c); 
    }
    }
}
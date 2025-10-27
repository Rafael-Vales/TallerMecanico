package com.taller.tallermecanico.dao.test;

import com.taller.tallermecanico.dao.ClienteDao;
import com.taller.tallermecanico.dao.ClienteDao;
import com.taller.tallermecanico.model.Cliente;

public class TestClienteDAO {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(0, "Juan Pérez", "2234567890", "Ford Fiesta");
        ClienteDao dao = new ClienteDao();

        dao.guardarCliente(cliente);
    }
}
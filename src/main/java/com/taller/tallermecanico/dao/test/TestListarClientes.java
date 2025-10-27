package com.taller.tallermecanico.dao.test;

import com.taller.tallermecanico.dao.ClienteDao;
import com.taller.tallermecanico.model.Cliente;

import java.util.List;

public class TestListarClientes {

    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();
        List<Cliente> clientes = dao.listarClientes();

        for (Cliente c : clientes) {
            System.out.println(c); 
    }
    }
}
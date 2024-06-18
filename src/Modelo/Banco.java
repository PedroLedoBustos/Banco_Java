package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Utilidades.Utilidades;

public class Banco {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    private Cliente crearCliente() {
        String nombre = Utilidades.leertring("Introduce el nombre del cliente: ");
        String apellido = Utilidades.leertring("Introduce el apellido del cliente: ");
        Integer dni = Utilidades.leerInteger("Introduce el dni del cliente: ");

        Cliente cliente = new Cliente(nombre, apellido, dni);
        return cliente;

    }

    private Cliente comprobarCliente(Cliente cliente) {
        for (Cliente clienteDentro : clientes) {
            if (clienteDentro.getDni().equals(cliente.getDni())) {
                return clienteDentro;
            }
        }
        return null;
    }

    public void altaCliente() {
        Cliente cliente = crearCliente();
        Cliente clienteDentro = comprobarCliente(cliente);

        if (clienteDentro != null) {
            System.out.println("El cliente no se puede dar de alta porque ya existe");
        } else {
            clientes.add(cliente);
            System.out.println("Cliente dado de alta correctamente");
        }
    }

    public void bajaCliente() {
        Cliente cliente = crearCliente();
        Cliente clienteDentro = comprobarCliente(cliente);

        if (clienteDentro == null) {
            System.out.println("El cliente no se puede dar de baja porque no existe");
        } else {
            clientes.remove(clienteDentro);
            System.out.println("Cliente dado de baja correctamente");
        }
    }

    public void listarClientes() {
        Collections.sort(clientes, new Comparator<Cliente>() {

            @Override
            public int compare(Cliente cliente1, Cliente cliente2) {
                return cliente2.cantidadTotal().compareTo(cliente1.cantidadTotal());
            }
        });

        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre() + " Apellido: " + cliente.getApellido() + " Dni: "
                    + cliente.getDni() + " Cantidad total: " + cliente.cantidadTotal());
        }

    }

    public void login() {
        String nombre = Utilidades.leertring("Nombre: ");
        String apellido = Utilidades.leertring("Apellido: ");
        Integer dni = Utilidades.leerInteger("DNI: ");

        Cliente cliente = new Cliente(nombre, apellido, dni);
        Cliente clienteDentro = comprobarCliente(cliente);

        if (clienteDentro == null) {
            System.out.println("Acceso denegado");
        } else {
            clienteDentro.menu();
        }

    }

}

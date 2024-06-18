package Modelo;

import java.util.ArrayList;

import Utilidades.Utilidades;

public class Cliente {
    private String nombre;
    private String apellido;
    private Integer dni;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public Cuenta comprobarCuenta(Cuenta Cuenta) {
        for (Cuenta cuentaDentro : cuentas) {
            if (cuentaDentro.getNumeroCuenta().equals(Cuenta.getNumeroCuenta()))
                return cuentaDentro;
        }
        return null;
    }

    public void eliminarCuenta(Cuenta cuenta) {
        cuentas.remove(cuenta);
    }

    public Float cantidadTotal() {
        float cantidadTotal = 0;
        for (Cuenta cuenta : cuentas) {
            cantidadTotal += cuenta.getCantidad();
        }
        return cantidadTotal;
    }

    public void menu() {
        Boolean salir = false;
        while (!salir) {
            System.out.println("###################################");
            System.out.println("############ MENU " + this.nombre + " " + this.apellido + " ###################");
            System.out.println("###################################");
            System.out.println("1 Alta cuenta");
            System.out.println("2 Baja cuenta");
            System.out.println("3 Ingresar dinero");
            System.out.println("4 Sacar dinero");
            System.out.println("5 Ver dinero cuenta");
            System.out.println("6 Ver dinero total");
            System.out.println("9 Salir");
            String opcion = Utilidades.leertring("Escoge una opción: ");

            switch (opcion) {
                case "1":
                    // altaCuenta()
                    break;
                case "2":
                    // bajaCuenta()
                    break;
                case "3":
                    // ingreso()
                    break;
                case "4":
                    // sacar()
                    break;
                case "5":
                    // verDineroCuenta()
                    break;
                case "6":
                    // verDineroTotal
                    break;
                case "9":
                    System.out.println("Saliendo...");
                    salir = true;

                    break;

                default:
                    System.out.println("Escoge una opción válida");
                    break;
            }
        }
    }

}

package Modelo;

public class Cuenta {
    private Integer numeroCuenta;
    private Cliente cliente;
    private float cantidad;

    public Cuenta(Integer numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        cantidad = 0;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void sacarDinero(Float cantidadSacar) {
        if (cantidadSacar > cantidad) {
            System.out.println("Lo siento no tienes fondos suficientes");
        } else {
            cantidad -= cantidadSacar;
            System.out.println("La cuenta con número: " + numeroCuenta + " ahora tiene: "
                    + cantidad);
        }
    }

    public void agregarDinero(Float cantidadMeter) {
        cantidad += cantidadMeter;
    }

}

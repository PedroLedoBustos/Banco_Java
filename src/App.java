import java.util.Scanner;

import Modelo.Banco;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Banco banco = new Banco();

    public static void main(String[] args) throws Exception {
        Boolean salir = false;
        while (!salir) {
            salir = menu();

        }
    }

    private static Boolean menu() {
        Boolean salir = false;

        System.out.println("##############################");
        System.out.println("##### MENU PRINCIPAL #########");
        System.out.println("##############################");
        System.out.println("1 Alta Cliente");
        System.out.println("2 Baja Cliente");
        System.out.println("3 Login");
        System.out.println("4 Listar clientes");
        System.out.println("9 Salir");

        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                banco.altaCliente();
                break;
            case "2":
                banco.bajaCliente();
                break;
            case "3":
                banco.login();
                break;
            case "4":
                banco.listarClientes();
                break;
            case "9":
                System.out.println("Saliendo...");
                salir = true;

                break;

            default:
                break;
        }
        return salir;

    }

}

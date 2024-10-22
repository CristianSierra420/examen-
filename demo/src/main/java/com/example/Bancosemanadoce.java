package com.example;

import java.util.Scanner;

public class Bancosemanadoce {

    static String[] nombres = {"Julian Echevarria", "María Estela"};
    static double[] saldos = {1500.00, 800.00};
    
    public static void mostrarMenu() {
        System.out.println("\n----- Menú -----");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Salir");
        System.out.println("----------------");
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int cuentaDeposito = seleccionarCuenta(scanner);
                    if (cuentaDeposito != -1) {
                        System.out.print("Ingrese la cantidad a depositar: ");
                        double cantidadDeposito = scanner.nextDouble();
                        depositar(cuentaDeposito, cantidadDeposito);
                    }
                    break;
                case 2:
                    int cuentaRetiro = seleccionarCuenta(scanner);
                    if (cuentaRetiro != -1) {
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double cantidadRetiro = scanner.nextDouble();
                        retirar(cuentaRetiro, cantidadRetiro);
                    }
                    break;
                case 3:
                    int cuentaConsulta = seleccionarCuenta(scanner);
                    if (cuentaConsulta != -1) {
                        consultarSaldo(cuentaConsulta);
                    }
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el Banco Simple!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
package com.example;

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
}
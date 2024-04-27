package ConversorDeMonedas.src.com.conversor.logic;

import java.util.Scanner;

import ConversorDeMonedas.src.com.conversor.models.Change;
import ConversorDeMonedas.src.com.conversor.models.CurrencyChange;
import ConversorDeMonedas.src.com.conversor.models.RequestChanges;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        RequestChanges r = new RequestChanges();
        System.out.println("*********************************************");
        System.out.println("\n1)Dolar a Peso Chileno");
        System.out.println("2)Peso Chileno a Dolar");
        System.out.println("3)Dolar a Peso Argentino");
        System.out.println("4)Peso Argentino a Dolar");
        System.out.println("5)Dolar a Euro");
        System.out.println("6)Euro a Dolar");
        System.out.println("0)salir");
        System.out.println("*********************************************");        

        int opcion = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese la cantidad: ");
        double cant = Double.valueOf(scan.nextLine());
        
        CurrencyChange cc;
        Change c;

        try {
            switch (opcion) {
                case 1:
                    cc = r.request("USD");
                    c = new Change(cc, "CLP", cant);
                    System.out.println(c.getConvert());
                    break;
                case 2:
                    cc = r.request("CLP");
                    c = new Change(cc, "USD", cant);
                    System.out.println(c.getConvert());
                    break;
                case 3:
                    cc = r.request("USD");
                    c = new Change(cc, "ARS", cant);
                    System.out.println(c.getConvert());
                    break;
                case 4:
                    cc = r.request("ARS");
                    c = new Change(cc, "USD", cant);
                    System.out.println(c.getConvert());
                    break;
                case 5:
                    cc = r.request("USD");
                    c = new Change(cc, "EUR", cant);
                    System.out.println(c.getConvert());
                    break;
                case 6:
                    cc = r.request("EUR");
                    c = new Change(cc, "USD", cant);
                    System.out.println(c.getConvert());
                    break;
                case 0:
                    System.out.println("Ha salido Correctamente del Programa");
                    break;
                default:
                    System.out.println("Ingrese una opción válida: ");
                    break;
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}

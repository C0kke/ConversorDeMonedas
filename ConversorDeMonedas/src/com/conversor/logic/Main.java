package ConversorDeMonedas.src.com.conversor.logic;

import java.util.Scanner;

import ConversorDeMonedas.src.com.conversor.models.Change;
import ConversorDeMonedas.src.com.conversor.models.CurrencyChange;
import ConversorDeMonedas.src.com.conversor.models.RequestChanges;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        RequestChanges r = new RequestChanges();
        
        CurrencyChange cc;
        Change c;
        int opcion = -1;
        double cant = 0;

        while (opcion != 0) {
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
                    case -1:
                        System.out.println("¡¡¡Bienvenido Al Conversor De Monedas!!!");
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

            
            System.out.println("\n*********************************************\n");
            System.out.println("1)Dolar a Peso Chileno");
            System.out.println("2)Peso Chileno a Dolar");
            System.out.println("3)Dolar a Peso Argentino");
            System.out.println("4)Peso Argentino a Dolar");
            System.out.println("5)Dolar a Euro");
            System.out.println("6)Euro a Dolar");
            System.out.println("0)salir");
            System.out.println("\n*********************************************\n");        

            opcion = Integer.valueOf(scan.nextLine());
            if (opcion != 0) {
                System.out.println("Ingrese la cantidad: ");
                cant = Double.valueOf(scan.nextLine());
            }
        }
        
        System.out.println("Ha salido Correctamente del Programa");
        scan.close();
    }
}

package ConversorDeMonedas.src.com.conversor.logic;

import java.util.Scanner;
import ConversorDeMonedas.src.com.conversor.models.CurrencyChange;
import ConversorDeMonedas.src.com.conversor.models.RequestChanges;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        RequestChanges r = new RequestChanges();
        System.out.println("Ingrese valor: ");

        try {
            String valor = scan.nextLine().toUpperCase();
            CurrencyChange c = r.request(valor);
            System.out.println(c);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}

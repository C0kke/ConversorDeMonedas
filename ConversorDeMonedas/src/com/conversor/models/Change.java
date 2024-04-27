package ConversorDeMonedas.src.com.conversor.models;

public class Change {
    private String primaryCurrency,convertCurrency;
    private double amount;
    private double result;

    public Change(CurrencyChange cc, String convertCurrency, double amount) {
        this.convertCurrency = convertCurrency.toUpperCase();
        this.primaryCurrency = cc.base_code(); 
        this.amount = amount;
        
        switch (convertCurrency) {
            case "USD":
                this.result = cc.conversion_rates().USD();
                break;
            case "CLP":
                this.result = cc.conversion_rates().CLP();
                break;
            case "ARS":
                this.result = cc.conversion_rates().ARS();
                break;
            case "EUR":
                this.result = cc.conversion_rates().EUR();
                break;
            default:
                System.out.println("Ingrese un valor válido");
                break;
        }
    }

    public String getConvert() {
        return "Conversión " + amount + " " + primaryCurrency + " - " + convertCurrency + " = " + result*amount;
    }
}

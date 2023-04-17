package com.mycompany.conversormonedas;

public class ConversorMonedas {

    public static void main(String[] args) {
        
        ApiGet conversor = new ApiGet();
        conversor.equibalencia("COP", "USD");
        double cambio = conversor.cambio(4500);
        System.out.println(cambio);
        
    }
}

package com.mycompany.conversormonedas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ApiGet {
    URL url;
    HttpURLConnection con;
    double valorMoneda;
    
    
    public void equibalencia(String moneda1, String moneda2){
        try {
            url = new URL("https://api.exchangerate.host/latest?base="+moneda1+"&&symbols="+moneda2);
            con = (HttpURLConnection)url.openConnection();
            
            con.setRequestMethod("GET");
            con.connect();
            
            int resCode = con.getResponseCode();
            if(resCode != 200){
                throw new RuntimeException("Ocurrio un error" + resCode);
            }else{
                StringBuilder infoStr = new StringBuilder();
                try (Scanner sc = new Scanner(url.openStream())) {
                    while(sc.hasNext()){
                        infoStr.append(sc.nextLine());
                    }
                }
                
//                System.out.println(infoStr);
//                System.out.println(url);
                String hola = infoStr.toString();
                JSONObject json2 = new JSONObject(hola);
                System.out.println("numero 2: "+json2);
                String objStr = json2.get("rates").toString();
                JSONObject moneda = new JSONObject(objStr);
                System.out.println(moneda);
                valorMoneda =  Double.parseDouble(moneda.get("USD").toString());
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public double cambio(double cantidad){
        double totalCambio = this.valorMoneda * cantidad;
        
        return totalCambio;
    }
}

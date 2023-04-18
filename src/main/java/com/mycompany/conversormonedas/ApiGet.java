package com.mycompany.conversormonedas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ApiGet {
    private URL url;
    private HttpURLConnection con;
    private double valorMoneda;
    
    
    public void equibalencia(String tipoMoneda1, String tipoMoneda2){
        try {
            url = new URL("https://api.exchangerate.host/latest?base="+tipoMoneda1+"&&symbols="+tipoMoneda2);
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
                System.out.println("Principal..."+moneda);
                valorMoneda =  Double.parseDouble(moneda.get(tipoMoneda2).toString());
                System.out.println("Principal..." + valorMoneda);
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public double cambio(double cantidad){
        double monedaConvertida = this.valorMoneda * cantidad;
        System.out.println("Class..."+monedaConvertida);
        System.out.println("Class... valorMoneda"+valorMoneda);
        return monedaConvertida;
    }
}

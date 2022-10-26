package Retos;

import java.util.Scanner;

public class Reto3Carisellazo {
    public static void main(String[] args) throws Exception {

    Scanner leer= new Scanner (System.in);
    int caraysello,eleccion;
    caraysello= (int)(Math.random()*2 + 1);
        
    System.out.println("Tire la moneda escogiendo 1 para cara y 2 para sello");
    eleccion=leer.nextInt();

    if (caraysello==1 && eleccion==1){
    System.out.println("Usted escogio cara y salio cara Ganaste");
}
    else if (caraysello==2 && eleccion==1){
    System.out.println("Usted escogio cara y salio Sello Perdiste");
 }

    else if (caraysello==2 && eleccion==2){
    System.out.println("Usted escogio Sello y salio Sello Ganaste");
 }

    else if (caraysello==1 && eleccion==2){
    System.out.println("Usted escogio Cara y salio Sello Perdiste");
 }
 
    else {
    System.out.println("Los Datos ingresados son Incorrectos ");

    }
 
    leer.close();
        
    }
}

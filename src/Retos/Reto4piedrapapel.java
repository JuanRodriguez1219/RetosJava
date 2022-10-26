package Retos;

import java.util.Scanner;

public class Reto4piedrapapel {public static void main(String[] args) throws Exception {
    Scanner leer= new Scanner (System.in);
    int cayo,eleccion;
    cayo= (int)(Math.random()*3 + 1);
        
    System.out.println("Menú opciones \n 1.Piedra \n 2.Papel \n 3.Tijera ");
    eleccion=leer.nextInt();

    if (cayo==1 && eleccion==1){
    System.out.println("Escogiste Piedra y salio Piedra Ganaste ");
}
    if (cayo==2 && eleccion==1){
    System.out.println("Escogiste Piedra y salio Papel Perdiste ");
 }

    if (cayo==3 && eleccion==1){
    System.out.println("Escogiste Piedra y salio Papel Perdiste ");
}

    else if (cayo==1 && eleccion==2){
    System.out.println("Escogiste Papel y salio Piedra Perdiste ");
 }

    else if (cayo==2 && eleccion==2){
    System.out.println("Escogiste Papel y salio Papel Ganaste");
 }

    else if (cayo==3 && eleccion==2){
    System.out.println("Escogiste Papel y salio Tijera Perdiste");
 }

    else if (cayo==1 && eleccion==3){
    System.out.println("Escogiste Tijera y salio Piedra Perdiste");
 }
    else if (cayo==2 && eleccion==3){
    System.out.println("Escogiste Tijera y salio Papel Perdiste");
 }
    else if (cayo==3 && eleccion==3){
    System.out.println("Escogiste Tijera y salio Tijera Ganaste");
 }
 
    else {
    System.out.println("Los Datos ingresados son Incorrectos ");

    }
 
    leer.close();
        
    }
}
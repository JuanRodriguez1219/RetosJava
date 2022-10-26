package Retos;

import java.util.Scanner;
public class Reto1grados {
 public static void main(String[] args) throws Exception {

    //Definir un objeto

    Scanner leer=new Scanner(System.in);

    //Reciba el valor de los datos centigrados y calculelos a grados farenheit
    
    //Datos de entrada
    final double GF=1.8;
    int FR=-32;
    float GradosF;
    Double Grados;
    

    System.out.println("Ingrese los grados Farenheit");
    GradosF=leer.nextFloat();
    Grados=GradosF-FR/GF;
    System.out.println("Los grados centigrados son "+Grados);
    
    leer.close();


    
 }   
}
package Retos;
import java.util.Scanner;

public class Reto2dosis { 
    public static void main(String[] args)throws Exception {

    double peso,meses,mesfinal,dosisvacuna,pesofinal;
    Scanner leer= new Scanner (System.in);

    System.out.println("Digite el peso del Bebe");
        peso=leer.nextDouble();
        pesofinal=peso+10;
    
    System.out.println("Digite los meses del Bebe");
        meses=leer.nextDouble();
        mesfinal=meses*10;
        dosisvacuna=(pesofinal/mesfinal)*(8);
    System.out.println("La dosis de la vacuna que se debe aplicar a un bebe es "+dosisvacuna);

    leer.close();
        
}
}
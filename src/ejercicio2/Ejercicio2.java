/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Usuario DAM 1
 */
import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        String [] diassemana= {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        String hora;
        int minutos;
        
        String aux;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el dia: ");          
        
        aux = sc.nextLine();
        
        System.out.println("Introduce la hora: ");
        hora = sc.nextLine();
        String[] parts = hora.split(":");
        String part1 = parts[0];
        minutos = Integer.parseInt(part1);
        
       
        
        
    }
    
}

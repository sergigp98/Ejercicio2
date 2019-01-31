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
import java.text.DecimalFormat;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String hora;
        int horas;
        int minutos;
        int minutostotales = (4 * 24 * 60) + (15 * 60);
        int calculo = 0;
        int minutosfinales;
        boolean salir = true;
        DecimalFormat punto = new DecimalFormat("###,###.##");

        String aux;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dia: ");

        aux = sc.nextLine();
        
        System.out.print("Introduce la hora: ");
            hora = sc.nextLine();
            String[] parts = hora.split(":");
            String part1 = parts[0];
            String part2 = parts[1];

            horas = Integer.parseInt(part1); //Pasa horas a entero

        int i = 0;

        if (aux.equalsIgnoreCase("Lunes")) {
            i = 0;

        } else if (aux.equalsIgnoreCase("Martes")) {
            i = 1;

        } else if (aux.equalsIgnoreCase("Miercoles")) {
            i = 2;

        } else if (aux.equalsIgnoreCase("Jueves")) {
            i = 3;

        } else if (aux.equalsIgnoreCase("Viernes")) {            
            i = 4;
            if(horas>=15){
                salir=false;
            }
      
        } else if (aux.equalsIgnoreCase("Domingo")||aux.equalsIgnoreCase("Sabado")) {
            salir = false;

        }
        if (salir == true) {
            
            minutos = Integer.parseInt(part2); //Pasa minutos a entero 

            calculo = (horas * 60) + (i * 24 * 60) + minutos;

            System.out.println("Faltan " + punto.format(minutosfinales = minutostotales - calculo) + " minutos para el fin de semana");
        }
    }

}

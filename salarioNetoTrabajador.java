package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: El Gobierno ha decidido que todas aquellas personas que tienen un salario igual a
superior a un millón de colones deben pagar un impuesto del 10%. Calcule el salario
neto de un trabajador. El sistema recibe el salario del trabajador como entrada.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej6w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 

        double salarioNeto;
        double impuesto = 0.1;
        double salarioFinal;
        
        escribir.println("Digite el salario neto de la persona:");
        salarioNeto = Double.parseDouble(leer.readLine());

        if (salarioNeto >= 1000000){
            salarioFinal = salarioNeto - (salarioNeto*impuesto);
        } else {
            salarioFinal = salarioNeto;
        }

        escribir.println("El salario final es de " +salarioFinal);
    }
}
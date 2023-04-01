/**
 * La clase círculo calcula y muestra
 * el área y el perímetro de una circunferencia.
 * El radio se lee por consola.
 */

import java.io.*;
import java.util.*;

    public class Main {

        public static void main(String[] args) {
            double radio = 0;
            double area, circunf;
            radio = leeTeclado();
            area = calculaArea(radio);
            circunf = calculaCircunferencia(radio);

            muestraResultado(radio, area, circunf);

        }

/**
 * Lee un valor double desde el teclado
 * @return El valor double leído
 */

    public static double leeTeclado() {
        double valor = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Introduce el radio del círculo:");
            valor = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Error al leer el radio.");
        }
        return valor;
    }
/**
 * Calcula el área de un círculo dado su radio
 * @param radio El radio del círculo
 * @return El área del círculo
 */

    public static double calculaArea(double radio) {
        return Math.PI * radio * radio;
    }


/**
 * Calcula la circunferencia de un círculo dado su radio
 * @param radio El radio del círculo
 * @return La circunferencia del círculo
 */

    public static double calculaCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

/**
 * Muestra el radio, área y circunferencia del círculo
 * @param radio El radio del círculo
 * @param area El área del círculo
 * @param circunf La circunferencia del círculo
 */

    public static void muestraResultado(double radio, double area, double circunf) {
        System.out.println("El radio del círculo es: " + radio);
        System.out.println("El área del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + circunf);
    }

    }















































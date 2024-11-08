package Tarea.practica2;

import java.util.ArrayList;
import java.util.List;

public class Recursos {

    public String obtenerMensaje() {
        return "Programación Orientada a Objetos 2021";
    }

    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public List<Integer> listarNumeros(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        System.out.println("Método 1: " + recursos.obtenerMensaje());

        int edad = 24;
        System.out.println("Método 2: " + recursos.verificarEdad(edad));
        
        int resultadoMultiplicacion = recursos.multiplicar(5, 10);
        System.out.println("Método 3: Resultado de la multiplicación: " + resultadoMultiplicacion);

        int numeroLimite = 10;
        List<Integer> listaNumeros = recursos.listarNumeros(numeroLimite);
        System.out.println("Método 4: Lista de números del 1 al " + numeroLimite + ": " + listaNumeros);
    }
}
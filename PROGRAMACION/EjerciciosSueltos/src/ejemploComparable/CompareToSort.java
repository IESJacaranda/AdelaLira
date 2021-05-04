package ejemploComparable;

import java.util.Arrays;

public class CompareToSort {

	static class Persona implements Comparable<Persona> {

	    public static void main(String[] args) {
	        Persona[] arrayPersonas = new Persona[5];
	        arrayPersonas[0] = new Persona("Mario", 22, 187);
	        arrayPersonas[1] = new Persona("Pepe", 52, 173);
	        arrayPersonas[2] = new Persona("Manuel", 27, 158);
	        arrayPersonas[3] = new Persona("David", 25, 164);
	        arrayPersonas[4] = new Persona("Alberto", 80, 184);

	        System.out.println("Array sin ordenar por altura");
	        imprimeArrayPersonas(arrayPersonas);
	        // Ordeno el array de personas por altura (de menor a mayor).
	        Arrays.sort(arrayPersonas);
	        System.out.println("Array ordenado por altura");
	        imprimeArrayPersonas(arrayPersonas);
	    }
	    
	    
	        public String nombre;
	        public int edad, altura;

	        public Persona(String nombre, int edad, int altura) {
	            this.nombre = nombre;
	            this.edad = edad;
	            this.altura = altura;
	        }

	        @Override
	        public int compareTo(Persona o) {
	            if (altura < o.altura) {
	                return -1;
	            }
	            if (altura > o.altura) {
	                return 1;
	            }
	            return 0;
	        }
	    }
	    
	    static void imprimeArrayPersonas(Persona[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println((i+1) + ". " + array[i].nombre + " - Altura: " + array[i].altura + " - Edad: " + array[i].edad);
	        }
	    }
}


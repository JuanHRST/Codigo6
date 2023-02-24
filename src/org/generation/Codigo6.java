package org.generation;

public class Codigo6 {
	public static void main (String[] args) { // Se agrego el public static
	

	int[] n = new int[20]; // Se agrego new

	for( int i = 0;i<20;i++) { // Se agrego un "+" para completar el operador de postincremento
		n[i] = (int) (Math.random() * 381) + 20;
		System.out.print(n[i] + " "); // se agrego out. en el syso
	}

	System.out.println("\n¿Qué números quiere resaltar? "); //Se corrigió a el syso agregando la n
	System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	int opcion = Integer.parseInt(System.console().readLine()); // ")" Se agrego el parentesis faltante

	int multiplo = (opcion == 1)? 5 : 7; //Se cambio el orden de los operadores

	for  (int e : n) { //Se quito el each del for, se modificó el char al int
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
       }else {
        System.out.print(e + " "); //se saco el else del if, el syso debia ser out y no int
    }
}
	}
	}

//No me alcanzo a funcionar pero creo que hace numeros aleatorios y luego eliges que numeros resaltar
//Creo que mi error está en los syso's'
package guia1;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		// instancia a la clase scanner
		// creado un objeto sc a partir de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// declarar la variable 
		int numero = 0;
		
		// lectura
		System.out.println("ingrese número: ");
		numero = sc.nextInt();
		
		// impresion 
		System.out.println("Numero ingresado");
		System.out.println("------------------");
		System.out.println("número...:" + numero);
		
	}

}

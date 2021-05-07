package guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingese precio: ");
		float precio = sc.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = (float) (importe1 / 3.24);
		float importe3 = (float) (importe1 / 3.75);
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Importe S/: " + df.format(importe1));
		System.out.println("Importe U$: " + df.format(importe2));
		System.out.println("Importe U$: " + df.format(importe3));
		
	}

}

package es.studium.IVA2;

import java.util.Scanner;

public class IVA
{

	public static void main(String[] args)
	{
		// declaro variables
		int cantidad, iva; 
		double resultado;
		Scanner teclado = new Scanner(System.in);
		cantidad=1;
		while (cantidad != 0)
		{
			// muestro por pantalla y meto por teclado
			System.out.println("Introduce una cantidad o el numero 0 para salir del programa ");
			cantidad = teclado.nextInt();
			// si cantidad es igual a 0 finalizo el programa
			if (cantidad == 0)
			{
				System.out.println("Fin del programa ");
				break;// salir del bucle
			}
			//si no sigue con esto pero no hace falta poner el else
			System.out.println("Introduce un numero para el Iva de O a 100 ");
			iva = teclado.nextInt();
			
			// calculo resultado y muestro por pantalla
			resultado = (cantidad * iva) / 100.0;
			System.out.println("El " + iva + "% de " + cantidad + " es " + resultado);
		}
		teclado.close();//el teclado lo cierro fuera del bucle
	}
}

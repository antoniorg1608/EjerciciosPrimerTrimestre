package es.studium.Iva;

import java.util.Scanner;

public class Iva
{
	public static void main(String[] args)
	{
		float cantidad, iva;
		Scanner teclado = new Scanner(System.in);
		do
		{
			System.out.println("Dame una cantidad (0 para salir):");
			cantidad = teclado.nextFloat();
			if (cantidad != 0)
			{
				System.out.println("Dame el IVA:");
				iva = teclado.nextFloat();
				System.out.println("El IVA es " + cantidad * iva / 100.0);
			}
		} while (cantidad != 0);
		teclado.close();
	}
}
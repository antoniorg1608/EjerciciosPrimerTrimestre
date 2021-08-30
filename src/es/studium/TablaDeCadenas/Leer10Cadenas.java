package es.studium.TablaDeCadenas;

import java.util.Scanner;

public class Leer10Cadenas
{
	public static void main(String[] args)
	{
		final int TAM = 10;
		Scanner teclado = new Scanner(System.in);
		String tabla[] = new String[TAM];
		for (int i = 0; i < TAM; i++)
		{
			System.out.println("Dame el valor de la tabla [" + i + "]:");
			tabla[i] = teclado.nextLine();
		}
		for (int i = 0; i < TAM; i++)
		{
			System.out.println("Tabla[" + i + "]:" + tabla[i]);
		}
		teclado.close();
	}
}

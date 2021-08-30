package es.studium.CadenaMasCorta;

import java.util.Scanner;

public class CadenaMasCorta
{
	final static int TAM = 10;

	public static void main(String[] args)
	{
		String[] tabla = new String[TAM];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < TAM; i++)
		{
			System.out.println("Dame el valor de la tabla [" + i + "]:");
			tabla[i] = teclado.nextLine();
		}
		teclado.close();
		System.out.println("La cadena más corta es " + cadenaMasCorta(tabla));
	}

	public static String cadenaMasCorta(String t[])
	{
		String cadenaMasCorta = t[0];
		for (int i = 1; i < TAM; i++)
		{
			if (t[i].length() <= cadenaMasCorta.length())
			{
				cadenaMasCorta = t[i];
			}
		}
		return (cadenaMasCorta);
	}
}

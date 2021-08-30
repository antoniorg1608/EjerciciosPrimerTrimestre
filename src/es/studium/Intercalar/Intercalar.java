package es.studium.Intercalar;

import java.util.Scanner;

public class Intercalar
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame la primera cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Dame la segunda cadena:");
		cadena2 = teclado.nextLine();
		teclado.close();
		for (int i = 0; i < cadena1.length() || i < cadena2.length(); i++)
		{
			if (i < cadena1.length())
			{
				System.out.print(cadena1.charAt(i));
			}
			if (i < cadena2.length())
			{
				System.out.print(cadena2.charAt(i));
			}
		}
	}
}
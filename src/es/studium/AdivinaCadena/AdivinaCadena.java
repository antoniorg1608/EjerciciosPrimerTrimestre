package es.studium.AdivinaCadena;

import java.util.Random;
import java.util.Scanner;

public class AdivinaCadena
{
	public static void main(String[] args)
	{
		String[] cadenasSecretas =
		{ "casa", "árbol", "bolígrafo", "ruleta", "perro" };
		int numeroSecreto;
		String cadena;
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		numeroSecreto = rand.nextInt(5);
		System.out.println("Adivina la cadena secreta:");
		cadena = teclado.nextLine();
		if (cadenasSecretas[numeroSecreto].equals(cadena))
		{
			System.out.println("Acertaste!");
		} else
		{
			System.out.println("Fallaste: La cadena secreta era " + cadenasSecretas[numeroSecreto]);
		}
		teclado.close();
	}
}
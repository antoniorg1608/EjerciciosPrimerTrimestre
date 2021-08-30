package es.studium.Traductor;

import java.util.Scanner;

public class Traductor
{

	public static void main(String[] args)
	{
		String[] castellano =
		{ "yo", "tú", "él", "ella", "soy", "eres", "es", "alto", "bajo", "español" };
		String[] ingles =
		{ "i", "you", "he", "she", "am", "are", "is", "tall", "short", "spanish" };
		int opcion;
		String cadenaOriginal;
		String cadenaTraducida = "";
		String[] cadenaCortada;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elegir opción: 1 - Castellano a Inglés " + "2 - Inglés a Castellano");
		opcion = teclado.nextInt();
		teclado.nextLine(); // Vaciar el teclado
		switch (opcion)
		{
		case 1: // Castellano
			System.out.println("Dame una frase:");
			cadenaOriginal = teclado.nextLine(); // él es español
			cadenaCortada = cadenaOriginal.split(" "); // él, es, español
			for (String cadena : cadenaCortada)
			{
				for (int i = 0; i < castellano.length; i++)
				{
					if (cadena.equals(castellano[i]))
					{
						cadenaTraducida = cadenaTraducida + " " + ingles[i];
					}
				}
			}
			break;
		case 2: // Inglés
			System.out.println("Give me a sentence:");
			cadenaOriginal = teclado.nextLine(); // she is tall
			cadenaCortada = cadenaOriginal.split(" "); // she, is, tall
			for (String cadena : cadenaCortada)
			{
				for (int i = 0; i < ingles.length; i++)
				{
					if (cadena.equals(ingles[i]))
					{
						cadenaTraducida = cadenaTraducida + " " + castellano[i];
					}
				}
			}
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
		teclado.close();
		System.out.println(cadenaTraducida);
	}
}
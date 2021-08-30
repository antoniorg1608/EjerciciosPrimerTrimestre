package es.studium.AdivinaNumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero
{
	public static void main(String[] args)
	{
		int numeroSecreto, numero;
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		numeroSecreto = rand.nextInt(5) + 1;
		System.out.println("Adivina el número secreto (De 1 a 5):");
		numero = teclado.nextInt();
		if (numeroSecreto == numero)
		{
			System.out.println("Acertaste!");
		} else
		{
			System.out.println("Fallaste: El número secreto era el " + numeroSecreto);
		}
		teclado.close();
	}
}

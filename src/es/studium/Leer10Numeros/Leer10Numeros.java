package es.studium.Leer10Numeros;

import java.util.Scanner;

public class Leer10Numeros
{
	final static int TAM = 10;

	public static void main(String[] args)
	{
		float media;
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[TAM];
		for (int i = 0; i < TAM; i++)
		{
			System.out.println("Dame el valor de la tabla [" + i + "]:");
			tabla[i] = teclado.nextInt();
		}
// Calcular media
		media = calcularMedia(tabla);
		System.out.println("La media vale: " + media);
		for (int i = TAM - 1; i >= 0; i--)
		{
			System.out.println("Tabla[" + i + "]:" + tabla[i]);
		}
		teclado.close();
	}

	static float calcularMedia(int t[])
	{
		float media;
		int suma = 0;
		for (int i = 0; i < TAM; i++)
		{
			suma = suma + t[i];
		}
		media = (float) suma / TAM;
		return media;
	}
}

package es.studium.Mitad;

import java.util.Scanner;

public class Mitad
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un número entero:");
		numero = teclado.nextInt();
		teclado.close();
		System.out.println("La mitad vale " + mitad(numero));
	}

	public static float mitad(int n)
	{
		return (n / 2f); // 2f significa que el 2 es un float
	}
}
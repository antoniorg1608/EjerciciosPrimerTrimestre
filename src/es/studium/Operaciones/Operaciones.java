package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones
{
	public static void main(String[] args)
	{
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el primer n�mero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame el segundo n�mero:");
		numero2 = teclado.nextInt();
		if ((numero1 % 2 == 0) && (numero2 % 2 == 0))
		{
			System.out.println("Su suma vale " + (numero1 + numero2));
		} else
		{
			System.out.println("Su producto vale " + (numero1 + numero2));
		}
		teclado.close();
	}
}

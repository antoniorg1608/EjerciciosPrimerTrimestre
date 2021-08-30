package es.studium.Saludo;

import java.util.Scanner;

public class Saludo
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String horaOriginal;
		String[] horaCortada;
		do
		{
			System.out.println("Dame la hora en formato HH:MM -->");
			horaOriginal = teclado.nextLine();
		} while (horaOriginal.length() != 5);
		teclado.close();
// Separamos la hora de los minutos
		horaCortada = horaOriginal.split(":");
		if ((Integer.parseInt(horaCortada[0]) >= 7) && (Integer.parseInt(horaCortada[0]) <= 12))
		{
			System.out.println("Buenos días");
		} else if ((Integer.parseInt(horaCortada[0]) >= 13) && (Integer.parseInt(horaCortada[0]) <= 19))
		{
			System.out.println("Buenas tardes");
		} else
		{
			System.out.println("Buenas noches");
		}
	}
}

package es.studium.CambiarFormatoHora;

import java.util.Scanner;

public class CambiarFormatoHora
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String horaOriginal;
		String[] horaCortada;
		int horaCambiada;
		do
		{
			System.out.println("Dame la hora en formato HH:MM -->");
			horaOriginal = teclado.nextLine();
		} while (horaOriginal.length() != 5);
// Separamos la hora de los minutos
		horaCortada = horaOriginal.split(":");
// Transformamos
		if (Integer.parseInt(horaCortada[0]) < 12)
		{
			System.out.println(horaOriginal + " am");
		} else if (Integer.parseInt(horaCortada[0]) == 12)
		{
			horaCambiada = Integer.parseInt(horaCortada[0]);
			System.out.println(horaOriginal + " pm");
		} else
		{
			horaCambiada = Integer.parseInt(horaCortada[0]) - 12;
			System.out.println(horaCambiada + ":" + horaCortada[1] + " pm");
		}
		teclado.close();
	}
}

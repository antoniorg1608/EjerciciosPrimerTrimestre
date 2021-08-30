package es.studium.FinalAno;

import java.util.Scanner;

public class FinalAno
{
	public static void main(String[] args)
	{
		int dia, mes, anyo;
		int diasTranscurridos = 0;
		int diasFebrero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el día:");
		dia = teclado.nextInt();
		System.out.println("Dame el mes:");
		mes = teclado.nextInt();
		System.out.println("Dame el año:");
		anyo = teclado.nextInt();
// Averiguar si el año es Bisiesto
		if (((anyo % 4 == 0) && (anyo % 100 != 0)) || (anyo % 400 == 0))
		{
			diasFebrero = 29; // Es Bisiesto
		} else
		{
			diasFebrero = 28; // No es Bisiesto
		}
		switch (mes)
		{
		case 1:
			diasTranscurridos = dia;
			break;
		case 2:
			diasTranscurridos = 31 + dia;
			break;
		case 3:
			diasTranscurridos = 31 + diasFebrero + dia;
			break;
		case 4:
			diasTranscurridos = 31 + diasFebrero + 31 + dia;
			break;
		case 5:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + dia;
			break;
		case 6:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + 31 + dia;
			break;
		case 7:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + 31 + 30 + dia;
			break;
		case 8:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + dia;
			break;
		case 9:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + dia;
			break;
		case 10:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dia;
			break;
		case 11:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dia;
			break;
		case 12:
			diasTranscurridos = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dia;
			break;
		}
		if (diasFebrero == 28)
		{
			System.out.println("Quedan " + (365 - diasTranscurridos));
		} else
		{
			System.out.println("Quedan " + (366 - diasTranscurridos));
		}
		teclado.close();
	}
}
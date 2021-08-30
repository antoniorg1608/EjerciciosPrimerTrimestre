package es.studium.Hopolapa;

import java.util.Scanner;

public class Hopolapa
{

	public static void main(String[] args)
	{
		String cadenaOriginal, cadenaTransformada = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		cadenaOriginal = teclado.nextLine();
		for (int i = 0; i < cadenaOriginal.length(); i++)
		{
			switch (cadenaOriginal.charAt(i))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'á':
			case 'é':
			case 'í':
			case 'ó':
			case 'ú':
				cadenaTransformada = cadenaTransformada + cadenaOriginal.charAt(i) + "p" + cadenaOriginal.charAt(i);
				break;
			default:
				cadenaTransformada = cadenaTransformada + cadenaOriginal.charAt(i);
			}
		}
		System.out.println(cadenaTransformada);
		teclado.close();
	}
}
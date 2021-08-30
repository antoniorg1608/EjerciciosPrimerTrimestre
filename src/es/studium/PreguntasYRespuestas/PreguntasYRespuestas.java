package es.studium.PreguntasYRespuestas;

import java.util.Random;
import java.util.Scanner;

public class PreguntasYRespuestas
{
	public static void main(String[] args)
	{
		final int NUM_PREGUNTAS = 3;
		Scanner teclado = new Scanner(System.in);
// Tabla de preguntas
		String[] preguntas =
		{ "Capital de Mongolia", "Año de descubrimiento de América", "El NaCl se conoce mejor como ...",
				"La Estrella Polar indica ...", "En el Imperio Romano, al Mar Mediterráneo se le conocía como ...",
				"Nombre del caballo de El Cid", "Amigo de Rigodón, de la serie de dibujos animados Willy Fog",
				"Director de Blade Runner", "Actriz principal de Titanic", "Continente menos poblado del Planeta" };
// Tabla de posibles respuestas
// La primera es la correcta
// Luego se sacarán de forma aleatoria
		String[][] respuestas =
		{
				{ "Ulam Bator", "Mogadiscio", "Mongol City" },
				{ "1492", "1942", "1429" },
				{ "Sal", "Pimienta", "Azúcar" },
				{ "El Norte", "El Sur", "El Ecuador" },
				{ "Mare Nostrum", "Mare Interior", "Mare Celestis" },
				{ "Babieca", "Belcebú", "Babiera" },
				{ "Tico", "Picatoste", "Chirlo" },
				{ "Ridley Scott", "Ron Howard", "Christopher Nolan" },
				{ "Kate Winslet", "Pamela Anderson", "Jessica Chestain" },
				{ "Antártida", "Oceanía", "Europa" }, };
		int contadorAciertos = 0;
		String respuesta, respuestaCorrecta = "a";
		Random rnd = new Random();
		int posicionPregunta, posicionRespuestas;
		for (int i = 0; i < NUM_PREGUNTAS; i++)
		{
// Sacar pregunta Aleatoria
			posicionPregunta = rnd.nextInt(10);
			System.out.println(preguntas[posicionPregunta]);
// Sacar las posibles respuestas en orden aleatorio
			posicionRespuestas = rnd.nextInt(3);
			System.out.print("(a)");
			System.out.println(respuestas[posicionPregunta][posicionRespuestas]);
			posicionRespuestas++;
			if (posicionRespuestas > 2) // Si me "salgo" del rango (0,1,2), vuelvo al ppio
			{
				posicionRespuestas = 0;
				respuestaCorrecta = "b";
			}
			System.out.print("(b)");
			System.out.println(respuestas[posicionPregunta][posicionRespuestas]);
			posicionRespuestas++;
			if (posicionRespuestas > 2) // Si me "salgo" del rango (0,1,2), vuelvo al ppio
			{
				posicionRespuestas = 0;
				respuestaCorrecta = "c";
			}
			System.out.print("(c)");
			System.out.println(respuestas[posicionPregunta][posicionRespuestas]);
			System.out.println("Respuesta (a, b, c):");
			respuesta = teclado.nextLine();
			if (respuesta.equals(respuestaCorrecta))
			{
				contadorAciertos++;
				System.out.println("Acertaste. Llevas " + contadorAciertos + "respuestas acertadas");

			} else
			{
				System.out.println("Incorrecto!");
			}
			if (i != 2)
			{
				System.out.println("Siguiente pregunta...");
			}
		}
		System.out.println("Han sido " + contadorAciertos + " respuestas acertadas");
		teclado.close();
	}
}

package exercicios;

import java.util.Scanner;

public class AlcoolGasolina {
		public static void main(String[] args) {
			//vari�veis
			double gasolina,alcool,resultado;
			//objetos
			Scanner teclado = new Scanner(System.in);
			//Entrada
			System.out.println("GASOLINA x ALCOOL");
			System.out.println("Digite o valor da Gasolina: ");
			gasolina = teclado.nextDouble();
			System.out.println("Digite o valor do Alc�ol: ");
			alcool = teclado.nextDouble();
			//processamento
			resultado = (alcool * 10) / (gasolina * 10);
			//saida
			System.out.println("O mais barato �...");
			
			//estrutura de controle condicional
			if (resultado <= 0.70) {
				System.out.println("Alcool");
			} else {
				System.out.println("Gasolina");
			}
			teclado.close();
	}

}
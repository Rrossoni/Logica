package exercicios;

import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
			//vari�veis
			String nome;
			double nota1,nota2,nota3,nota4,media;
			//objetos
			Scanner teclado = new Scanner(System.in);
			//Entrada
			System.out.println("Digite o seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Digite a nota1: ");
			nota1 = teclado.nextDouble();
			System.out.println("Digite a nota2: ");
			nota2 = teclado.nextDouble();
			System.out.println("Digite a nota3: ");
			nota3 = teclado.nextDouble();
			System.out.println("Digite a nota4: ");
			nota4 = teclado.nextDouble();
			//processamento
			media = (nota1 + nota2 + nota3 + nota4) /  4;
			//saida
			System.out.println("======================");
			System.out.println("== C�lculo da m�dia ==");
			System.out.println("======================");
			System.out.println("");
			System.out.println("Nome: " + nome);
			System.out.println("M�dia: " + media);

			//estrutura de controle condicional
			if (media < 4) {
				System.out.println("REPROVADO");
			} else if (media <5) {
				System.out.println("Recupera��o");
			} else {
				System.out.println("APROVADO");
			}
			teclado.close();
	}

}
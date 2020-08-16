package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		//vari�veis
		String nome;
		double peso,altura,media;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//Entrada
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite o seu peso: ");
		peso = teclado.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura = teclado.nextDouble();
		//processamento
		media = peso / (altura * altura);
		//saida
		System.out.println("======================");
		System.out.println("== C�lculo do IMC ==");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("IMC: " + formatador.format(media));
		teclado.close();
	}

}
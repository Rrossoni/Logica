package exercicios;

import java.util.Scanner;

public class Maiorounao {

	public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com seu ano de nascimento");
    
    int nascimento = scan.nextInt();
    
    if (nascimento <=2020){
        System.out.println ( " Maior de idade.");
    } else {
    	
    	System.out.println (" Menor de Idade");
    }
   

	}

}

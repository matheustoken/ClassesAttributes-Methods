package application;

import java.util.Scanner;
import conta_corrente.cadastro;



public class program {

	public static void main(String[] args) {
		
	cadastro Cadastro;	
		
	  Scanner sc = new Scanner(System.in);
	  
	System.out.print("Entre com o número da conta:");
	int conta = sc.nextInt();
	System.out.print("Entre com o seu Nome:");
	sc.nextLine();
	String nome = sc.nextLine();
	
	
	System.out.print("Será realizado algum depósito inicial? RESPONDA COM S/N");
	char resposta= sc.next().charAt(0);
	
	if (resposta =='y') {
		System.out.print("Entre com o valor inicial:");
	 	double inicio_deposito=sc.nextDouble();
	    Cadastro = new cadastro(nome,conta,inicio_deposito);		
	}
	else{
		
	    Cadastro = new cadastro(nome,conta);    	
	}
	System.out.println();
	System.out.println("Conta Cadastro: ");
	System.out.println(Cadastro);
	
	  sc.close();
	}
}

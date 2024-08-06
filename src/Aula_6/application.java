package Aula_6;

import java.util.Locale;
import java.util.Scanner;

import Aula_6_produto.produto;

public class application {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	
	produto Produto = new produto();
	
	System.out.println("Entre com nome do produto: ");
	System.out.print("Produto: ");
	Produto.name =sc.nextLine();
	System.out.print("Preco: ");
	Produto.preco =sc.nextDouble();
	System.out.print("Quantidade em estoque: ");
	Produto.qtde =sc.nextInt();
	

	
	System.out.println(Produto.toString());
	
	System.out.println();
	
	
	System.out.println("Entre com a quantidade de produtos adicionado ao estoque: ");
	int quantity = sc.nextInt();
	Produto.adicionarProdutos(quantity);
	
	
	System.out.println(Produto.toString());
	
	System.out.println("Entre com a quantidade de produtos a ser removidos do estoque: ");
	quantity = sc.nextInt();
	Produto.removerProdutos(quantity);
	
	System.out.println();
	
	System.out.println(Produto.toString());
	
	
	
	
	sc.close();
	
	 
		
	
	
	
}
}

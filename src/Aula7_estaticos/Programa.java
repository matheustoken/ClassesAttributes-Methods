package Aula7_estaticos;

import java.util.Locale;
import java.util.Scanner;
import Aula7_estaticos.instancia;
import Aula7_estaticos.estatico;




public class Programa {
	
//	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com a quantidade de doláres a serem comprados :");
	int compra = sc.nextInt();
	
	
	
	estatico converte = new estatico();
	
	double valorPago = converte.currencyConverter(compra);
	
	System.out.println("Valor a ser pago em reais será de R$ :"+valorPago);
//	System.out.printf("Volume de : %.2f%n",v);
//	System.out.printf("PI valor de : %.2f%n",PI);
	
	
	
		
	
	sc.close();
	}
	
	

}

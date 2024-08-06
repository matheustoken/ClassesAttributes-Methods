package DESAFIO_BAR;

import java.util.Locale;
import java.util.Scanner;
import DESAFIO_BAR.bill;


public class Programming {
		

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	
	
	System.out.println("Qual é o sexo (M/F): ");
    char gender = sc.next().charAt(0);
    
    
     
     System.out.print("Qual é a quantidade de cervejas: ");
     int beer = sc.nextInt(); 
     
     System.out.print("Qual a quantidade de refrigerantes ");
     int softdrink = sc.nextInt();
     
     System.out.print("Qual a quantidade de espetinhos consumidos: ");
     int barbecue = sc.nextInt();
     
    
     
     
      bill Bill = new bill();
      
      double ticketValue =0;
      double coverValue =0;
      
      double ticket = Bill.Ticket(gender, ticketValue);
      double feed = Bill.Feeding(beer,softdrink, barbecue);
      double cover = Bill.Cover(feed, coverValue);
      double total = Bill.Total(feed, cover,ticket);
      
      
      System.out.println( "RELATÓRIO :");
      
      System.out.printf("Consumo = R$ %.2f%n", feed);
      System.out.printf("Couvert = R$ %.2f%n", cover);
      System.out.printf("Ingresso = R$ %.2f%n", ticket);
      System.out.printf("Valor total a pagar = R$ %.2f%n", total);

     
     
     
	
}
}

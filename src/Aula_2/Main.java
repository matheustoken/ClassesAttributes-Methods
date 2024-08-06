package Aula_2;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {	
	 Scanner sc = new Scanner(System.in);	  
	
	 double base, altura, area, perimetro, diagonal;

	  System.out.print("Base do retangulo: ");
	  base = sc.nextDouble();
	  
	  
	  System.out.print("Altura do retangulo: ");
	  altura = sc.nextDouble();

	     area = base * altura;

	  System.out.printf("AREA = %.4f\n", area);

      	  perimetro = 2 * (base + altura);

	  System.out.printf("PERIMETRO = %.4f\n", perimetro);

	    diagonal = Math.sqrt(base * base + altura * altura);

	    System.out.printf("DIAGONAL = %.4f\n", diagonal);
	    
	    //Operadores Lógicos
	    //> maior
	    // < menor
	    // >= maior ou igual
	    // >= menor ou igual
	    // == igual
	    // =! diferente
	    
	    //Outras opções
	    
	    // && E
	    // || OU
	    
// if ( condição) {
//  comando
// }
//else if ( condição) {
//  comando
//	}
// else if ( condição) {
//	comando    
//	}
// else {
// comando 
//	}    
	    
	    
	    
	    
	    
	    
	    
	 sc.close();	 
	}
	
	     
	
	
	
	
}

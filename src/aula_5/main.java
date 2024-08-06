package aula_5;

import java.util.Locale;
import java.util.Scanner;
import Aula5_funcao.triangulo;


public class main {
	
	public static void main(String[] args) {
		
	

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangulo x,y;
		x= new triangulo();
		y= new triangulo();
		
		
		System.out.println("Digite os lados do triangulo x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
	    x.c = sc.nextDouble();
		System.out.println("Digite os lados do triangulo y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
    	double areaX = x.area();
    	double areaY = y.area();
        
    	sc.close();
    	
    	System.out.printf("Triangulo X tem área de : %.4f%n",areaX);
    	System.out.printf("Triangulo Y tem área de : %.4f%n",areaY);

  //  	if(areaX>areaY) {
  //  		System.out.printf("Triangulo X tem a maior área de : %.4f%n",areaX);	
    //	}
    //	else {
   // 		System.out.printf("Triangulo Y tem a maior área de : %.4f%n",areaY);	
    //	}
}
}

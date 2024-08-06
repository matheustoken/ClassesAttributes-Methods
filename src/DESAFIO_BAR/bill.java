package DESAFIO_BAR;

import java.util.Locale;
import java.util.Scanner;

public class bill {

	char gender;
	int beer, barbecue, softdrink;
	double ticket, total, feed, cover;

	public  double Ticket(char gender, double ticket)
	{
		if (gender == 'M') {
			return 10;
		} else if (gender == 'F') {
			return 8;
		}
		return ticket;
	}

	public static double Feeding(double beer, double softdrink, double barbecue) {
		double feed= (beer * 5) + (softdrink * 3) + (barbecue * 7);;
		return feed;
	}

	public static double Cover(double feed, double cover) {
		if (feed<30) {
		return cover= 4;	
		}
		else {
		return cover= 0;	
		}
        }
	public static double Total ( double feed, double cover,double ticket) {
       double total = feed+cover+ticket;
       return total;
	}
		
}

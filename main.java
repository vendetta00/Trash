package farcel;

import java.util.Scanner;

public class main {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in)	;
	    int réponse_1; {
	    String bool = "true"; {}
		réponse_1 = 0;
			
		while (bool == "true") {
		
		
	System.out.println("1 - Convertiseur Fahrenheit  /  Celsius ");
	System.out.println("2 - Convertiseur Celsius / Fahrenheit" + "\n");
	int réponse = sc.nextInt()   ; 
	réponse_1 = réponse;
	réponse = 0 ;
	
	
	
	
	
	
	if (réponse_1 == 1) {
	System.out.println("Température à convertir ?" + "\n");
	int réponse_3 = sc.nextInt();
	int num1, num2, num3, cal1 ;{}
	num1 = 9;
	num2 = 5;
	num3 = 32;
	cal1 = 0;
	
	cal1 = (réponse_3 - num3) * num2 /  num1 ;
	
	System.out.println(réponse_3+ "F° " + "équivaut à "  + cal1 + "C°" + "\n" );
	}
	
	else if(réponse_1 == 2) {
	System.out.println("Température à convertir ?" + "\n");
	int réponse_4 = sc.nextInt();
	int cal2, num4, num5, num6;{}
	cal2 = 0;
	num4 = 9;
	num5 = 5;
	num6 = 32;
	
	cal2 = réponse_4  * num4 / num5  + num6 ;
	System.out.println(réponse_4 + "C° " + "équivaut à "  + cal2 + "f°" );
	
	}
	
	System.out.println("Voulez-vous recommencer ? (Y/N) " + "\n");
	String réponse_5 ;{

		 String réponse_6 = sc.nextLine(); 
		 réponse_5 = réponse_6;
		if (réponse_5 == "Y" ) {
			bool = "true"; 
		}
		else {
			bool = "false";
		}
	}
	}
	
		
	
	
	    }
	}
	}


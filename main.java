package farcel;

import java.util.Scanner;

public class main {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in)	;
	    int r�ponse_1; {
	    String bool = "true"; {}
		r�ponse_1 = 0;
			
		while (bool == "true") {
		
		
	System.out.println("1 - Convertiseur Fahrenheit  /  Celsius ");
	System.out.println("2 - Convertiseur Celsius / Fahrenheit" + "\n");
	int r�ponse = sc.nextInt()   ; 
	r�ponse_1 = r�ponse;
	r�ponse = 0 ;
	
	
	
	
	
	
	if (r�ponse_1 == 1) {
	System.out.println("Temp�rature � convertir ?" + "\n");
	int r�ponse_3 = sc.nextInt();
	int num1, num2, num3, cal1 ;{}
	num1 = 9;
	num2 = 5;
	num3 = 32;
	cal1 = 0;
	
	cal1 = (r�ponse_3 - num3) * num2 /  num1 ;
	
	System.out.println(r�ponse_3+ "F� " + "�quivaut � "  + cal1 + "C�" + "\n" );
	}
	
	else if(r�ponse_1 == 2) {
	System.out.println("Temp�rature � convertir ?" + "\n");
	int r�ponse_4 = sc.nextInt();
	int cal2, num4, num5, num6;{}
	cal2 = 0;
	num4 = 9;
	num5 = 5;
	num6 = 32;
	
	cal2 = r�ponse_4  * num4 / num5  + num6 ;
	System.out.println(r�ponse_4 + "C� " + "�quivaut � "  + cal2 + "f�" );
	
	}
	
	System.out.println("Voulez-vous recommencer ? (Y/N) " + "\n");
	String r�ponse_5 ;{

		 String r�ponse_6 = sc.nextLine(); 
		 r�ponse_5 = r�ponse_6;
		if (r�ponse_5 == "Y" ) {
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


package midPrac5;

import java.util.Scanner;

public class MainCmConversion {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			System.out.print("Enter a number(in): ");
			double centimeters = s.nextDouble();
			
			CmConversion c = new CmConversion(centimeters);
			c.displayResults();
			
			s.close();

		}

	}


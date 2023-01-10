package lab12;
import java.util.*;

public class Task2 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int num1;
			int num2;
			for(int i=0;i<2;i++) {
				try {
					System.out.println("Numerator");
					num1 = sc.nextInt();
					System.out.println("Denominator");
					num2 = sc.nextInt();
					double num3 = num1/num2;
					System.out.println("Answer =23" +num3);
				}
				catch(ArithmeticException e) {
					 System.out.println ("Number can't divide by 0");
				}
				catch(Exception e) {
					 System.out.println("Number Invalid. Please enter eintegers");
			}
		}
	}
}

package lab12;
import java.util.*;

public class Main {
	
		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			int[] array = getArray();

			System.out.print("Enter the index : ");
			try {
				
				System.out.println("The  value is " + 
					array[input.nextInt()]);
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Out of Bounds.");
			}
		}

		public static int[] getArray() {
			int[] array = new int[10];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 100) + 1;
			}
			return array;
		}
	}

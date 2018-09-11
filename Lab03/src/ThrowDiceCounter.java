import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThrowDiceCounter {

	public static void main(String args[]) {

		Random random = new Random();

		System.out.println("Enter the number of times that you want to throw the dice");
		Scanner scan = new Scanner(System.in);

		int numberOfThrows = scan.nextInt();

		//int counter = 0;

		
		int[] counters = new int[6];

		for (int i = 0; i < numberOfThrows; i++) {
			
			int randomNumber = random.nextInt(6);
			
			System.out.println(randomNumber);
			

					counters[randomNumber]++;
				
			}
			 
		System.out.println(Arrays.toString(counters));
		}

	}



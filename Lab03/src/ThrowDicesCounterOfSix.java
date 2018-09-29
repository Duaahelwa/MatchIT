import java.util.Random;
import java.util.Scanner;

/**
 * @author doua
 * 
 *         Prints how many times number 6 was appear when a dice was throwing
 * 
 * 
 *
 */

public class ThrowDicesCounterOfSix {

	public static void main(String args[]) {

		Random random = new Random();

		System.out.println("Enter the number of times that you want to throw the dice");
		Scanner scan = new Scanner(System.in);
		int numberOfThrows = scan.nextInt();

		int counterOfSix = 0;

		for (int i = 0; i < numberOfThrows; i++) {

			int randomNumber = random.nextInt(7);

			System.out.println(randomNumber);

			if (randomNumber == 6) {

				counterOfSix++;
			}

		}

		System.out.println("The total of number 6 apperance is  " + counterOfSix);

		scan.close();
	}

}

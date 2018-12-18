import java.util.Random;
import java.util.Scanner;

public class TargetRoll {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int randNum = rand.nextInt(6) + 1;
		System.out.println("Please input target number from 1 to 6: ");
		int targetNum = input.nextInt();
		while (targetNum < 1 || targetNum > 6)
		{
			System.out.println("Please input target number between 1 to 6: ");
			targetNum = input.nextInt();
		}
		int count = 1;
		while (targetNum != randNum)
		{
			System.out.println("You rolled a " + randNum);
			System.out.println("Please press enter to roll again");
			input.nextLine();
			randNum = rand.nextInt(6) + 1;
			count += 1;
		}
		System.out.println("You rolled the target number: " + targetNum);
		System.out.println("It took " + count + " times to roll the target.");

	}

}

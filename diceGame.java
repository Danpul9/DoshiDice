import java.util.Scanner;

public class diceGame {
	static int Dices, Throws;
	private static Scanner k;
	public static void main(String[] args) {
		System.out.println("welcome to the dice game");
		System.out.println("How many dice's do you want to roll?");
		k = new Scanner(System.in); 
		Dices = k.nextInt();
		System.out.println("How many times do you want to roll it?");
		Throws = k.nextInt();
		Dice.Throw(Dices, Throws);
		System.out.println("your average was " + Dice.average);
		

	}

}

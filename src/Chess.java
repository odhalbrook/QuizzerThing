import java.util.Scanner;
public class Chess {
	
	
	public static void chooseColor()
	{
		Scanner uI = new Scanner (System.in);
		System.out.println("There are two colors in chess");
		System.out.println("Which one goes first?");
		System.out.println("1. White");
		System.out.println("2. Black");
		int num = uI.nextInt();
		
		switch (num) {
		case 1: colorWhite();
		break;
		case 2: colorBlack();
		}
	}

	private static void colorBlack() {
		System.out.println("You chose Black, you would go second");
	}

	private static void colorWhite() {
		System.out.println("You chose White, you would go first");
	}
	
	public static void gamePlay()
	{
		System.out.println("If only we could play :(");
	}
}



import java.util.Scanner;

// This a comment
public class Question2 {

	static int[] GOOD_WORTH = {1, 2, 3, 3, 4, 10};
	static int[] EVIL_WORTH = {1, 2, 2, 2, 3, 5, 11};
	
	public static void main() {
		Scanner scan = new Scanner(System.in);
		int good, evil;
		int battles = scan.nextInt();
		
		for (int bi = 0; bi < battles; bi++) {
			good = evil = 0;

			for (int gi = 0; gi < 6; gi++) {
				good = scan.nextInt() * GOOD_WORTH[gi];
			}
			
			for (int ei = 0; ei < 7; ei++) {
				evil = scan.nextInt() * EVIL_WORTH[ei];
			}
			
			System.out.println("Battle " + bi + ": ");
			if (good > evil)
				System.out.println("Good triumphs over Evil");
			else if (good < evil)
				System.out.println("Evil eradicates all trace of Good");
			else
				System.out.println("No victor on this battle field");
		}
	}
	
}

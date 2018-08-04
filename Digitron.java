import java.util.Scanner;
import java.io.PrintStream;

public class Digitron {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrijednosti za: broj1 ");
		int broj1 = input.nextInt();
		System.out.println("Unesite vrijednosti za: broj2");
		int broj2 = input.nextInt();
		System.out.println("Izaberite: \n" + " *1 sabiranje \n *2 oduzimanje \n *3 množenje \n *4 djeljenje \n ");

		int izbor;
		izbor = input.nextInt();
		System.out.println("Izabrali ste: " + izbor);

		if (izbor == 1) {
			System.out.println("Rezultat sabiranja je:");
		}

		if (izbor == 2) {
			System.out.println("Rezultat oduzimanja je:" + oduzimanje(broj1, broj2));
		}

		if (izbor == 3) {
			System.out.println("Rezultat množenja je:" + množenje(broj1, broj2));
		}

		if (izbor == 4) {
			System.out.println("Rezultat djeljenja je:" + djeljenje(broj1, broj2));
		}

	}

	// Sabiranje
    public static int sabiranje(int broj1, int broj2){
		return 0;
	}
	// Oduzimanje
	public static int oduzimanje(int broj1, int broj2) {
		return 0;
	}

	// Množenje
	public static int množenje(int broj1, int broj2) {
		return 0;
	}

	public static double djeljenje(int broj1, int broj2) {
		return broj1 / (double) (broj2);

	}

}

package erste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner scanner = new Scanner(System.in);

		boolean b = true;
		while (b) {

			try {
				System.out.print("Введите число: ");
				double a = scanner.nextDouble();
				if (a <= 1) {
					System.out.println("Число должно быть натуральным и больше 1.");
				} else if (isPrime(a) || a == 2) {
					System.out.println("Это простое число.");
				} else {
					System.out.println("Это не простое число.");
				}
//				b = false;
			} catch (InputMismatchException e) {
				System.out.println("Это не число.");
				scanner.next();
			}

		}

		scanner.close();
	}

	static boolean isPrime(double a) {

		if (a % 2 == 0)
			return false;

		for (int i = 3; i * i <= a; i += 2) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

}

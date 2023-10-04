import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x = sc.nextInt();
		int count;
		int i = 0;
		
		for(i = 0; i <= x; i++) {
			count = i * 10;
			System.out.printf("%d X 10 = %d%n", i, count);
		}

		sc.close();
	}

}

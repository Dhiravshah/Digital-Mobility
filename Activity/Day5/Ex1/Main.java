import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of overs");
		int size = sc.nextInt();
		try {
			int runs[] = new int[size];
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("enter the number of runs for each over");
		for (int i = 0; i < size; i++) {
			runs[i] = sc.nextInt();
		}
		System.out.println("enter the over number:");
		try {
			int choice = sc.nextInt();
			System.out.println("Runs scored in this over:" + runs[choice - 1]);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
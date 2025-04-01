import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		int change = sc.nextInt();
		
		for(int i=0; i<change; i++) {
			
			int money=sc.nextInt();
			System.out.print(money / quarter + " ");
			money%=quarter;
			System.out.print(money / dime + " ");
			money%=dime;
			System.out.print(money / nickel + " ");
			money%=nickel;
			System.out.println(money / penny);
		}
	}
}
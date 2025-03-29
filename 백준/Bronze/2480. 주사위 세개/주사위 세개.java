import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int price = 0;
		
		if(num1==num2 && num2==num3) { //3개의 눈이 같을떄
			price= 10000 + (num2*1000);
		}
		else if(num1==num2) { //2개의 눈이 같을떄
			price= 1000+(num1*100);
		}
		else if(num1==num3) {
			price= 1000+(num1*100);
		}
		else if(num2==num3) {
			price= 1000+(num2*100);
		}
		else {
			int max= (int)(Math.max(num1, Math.max(num2, num3)));
			price= max*100;
		}
		
		System.out.println(price);
			
	}
}

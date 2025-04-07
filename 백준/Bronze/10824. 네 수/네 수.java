import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String d = sc.next();
		
		long ab= Long.parseLong(a+b); //문자열을 정수로 형변환
		long cd= Long.parseLong(c+d);
		
		
		System.out.print(ab + cd);

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//테스트 케이스 개수 t
		int t=sc.nextInt();
		
		for(int i=0; i<t; i++) {
			String str= sc.next();
			String[] num= str.split(","); //콤마로 문자열 나눠줌
			
			int a = Integer.parseInt(num[0]); //문자열을 정수로 형변환
			int b = Integer.parseInt(num[1]);
		
			System.out.println(a+b);
			
		}
	}
}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char arr[][]=new char [5][15];
		
		
		for(int i=0;i<5; i++) {//5개의 단어
			String str=sc.next();
			
			for(int j=0; j<str.length(); j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		
		for(int i=0; i<15;i++) {//세로로 읽을때
			for(int j=0; j<5; j++) {
				if(arr[j][i] != '\0')
					System.out.print(arr[j][i]);
			}
		}
	}

}

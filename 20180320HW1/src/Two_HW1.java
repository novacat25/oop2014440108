import java.util.Scanner;

public class Two_HW1 {

	public static void main(String[] args) {
		System.out.println("2번 문제.");
		
		//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		
		int n;
		
		System.out.println("수 입력 : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		if(n%2 == 0)
			System.out.println("입력한 숫자는 짝수이다.");
		else
			System.out.println("입력한 숫자는 홀수이다.");
		
		System.out.println("---프로그램 종료---");
		
	}

}

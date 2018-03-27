import java.util.Scanner;

public class Four_HW1 {

	public static void main(String[] args) {
		//4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		
		int score; //점수 변수
		
		System.out.println("성적 입력 : ");
		Scanner input = new Scanner(System.in); 
		score = input.nextInt(); //키보드에서 숫자 입력
		
		System.out.println("성적 : " + score + " 점.");
		System.out.print("등급 판정 : ");
		
		if(score >= 80 && score <= 100) //80~100점 구간
			System.out.println("A");
		else if(score >= 60 && score < 80) //60~79점 구간
			System.out.println("B");
		else if(score >= 40 && score < 60) //40~59점 구간
			System.out.println("C");
		else if(score >= 20 && score < 40) //20~39점 구간
			System.out.println("D");
		else if(score >= 0 && score < 20) //0~19점 구간
			System.out.println("E");
		else //100 초과 0 미만의 판정 불가 구간
			System.out.println("판정 불가.(유효하지 않은 점수)");
		
		System.out.println("---프로그램 종료---");
	}

}

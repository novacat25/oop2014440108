import java.util.Scanner; //C언어에서 include의 역할과 비슷.

public class ConditionalStatement {

	public static void main(String[] args) {
		int score, good = 0, bad = 0;
		
		System.out.println("성적 입력 : ");
		Scanner input = new Scanner(System.in); 
		score = input.nextInt(); //키보드에서 숫자 입력
		
		System.out.println("성적 : " + score + " 점.");
		//성적 60점 이상이면 합격, 미만이면 불합격
		//비교 : 관계연산자 (>= 연산자 이용)
		/* 
		*if (조건식) {실행 문장(참일 경우)} else{실행 문장(거짓일 경우)}
		실행 문장이 1문장일 경우 중괄호를 생략하여도 무관.
		복합문(Compound Statement) : 여러 문장을 중괄호 {}로 묶어 하나의 문장으로 처리함.
		 */
		
		if(score >= 60)
		{
			System.out.println("합격.");
			good++;
			
		}
		else
		{
			System.out.println("불합격.");
			bad++;
		}
		
		//합격점만 넘길 경우 B, 80점 이상일 경우 A가 출력되도록 유도함.
		if(score >= 80)
			System.out.println("최종 등급 A");
		else if(score >= 60)
			System.out.println("최종 등급 B");
		//60점 미만일 경우 불합격과 동시에 F 등급이 출력되도록 유도함.
		else 
			System.out.println("최종 등급 F");
		
		//0->없음, 1->하나, 2->둘, 그 외->많음 출력
		
		//case의 경우 꼭 수식 결과가 문자가 될 필요가 없다. 대표적인 예시로 문자를 비교할 때.
		switch(score)
		{
		case 0:
			System.out.println("없음.");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("많음");
			break;
		}
		
		System.out.println("============프로그램 종료.============");
	}

}

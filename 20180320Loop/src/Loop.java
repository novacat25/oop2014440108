
public class Loop {

	public static void main(String[] args) 
	{
		//1~10까지의 정수를 화면에 출력하는 프로그램.
		int i; //루프 변수 선언
		int sum = 0;
		
		i = 1; //1. 루프 변수 초기화
		while(i<=10) //2. 루프 조건식
		{
			System.out.println(i);
			i++; //4. 루프 변수 변화.
		}
		
		System.out.println("for구문을 사용한 같은 반복문.");
		for(i=1;i<=10;i++)
			System.out.println(i);
		//매우 간단하게 정리가 되는 것을 볼 수 있다.
		
		i = 1; //1. 루프 변수 초기화
		while(i<=10) //2. 루프 조건문
		{
			sum = sum + i; //3. 실행문
			i++; //4. 루프 변수 변화
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
		
		String str = "hello darkness my old friend Lemon"; //str은 하나의 '객체'이다.
		int count = 0;
		for(i=0;i < str.length(); i++) //str이라는 객체에 length라는 메소드(함수)를 호출함.
		{
			if(str.charAt(i) != 'l') //str이라는 객체에 charAt(i)라는 메소드(함수)를 호출함.
				//원리 : 반복문이 i를 1씩 증가시켜주며 i번째 글자를 조건문에 대입시킴.
				//조건문대로 i번째 글자가 l과 같으면 count가 1 증가.
				//i번째 글자가 l과 다르면 continue 문을 통해 i < str.length()의 조건문으로 다시 이동.
				continue;
	
			count++;
			
		}
		//결론적으로 Java에서는 메소드 덕분에 프로그램을 비교적 간단하게 구현할 수 있다.

		System.out.println("문장에서 나온 l의 개수 : " + count + "개");
		
		System.out.println("============프로그램 종료.============");
	}
	
}
	
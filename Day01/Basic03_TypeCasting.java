package Java_Basic01;

public class Basic03_TypeCasting {
	public static void main(String[] args) {
		
		
		// 형변환 : 자료형을 바꾸는 것
		
		// 1. 묵시적 형변환
		// - 범위가 작은 자료형 -> 범위가 큰 자료형으로 이사
		int n1 = 100; // 주의할점 : 값이 아니라 데이터 형에 주목.
		long n2 = n1; // 묵시적 형변환.
		
		
		// 2. 명시적 형변환
		// - 범위가 큰 자료형 -> 범위가 작은 자료형으로 이사
		long n3 = 100; //묵시적 형변환이 일어나고 있었음.
		int n4 = (int) n3; // 프로그래머가 명시적으로 바꿔줘야 함.
		
		
		
		// 리터럴
		// - 값을 소스코드상에 적어 놓은 것
		// - 데이터형에 따라서 값의 표기 방법이 다르다.
		// - 100 => int형의 숫자 100
		// - 100L => long형의 숫자 100
		// - 12.321 => double형
		// - 12.321f => float형
		// - "Hello, World!" => String형의 문자열.
		
		int n5 = (int) 12345678901234L;
		long n6 = 12345678901234L;
	}
}
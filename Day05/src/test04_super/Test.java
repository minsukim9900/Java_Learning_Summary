package test04_super;

public class Test {
	public static void main(String[] args) {
		
		//설계도에 생성자를 하나라도 프로그래머가 정의한다면
		//컴파일러가 자동으로 기본 생성자를 만들어주지 않는다.
		Person p = new Person();

		
		Student st = new Student("Park", 28, "Java");
		st.study();
	}
}
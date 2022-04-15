/*클래스로부터 객체 생성*/
public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍킬동";
		s1.age = 18;
		
		Student s2 = new Student();
		s2.name = "강감찬";
		
		System.out.println(s2.name);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s2.age);
	}

}

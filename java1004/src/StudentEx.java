public class StudentEx {
  public static void main(String[] args) {
    Student s1;
    s1 = new Student();
    System.out.println(s1);
    System.out.println("s1 클래스 변수가 Student 객체를 참조합니다.");

    Student s2 = new Student();
    System.out.println(s2);
    System.out.println("s2 클래스 변수가 Student 객체를 참조합니다.");

    Student s3;
//    s3 = new Test1(); // 서로 다른 데이터 타입이므로 Test1 클래스의 객체의 주소를 저장할 수 없음
    s3 = s2; // Student 클래스 타입의 변수 s2는 s3와 동일한 데이터 타입이므로 s3에 s2의 값을 저장할 수 있음
    System.out.println(s3);
    System.out.println("s3 클래스 변수가 Student 객체를 참조합니다.");
  }
}





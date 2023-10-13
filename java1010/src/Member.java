public class Member extends People {
  public int age;

//  Member 클래스는 기본 생성자 사용
//  기본 생성자는 생략해도 상관없음
//  public Member() {
//
//  }

//  클래스에 기본 생성자 대신 다른 생성자를 사용했을 경우 객체 생성 시 반드시 해당 생성자 호출 부분을 구현해야 함
  public Member(int age) {
//    부모 클래스인 People의 생성자를 호출하는 부분이 없기 때문에 오류가 발생함
    super("홍길동", "남자");
    this.age = age;
  }

//  자식 클래스인 Member 클래스의 객체를 생성하기 위해서 Member클래스의 생성자를 호출
//  자식 클래스의 생성자의 첫번째 줄에서 부모 클래스의 생성자를 호출하는 super() 메소드를 실행
//  부모 클래스의 생성자 실행이 완료된 후 자식 생성자의 나머지 작업을 진행함
  public Member(String name, String gender, int age) {
    super(name, gender);
    this.age = age;
  }
}










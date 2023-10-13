package pack1;

//A 클래스와 B 클래스는 pack1이라는 동일한 패키지에 포함됨
public class B {

  public void method() {
//    클래스 A의 생성자 호출
    A a = new A();
//    클래스 A의 필드 사용
    System.out.println(a.field);
    a.field = "pack1의 클래스 B의 method()에서 A의 field 수정";
    System.out.println(a.field);
//    클래스 A의 메소드 사용
    a.method();
  }
}

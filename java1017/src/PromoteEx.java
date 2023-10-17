public class PromoteEx {
  public static void main(String [] args) {
//    부모인 인터페이스 A 타입의 변수 선언
    A a1;
    A a2;
    A a3;
    A a4;

//    조상 인터페이스 타입의 변수에 자손 타입의 객체 저장
    a1 = new B();
    a2 = new C();
    a3 = new D();
    a4 = new E();

//    부모 클래스 타입의 변수에 자식 타입의 객체 저장
    B b1 = new D();
    C c1 = new E();

//    클래스 B와 클래스 E는 상속 관계가 아니기 때문에 오류
//    B b2 = new E();
//    클래스 C와 클래스 D는 상속 관계가 아니기 때문에 오류
//    C c2 = new D();
  }
}

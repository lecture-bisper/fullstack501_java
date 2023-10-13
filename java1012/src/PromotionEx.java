public class PromotionEx {
  public static void main(String[] args) {
//    각각의 객체 생성
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

//    다형성 및 자동 타입 변환에 의해서 부모 타입의 변수에 자식 타입의 객체가 저장됨
//    부모 클래스 A의 객체 a1에 자식 클래스인 B클래스 타입의 객체 b를 대입
    A a1 = b;
//    부모 클래스 A의 객체 a2에 자식 클래스인 C클래스 타입의 객체 c를 대입
    A a2 = c;
//    조상 클래스 A의 객체 a3에 자손 클래스인 D클래스 타입의 객체 d를 대입
    A a3 = d;
//    조상 클래스 A의 객체 a4에 자손 클래스인 E클래스 타입의 객체 e를 대입
    A a4 = e;

//    부모 클래스인 B의 객체 b1에 자손 클래스인 D클래스 타입의 객체 b를 대입
    B b1 = d;
//    부모 클래스인 B의 객체 c1에 자손 클래스인 E클래스 타입의 객체 e를 대입
    C c1 = e;

//    자식 클래스 타입의 객체 e는 부모 클래스가 C클래스이므로 B클래스 타입의 변수에 저장할 수 없음
//    B b2 = e;
//    자식 클래스 타입의 객체 d는 부모 클래스가 B클래스이므로 C클래스 타입의 변수에 저장할 수 없음
//    C c2 = d;
  }
}

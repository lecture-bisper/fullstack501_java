package pack2;

// pack1 패키지에 있는 A 클래스를 로드
import pack1.A;

// A 클래스를 부모 클래스로 하여 필드와 메소드를 상속받음
public class D extends A {

//  A 클래스의 멤버가 모두 protected 접근제한자를 가지고 있음
//  A 클래스를 상속받은 클래스 D 내부에서는 A 클래스의 멤버를 사용할 수 있음
  public D() {
//    클래스 D가 클래스 A를 상속 받으므로 super() 사용 시 부모 클래스인 A의 생성자를 호출
    super();
//    this.field는 A 클래스에서 상속받은 필드 field를 사용
    this.field = "pack1의 클래스 A에서 상속받은 field";
//    this.method는 A 클래스에서 상속받은 메소드 method()를 사용
    this.method();
  }
}

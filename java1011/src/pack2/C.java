package pack2;

// 클래스 C는 pack2에 포함됨
// 클래스 A는 pack1에 포함됨

// pack1에 포함된 클래스 A를 가져옴
import pack1.A;

public class C {

  public void method() {
//    클래스 A의 생성자가 protected 접근제한자로 설정되어 패키지가 다른 클래스 C에서 사용할 수 없음
//    A a = new A();
//    클래스 A의 필드가 protected 접근제한자로 설정되어 패키지가 다른 클래스 C에서 사용할 수 없음
//    System.out.println(a.field);
//    a.field = "pack2의 클래스 C에서 클래스 A의 field 사용";
//    클래스 A의 메소드가 protected 접근제한자로 설정되어 패키지가 다른 클래스 C에서 사용할 수 없음
//    a.method();
  }
}

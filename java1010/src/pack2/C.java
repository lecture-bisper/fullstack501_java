package pack2;

//import pack1.A;
import pack1.B;

// 패키지 pack2 의 클래스 C
// 접근제한자가 public
// 해당 클래스 사용 시 제한이 없음
public class C {
//  pack1 패키지의 클래스 A 사용
//  클래스 A의 접근제한자가 default 이므로 다른 패키지인 클래스 C에서 사용할 수 없음
//  A a;
//  클래스 B의 접근제한자가 public 이므로 다른 패키지인 클래스 C에서 사용할 수 있음
  B b;
}


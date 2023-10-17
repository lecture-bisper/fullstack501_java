//인터페이스 InterC를 부모로 하는 구현 클래스 ImplC
//부모 인터페이스가 가지고 있는 모든 추상 메소드를 구현해야 함
public class ImplC implements InterC{

//  조상 인터페이스 InterA에서 상속받은 methodA()를 오버라이딩
  @Override
  public void methodA() {
    System.out.println("ImplC - methodA() 호출");
  }

//  조상 인터페이스 InterB에서 상속받은 methodB()를 오버라이딩
  @Override
  public void methodB() {
    System.out.println("ImplC - methodB() 호출");
  }

//  부모 인터페이스 InterC에서 상속받은 methodC()를 오버라이딩
  @Override
  public void methodC() {
    System.out.println("ImplC - methodC() 호출");
  }
}

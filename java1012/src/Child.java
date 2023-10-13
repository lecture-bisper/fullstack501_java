// Parent 클래스를 상속받은 자식 클래스
public class Child extends Parent{

//  부모 클래스에서 상속받은 멤버인 method1(), method2를 가지고 있음
  
//  부모 클래스에서 상속받은 멤버 중 method2() 오버라이딩함
  @Override
  public void method2() {
    System.out.println("Child-method2()");
  }

//  자식 클래스인 Child 클래스 전용 메소드
  public void method3() {
    System.out.println("Child-method3()");
  }
}

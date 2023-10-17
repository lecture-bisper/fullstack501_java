//인터페이스 MyInter 를 부모로 사용하는 클래스 ClassC
public class ClassC implements MyInter{
//  부모인 MyInter에서 상속받은 메소드는 추상메소드 method1(), 디폴트 메소드 method3() 임
//  추상 메소드는 자식 클래스에서 반드시 오버라이딩하여 구현해야 함
//  디폴트 메소드는 일반적인 메소드이기 때문에 오버라이딩을 하지 않아도 상관없음
//  디폴트 메소드는 상속받은 그대로 사용해도 되고, 오버라이딩하여 사용해도 됨

//  MyInter에서 상속받은 method1() 추상 메소드를 오버라이딩하여 구현함
  @Override
  public void method1() {
    System.out.println("ClassC - method1() 호출");
  }

//  method3()은 인터페이스에서 상속받은 디폴트 메소드이므로 그냥 사용하거나 오버라이딩해서 사용 가능
//  @Override
//  public void method3() {
//    System.out.println("ClassC - method3() 호출");
//  }

//  method3()을 오버라이딩하여 추상 메소드를 변환해서 자식 클래스에서 구현하도록 해도 상관없음
//  @Override
//  public abstract void method3();
}











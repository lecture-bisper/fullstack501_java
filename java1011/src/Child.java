// 부모 클래스 Parent에서 필드 및 메소드를 상속받은 자식 클래스 Child
public class Child extends Parent{

//  부모 클래스 Parent에서 상속받은 메소드 method1(), method2()가 존재함
//  method1()은 부모 클래스에서 상속받은 그대로 수정없이 사용하기 때문에 입력된 내용이 없어도 사용 가능
  
//  부모 클래스에서 상속받은 method2()를 자식 클래스 전용으로 오버라이딩하여 사용
  @Override
  public void method2() {
    System.out.println("Child 클래스의 method2() 실행");
  }

//  자식 클래스 Child 전용 메소드
  public void method3() {
    System.out.println("Child 클래스의 method3() 실행");
  }

  public void method4() {
//    this를 사용하여 Child 클래스 타입의 객체의 멤버인 method2()를 호출
//    Child 클래스에서 오버라이딩한 메소드 method2()를 호출
    this.method2();
  }

  public void method5() {
//    super를 사용하여 부모 클래스인 Parent의 멤버인 method2()를 호출
    super.method2();
  }
}







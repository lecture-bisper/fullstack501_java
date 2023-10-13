//부모 클래스인 Parent를 상속받은 Child 클래스
public class Child extends Parent{

//  상속받은 필드 field1이 존재함
  
//  Child 클래스 전용 필드인 field2를 선언
  public String field2;

//  상속받은 메소드 method1, method2 가 존재함
  
//  Child 클래스 전용 메소드인 method3() 선언
  public void method3() {
    System.out.println("Child - method3()");
  }
}

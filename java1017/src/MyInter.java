// 부모가 되는 인터페이스
public interface MyInter {
//  기능을 위한 추상 메소드 선언
  public abstract void method1();

//  추가된 기능을 위한 추상 메소드 선언
//  public abstract void method2();

//  추가된 기능을 위한 디폴트 메소드 선언
  public default void method3() {
    System.out.println("MyInter - method3() 호출");
  }


}

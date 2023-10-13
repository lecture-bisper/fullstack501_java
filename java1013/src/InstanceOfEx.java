public class InstanceOfEx {

//  매개변수를 부모 클래스 타입으로 사용함
  public static void method1(Parent2 parent2) {
//    매개변수로 받은 객체의 원본 타입이 자식 클래스 타입인지 확인
    if (parent2 instanceof Child2) {
//      매개변수로 받은 객체를 자식 클래스 타입으로 강제 타입 변환
      Child2 child2 = (Child2) parent2;
      System.out.println("method1 - Child2로 변환 성공");
    }
    else {
      System.out.println("method1 - Child2로 변환되지 않음");
    }
  }

//  매개변수를 부모 클래스 타입으로 사용함
  public static void method2(Parent2 parent2) {
//      매개변수로 받은 객체를 자식 클래스 타입으로 강제 타입 변환
    Child2 child2 = (Child2) parent2;
    System.out.println("method2 - Child2로 변환 성공");
  }

  public static void main(String[] args) {
//    부모 클래스 타입으로 변수 선언
//    자식 클래스 객체 생성 후 부모 클래스 타입의 변수에 저장
    Parent2 parentA = new Child2(); // 원본이 자식 클래스 타입
    method1(parentA);
    method2(parentA);

//    부모 클래스 타입으로 변수 선언
//    부모 클래스 객체 생성 후 부모 클래스 타입의 변수에 저장
    Parent2 parentB = new Parent2(); // 원본이 부모 클래스 타입
    method1(parentB);
//    method2(parentB);
  }
}












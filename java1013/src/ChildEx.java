public class ChildEx {
  public static void main(String[] args) {

//    부모 클래스 타입의 객체 생성
    Parent parent = new Parent();
//    부모 클래스 타입의 인스턴스 멤버 사용
    parent.field1 = "parent data1";
    parent.method1();
    parent.method2();

    System.out.println("----------------");

//    자식 클래스인 Child 클래스 타입의 객체 생성
    Child child = new Child();
//    부모 클래스에서 상속받은 인스턴스 멤버 사용
//    자식 클래스 전용 인스턴스 멤버도 함께 사용
    child.field1 = "child data1"; // 상속받음
    child.field2 = "child data2"; // 전용 멤버, 전용 멤버에 데이터 저장
    child.method1(); // 상속받음
    child.method2(); // 상속받음
    child.method3(); // 전용 멤버
    System.out.println(child.field2);

    System.out.println("----------------");
//   부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장
//    부모 클래스 타입의 인스턴스 멤버만 사용이 가능함
//    부모 클래스 타입의 변수에 저장된 알맹이는 자식 클래스의 객체임
    parent = child;
    parent.field1 = "child data1"; // 부모의 인스턴스 멤버
//    parent.field2 = "child data2"; // 자식의 인스턴스 멤버, 사용 불가, 숨겨짐
    parent.method1(); // 부모의 인스턴스 멤버
    parent.method2(); // 부모의 인스턴스 멤버
//    parent.method3(); // 자식의 인스턴스 멤버, 사용 불가

    System.out.println("----------------");

//    자식 클래스 타입의 변수에 변환되었던 부모 클래스 타입의 객체를 다시 자식 클래스 타입의 객체로 강제 타입 변환 후 저장
//    자식 클래스 타입의 인스턴스 멤버를 모두 사용할 수 있음
    Child child2 = (Child) parent;
    System.out.println(child2.field2);
    child2.field1 = "child data1"; // 상속 받음
    child2.field2 = "child data2"; // 전용 멤버
    child2.method1(); // 상속 받음
    child2.method2(); // 상속 받음
    child2.method3(); // 전용 멤버


  }
}

package pack1;

public class BB {
  public void execute() {
//    생성자 호출
//    AA 클래스 타입의 변수 aa 선언 및 객체 생성
//    생성자의 접근제한자가 public, 객체 생성 성공
    AA a1 = new AA();
//    생성자의 접근제한자가 default, 객체 생성 성공
    AA a2 = new AA("접근제한자 default");
//    생성자의 접근제한자가 private, 객체 생성 실패, 생성자 호출 안됨
//    AA a3 = new AA(100);
    AA a4; // 해당 클래스 타입으로 변수 생성은 가능

//    인스턴스 필드 사용
//    필드의 접근제한자가 public, 사용에 제한이 없음
    System.out.println(a1.publicField);
//    필드의 접근제한자가 default, 동일한 패키지 내에서 사용에 제한이 없음
    System.out.println(a1.defaultField);
//    필드의 접근제한자가 private, 해당 객체 안에서만 사용할 수 있음, 외부에서는 사용 불가
//    System.out.println(a1.privateField);

//    메소드 사용
//    메소드의 접근제한자가 public, 사용에 제한 없음
    a1.publicMethod();
//    메소드의 접근제한자가 default, 동일한 패키지 내에서 사용에 제한이 없음
    a1.defaultMethod();
//    메소드의 접근제한자가 private, 해당 객체 안에서만 사용할 수 있음
//    a1.privateMethod();
    a1.print();
  }
}










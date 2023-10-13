package pack2;

import pack1.AA;

public class CC {
  public void execute() {
//    pack1 패키지의 AA 클래스 사용, 생성자 사용
//    생성자의 접근제한자가 public, 다른 패키지에서 사용 시 제한 없음
    AA a1 = new AA();
//    생성자의 접근제한자가 default, 다른 패키지에서 사용 불가
//    AA a2 = new AA("pack2에서 AA 클래스 사용");
//    생성자의 접근제한자가 private, 외부에서 사용 불가
//    AA a3 = new AA(100);

//    필드 사용
//    필드의 접근제한자가 public, 다른 패키지에서 사용 시 제한 없음
    System.out.println(a1.publicField);
//    필드의 접근제한자가 default, 다른 패키지에서 사용 불가
//    System.out.println(a1.defaultField);
//    필드의 접근제한자가 private, 외부에서 사용 불가
//    System.out.println(a1.privateField);

//    메소드 사용
//    메소드의 접근제한자가 public, 다른 패키지에서 사용 가능
    a1.publicMethod();
//    메소드의 접근제한자가 default, 다른 패키지에서 사용 불가
//    a1.defaultMethod();
//    메소드의 접근제한자가 private, 외부에서 사용 불가
//    a1.privateMethod();
//    메소드의 접근제한자가 public, public인 멤버를 통해서 일반적으로 접근이 불가능한 필드, 메소드를 우회해서 사용함
    a1.print();

  }
}










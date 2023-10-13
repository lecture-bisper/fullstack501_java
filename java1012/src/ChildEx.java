public class ChildEx {
  public static void main(String[] args) {
//    Child child = new Child();
//
//    Parent parent = child;
//
//    parent.method1();
//    parent.method2();
////    parent.method3();

    Parent p = new Parent();
    p.method1();
    p.method2();

    System.out.println("-----");

    Child c = new Child();
    c.method1();
    c.method2();
    c.method3();

    System.out.println("-----");

    p = c;
    p.method1();
    p.method2();
  }
}

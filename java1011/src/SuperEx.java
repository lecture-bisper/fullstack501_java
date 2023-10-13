public class SuperEx {
  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();

    parent.method1();
    parent.method2();

    System.out.println();

    child.method1();
    child.method2();
    child.method3();

    System.out.println();

    child.method4();
    child.method5();
  }
}

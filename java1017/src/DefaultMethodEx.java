public class DefaultMethodEx {
  public static void main(String [] args) {
    MyInter mi1 = new ClassA();
    mi1.method1();

    MyInter mi2 = new ClassB();
    mi2.method1();
    mi2.method3();

    MyInter mi3 = new ClassC();
    mi3.method1();
    mi3.method3();
  }
}

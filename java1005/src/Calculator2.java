public class Calculator2 {
  public void sum() {
    int x = 10;
    int y = 20;
    int result = x + y;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
  }

  public void sub() {
    int x = 10;
    int y = 20;
    int result = x - y;
    System.out.println("두 수의 뺄셈은 " + result + "입니다.");
  }

  public void multi() {
    int x = 10;
    int y = 20;
    int result = x * y;
    System.out.println("두 수의 곱셈은 " + result + "입니다.");
  }

  public void div() {
    int x = 10;
    int y = 3;
    double result = x / (double)y;
    System.out.println("두 수의 나눗셈은 " + result + "입니다.");
  }
}

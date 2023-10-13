public class Calculator3 {
  public void sum(int x, int y) {
    int result = x + y;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
  }

  public int sub() {
    int x = 10;
    int y = 3;
    int result = x - y;
    return result;
  }

  public int multi(int x, int y) {
    int result = x * y;
    return result;
  }

  public void div() {
    int x = 10;
    int y = 3;
    double result = x / (double)y;
    System.out.println("두 수의 나눗셈은 " + result + "입니다.");
  }
}

public class Calculator5Ex {
  public static void main(String[] args) {
    Calculator5 cal = new Calculator5();

    cal.sum();
    cal.sum(10);
    cal.sum(10, 20);
    cal.sum(10.0, 20.0);
    cal.sum(10, 20.0);
    cal.sum(10.0, 20);
  }
}

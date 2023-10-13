public class ComputerEx {
  public static void main(String[] args) {
    int r = 10;

    Calculator cal = new Calculator();
    System.out.println("원면적 : " + cal.areaCircle(10));

    System.out.println("\n---------------------\n");

    Computer com = new Computer();
    System.out.println("원면적 : " + com.areaCircle(10));
    System.out.println("곱셈 : " + com.multi(10, 20));
  }
}

public class Calculator5 {
//  메소드 오버로딩 : 생성자 오버로딩과 같이 동일한 이름의 메소드를 여러개 선언한 것을 뜻함
//  - 메소드의 매개변수의 개수, 타입, 순서에 따라서 가능함
  
//  메소드의 개수에 따른 오버로딩
  public void sum() {
    int num1 = 10;
    int num2 = 20;
    int result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }

  public void sum(int num1) {
    int num2 = 20;
    int result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }

  public void sum(int num1, int num2) {
    int result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }

//  매개변수의 타입에 의한 오버로딩
  public void sum(double num1, double num2) {
    double result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }

//  오버로딩을 사용하지 않을 경우 메소드의 이름을 목적에 맞게 지정해야 하는 불편함이 발생함
  public void doubleSum(double num1, double num2) {
    double result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }

  public void intSum(int num1, int num2) {
    int result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }

//  매개변수의 타입 순서에 따른 오버로딩
  public void sum(int num1, double num2) {
    double result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }

  public void sum(double num1, int num2) {
    double result = num1 + num2;
    System.out.println("num1 + num2 = " + result);
  }
}











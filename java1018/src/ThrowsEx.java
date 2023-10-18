import java.util.Scanner;

public class ThrowsEx {
  public static void main(String[] args) {
//    throws 를 통해서 넘겨 받은 예외를 처리하는 try ~ catch 문
    try {
      findClass();
      int result = div();
      System.out.println("두 수의 나눗셈은 " + result + "입니다.");
    }
    catch (ClassNotFoundException e) {
      System.out.println(e.getMessage() + " 클래스가 존재하지 않습니다.");
    }
    catch (ArithmeticException e) {
      System.out.println("0 으로는 나눌 수 없습니다.");
    }
  }

//  throws : 특정 메소드 안에서 발생하는 예외를 처리하기 위한 예외처리구문을 해당 메소드 안에서 처리하는 것이 아니라 해당 메소드는 호출하는 위치에서 예외처리를 하도록 지시하는 명령어

//  throws 를 통해서 해당 메소드를 호출한 곳으로 예외처리를 떠넘김
  public static void findClass() throws ClassNotFoundException {
//    예외가 발생할 수 있는 소스 코드, try ~ catch 를 사용하지 않음
    Class clazz = Class.forName("java.lang.String");

//    try {
//      Class clazz = Class.forName("java.lang.String2");
//    } catch (ClassNotFoundException e) {
//      System.out.println(e.getMessage());
////      e.printStackTrace();
////      강제로 예외 발생시키기
////      throw new RuntimeException(e);
//    }
  }

  public static int div() throws ArithmeticException {
    Scanner sc = new Scanner(System.in);
    int result = 0;

    System.out.print("첫번째 숫자를 입력하세요 : ");
    int num1 = sc.nextInt();
    System.out.print("두번째 숫자를 입력하세요 : ");
    int num2 = sc.nextInt();

    result = num1 / num2;

//    try {
//      System.out.print("첫번째 숫자를 입력하세요 : ");
//      int num1 = sc.nextInt();
//      System.out.print("두번째 숫자를 입력하세요 : ");
//      int num2 = sc.nextInt();
//
//      result = num1 / num2;
//    }
//    catch (ArithmeticException e) {
//      System.out.println("0 으로는 나눌 수 없습니다.");
//    }

    return result;
  }
}









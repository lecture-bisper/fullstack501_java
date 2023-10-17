import java.util.Scanner;

public class MultiCatchEx {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("배열의 크기를 입력하세요 : ");
    int size = sc.nextInt();
    System.out.print("index 번호를 입력하세요 : ");
    int index = sc.nextInt();

    System.out.print("첫번째 숫자를 입력하세요 : ");
    int num1 = sc.nextInt();
    System.out.print("두번째 숫자를 입력하세요 : ");
    int num2 = sc.nextInt();

    int[] iArr = null;

    try {
      iArr = new int[size];
      for (int i = 0; i < iArr.length; i++) {
        iArr[i] = (i + 1) * 10;
      }

      for (int i = 0; i < index; i ++) {
        System.out.println("배열 iArr[" + i + "] : " + iArr[i]);
      }

      int result = num1 / num2;
      System.out.println("두 수의 나눗셈은 " + result + "입니다.");

      Class clazz = Class.forName("java.lang.String2");
    }
//    다중 catch 문
//    하나의 try 문에 여러개의 catch 문을 사용하는 방식
//    try 문에서 발생할 수 있는 오류의 종류가 여러가지일 경우 각각 다른 예외처리를 하고자 할 때 사용
//    최상위 예외 클래스인 Exception은 가장 아래에 배치
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 최대 index 범위를 넘어갔습니다.");
    }
    catch (ArithmeticException e) {
      System.out.println("0으로는 나눌 수 없습니다.");
    }
    catch (Exception e) {
      System.out.println("오류가 발생했습니다.");
    }

    System.out.println("\n ----- 프로그램 종료 ----- \n");

  }
}

import java.util.Scanner;

public class BreakContinueEx {
  public static void main(String [] args) {
//    break : 제어문 내부에서 동작하며 현재 제어문을 즉시 종료하는 명령어
//    continue : 반복문 내부에서 동작하며 현재 루프를 종료하고 다음 루프를 실행하는 명령어
//    사용법 :
//    반복문 {
//      break;
//    }
//    반복문 {
//      continue;
//    }

    System.out.println("\n ----- break ----- \n");

    int dan = 5;

    for (int i = 1; i < 10; i++) {
      if (i == 5) {
//        break를 만나서 반복문이 즉시 종료
        break;
      }
      System.out.println(dan + " * " + i + " = " + (dan * i));
    }

    System.out.println("\n ----- continue ----- \n");

    for (int i = 1; i < 10; i++) {
      if (i == 5) {
//        continue를 만나서 현재 루프만 종료, 다음 루프로 이동
        continue;
      }
      System.out.println(dan + " * " + i + " = " + (dan * i));
    }

//    문제 6) 구구단을 2 ~ 9단까지 모두 출력하는 프로그램을 작성하세요
//    * 사용자 입력을 통해서 숫자(2 ~ 9) 하나를 입력받고, 해당 단수의 구구단을 제외하고 모두 출력

    Scanner sc = new Scanner(System.in);
    System.out.print("숫자를 입력해 주세요 : ");
    int dansu = sc.nextInt();

    int i = 1;

    while (i < 10) {
      if (dansu == i) {
        i++; // continue를 사용 시 현재 루프를 종료하고 다음 루프로 이동하기 때문에 아래에 있는 증감식이 동작하지 않아서 초기화 변수의 값이 더이상 변경되지 않아서 무한 루프에 빠질 수 있기 때문에 증감식을 추가함
        continue;
      }

      System.out.println("----- " + i + "단 -----");
      int j = 1;

      while (j < 10) {
        System.out.println(i + " * " + j + " = " + (i * j));
        j++;
      }
      i++;
    }
    
//    문제 7) 사용자 입력을 통해서 숫자(2 ~ 9) 하나를 입력받고, 해당 단수의 구구단에서 구구단 출력을 멈추는 프로그램을 작성하세요

    System.out.print("숫자를 입력해주세요 : ");
    dansu = sc.nextInt();

    for (int a = 2; a < 10; a++) {
      if (dansu == a) {
        continue;
      }

      System.out.println("----- " + a + "단 -----");

      for (int b = 1; b < 10; b++) {
        System.out.println(a + " * " + b + " = " + (a * b));
      }
    }
  }
}















import java.util.Scanner;

public class ForEx {
  public static void main(String [] args) {
    System.out.println("\n ----- for ----- \n");

//    for : 자바에서 가장 많이 사용되는 반복문
//    - 초기화변수, 조건식, 증감식을 for문 시작 시에 모두 설정하고 사용함
//    - 초기화 변수는 최초 1번 실행, 조건식, 반복 코드 블록, 증감식을 순서대로 계속 반복 실행함
//    - 코드 블록에서는 조건식의 결과가 true일 경우 반복 실행할 소스만 입력
//    - for에서 사용한 초기화 변수는 for문이 종료 시 삭제됨
//      - for에서 사용한 초기화 변수는 for 외부에서 사용 가능, 같은 이름의 초기화 변수를 다른 for 에서 사용할 수 있음
//    사용법 :
//    for (초기화변수 선언 ; 조건식 ; 증감식) {
//      조건식의 결과가 true일 경우 실행할 소스코드 ...
//    }

    for (int i = 1; i < 11; i++) {
      System.out.println("i : " + i);
    }

    System.out.println("\n ----- while문 사용 시 -----\n");

    int treeHit = 0;

    while (treeHit < 10) {
      treeHit++;
      System.out.println("나무를 " + treeHit + "번 찍었습니다.");
      if (treeHit == 10) {
        System.out.println("나무가 넘어갑니다.");
      }
    }

    System.out.println("\n ----- for문 사용 시 -----\n");

    for (int i = 1; i < 11; i++) {
      System.out.println("나무를 " + i + "번 찍었습니다.");
      if (i == 10) {
        System.out.println("나무가 넘어갑니다.");
      }
    }

//    문제 2 ) 1 ~ 10까지의 총합을 구하는 프로그램을 for문을 사용하여 작성하세요
//    ps - 총합을 저장하는 변수는 for 외부에 존재

    System.out.println("\n ----- 문제 2 ----- \n");

//    총합을 저장할 변수, for 외부에 선언
    int total = 0;

    for (int i = 1; i < 11; i++) {
      total = total + i;
      System.out.println("현재까지의 합 : " + total);
    }

    System.out.println("총합 : " + total);

//    문제 3) 사용자 키보드 입력을 받아서 지정한 단수의 구구단을 출력하는 프로그램을 작성하세요

    System.out.println("\n----- 문제 3 -----\n");

    System.out.print("출력할 단수의 구구단을 입력하세요 >> ");
    Scanner sc = new Scanner(System.in);
    int dan = sc.nextInt();

    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " * " + i + " = " + (dan * i));
    }

//    문제 4) 아래의 모양과 같은 모양을 화면에 출력하세요
//    *
//    **
//    ***
//    ****
//    *****

    System.out.println("\n----- 문제 4 -----\n");

    String str4 = "";

    for (int i = 0; i < 5; i++) {
      str4 = str4 + "*";
      System.out.println(str4);
    }

    System.out.println("\n ----- 중첩 제어문 ----- \n");

//    중첩 제어문 : 제어문 안에 제어문을 추가로 사용하는 제어문
//    중첩 반복문 : 반복문 안에 반복문을 사용하는 반복문, 다 차원 배열을 출력할 때 많이 사용함
//    - 외부의 반복문이 한번 반복을 진행할 때 내부의 반복문은 전체 반복을 진행함

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i : " + i + ", j : " + j);
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int h = 0; h < 3; h++) {
          System.out.println("i : " + i + ", j : " + j + ", h : " + h);
        }
      }
    }
    
    
//    문제 5 ) 2중 반복문을 사용하여 구구단을 2 ~ 9단까지 모두 출력하는 프로그램을 작성하세요
//    ps ) for문을 사용하는 방식, while문을 사용하는 방식 둘 다 출력

    System.out.println("\n ----- 문제 5 ----- \n");

    System.out.println("\n ----- for 사용 -----");
    for (int i = 2; i < 10; i++) {
      System.out.println("----- " + i + "단 -----");
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
    }

    System.out.println("\n ----- while 사용 -----");

//    외부 while문의 초기화 변수 선언
    int dansu = 2;

    while (dansu < 10) {
      System.out.println("----- " + dansu + "단 -----");
//      내부 while문의 초기화 변수 선언
      int num = 1;

      while (num < 10) {
        System.out.println(dansu + " * " + num + " = " + dansu * num);
//        내부 while문의 증감식
        num++;
      }
//      외부 while문의 증감식
      dansu++;
    }
  }
}
















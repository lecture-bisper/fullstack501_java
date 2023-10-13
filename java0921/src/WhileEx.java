public class WhileEx {
  public static void main(String[] args) {
    System.out.println("\n ----- while ----- \n");

//    while : 자바에서 제공하는 기본 반복문
//    - 조건에 따라 반복을 계속 진행할지 결정할때 사용
//    - 초기화 변수를 while문 밖에 선언하고, 증감식을 while문 안에서 실행하는 형태의 반복문
//    - 증감식을 생략 시 무한 루프가 발생함
//    - while문 탈출 조건을 반드시 입력해야 함 (무한 루프에 빠짐)
//    - 증감식의 위치에 따라 출력되는 결과가 달라짐
//    - 반복 실행되는 코드 블록 안에서 선언 변수는 반복 실행 시 마다 새로 생성됨

//    사용법 :
//    초기화 변수 선언;
//    while (조건식) {
//      조건식의 결과가 true일 경우 실행할 소스코드;
//      증감식;
//    }

//    초기화 변수 선언
    int count = 0;

//    반복문 while 실행, 조건식 설정
    while (count < 10) {
//      조건식이 true일 경우 실행할 소스코드
      System.out.println("count = " + count);
//      증감식
      count++;
    }

    System.out.println("\n ----- while 주의사항 ----- \n");

    int treeHit = 0;

    while (treeHit < 10) {
//      treeHit++;

      System.out.println("나무를 " + treeHit + "번 찍었습니다.");

//      treeHit++;

      if (treeHit == 10) {
        System.out.println("나무가 넘어갑니다.");
      }

      treeHit++;
    }


//    문제 1) 1 ~ 10까지의 총합을 구하는 프로그램을 while문을 이용하여 작성하세요
//    ps ) 총합을 저장하는 변수는 while문 밖에 있어야 함

    int num = 1;
    int total = 0;

    while (num < 11) {
      total = total + num;
      num++;
    }

    System.out.println("총합 : " + total);

    System.out.println("\n ----- do ~ while ----- \n");

//    do ~ while : 기본적으로 while문과 동일하지만 무조건 1번은  실행하는 while문
//    - 반복 조건을 나중에 확인 (반복 조건의 결과가 false가 되어도 무조건 1번은 실행됨)
//    - while문과 동일하게 초기화변수는 while문 외부에 선언하고, 증감식은 while문 내부에서 실행함
//    사용법:
//    초기화 변수 선언
//    do {
//      반복 실행할 소스코드 ...
//      증감식
//    } while (조건식);

    int hitTree = 0;

    do {
      hitTree++;

      System.out.println("나무를 " + hitTree + "번 찍었습니다.");

      if (hitTree == 10) {
        System.out.println("나무가 넘어갑니다.");
      }
    } while (hitTree < 10);


    int i = 2;
    int j = 1;

    while (i < 10) {
      System.out.println("----- " + i + " 단 -----");

      while (j < 10) {
        System.out.println(i + " * " + j + " = " + (i * j));
        j++;
      }
      j = 1;
      i++;
    }
  }
}











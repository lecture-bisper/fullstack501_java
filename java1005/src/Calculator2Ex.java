import java.util.Scanner;

public class Calculator2Ex {
  public static void main(String[] args) {
    Calculator2 cal = new Calculator2();

    cal.sum();
    cal.sub();
    cal.multi();
    cal.div();

//    문제 1) 계산을 하기 위한 Calculator3 클래스를 생성하고, 사칙 연산을 하기 위한 메소드를 생성 후 계산을 진행하는 프로그램을 작성하세요
//    - 메소드명 : sum (2번 방식), sub (3번 방식), multi (4번 방식), div (1번 방식)
//    - 출력 예시 : "두 수의 덧셈은 xx 입니다."
    Calculator3 cal3 = new Calculator3();
    cal3.sum(10, 3);
    int result = cal3.sub();
    System.out.println("두 수의 뺄셈은 " + result + "입니다.");
    result = cal3.multi(10, 3);
    System.out.println("두 수의 곱셈은 " + result + "입니다.");
    cal3.div();

//    문제 2) 사용자에게서 국어, 영어, 수학 점수를 각각 입력받고 총점과 평균을 구한 후 평균 점수에 따라서 등급을 출력하는 프로그램을 작성하세요
//    - A : 90점 이상, B : 80점 이상, C : 70점 이상, D : 60점 이상, F : 60점 미만
//    - 출력 예제 : "당신의 총점은 xxx점이고, 평균은 xx점이며, 등급은 X 입니다."
    System.out.println("\n ----- 문제 2 ----- \n");

    int kor = 0;
    int eng = 0;
    int math = 0;

    int total = 0;
    double avg = 0.0;
    String level = "F";

    Scanner sc = new Scanner(System.in);

    System.out.print("국어 점수를 입력해 주세요 : ");
    kor = sc.nextInt();

    System.out.print("영어 점수를 입력해 주세요 : ");
    eng = sc.nextInt();

    System.out.print("수학 점수를 입력해 주세요 : ");
    math = sc.nextInt();

    total = kor + eng + math;
    avg = total / 3;

    if (avg >= 90) {
      level = "A";
    }
    else if (avg >= 80) {
      level = "B";
    }
    else if (avg >= 70) {
      level = "C";
    }
    else if (avg >= 60) {
      level = "D";
    }

    System.out.println("당신의 총점은 " + total + " 점이고, 평균은 " + avg + "이며, 등급은 " + level + "입니다." );

//    문제 3) 위의 문제 2번을 메소드를 사용하는 방식으로 수정하세요
//    - 클래스명 : Grade.java
//    - 메소드명 : gradeCal (등급 계산 메소드), inputScore (사용자 점수 입력 받기 메소드)
    System.out.println("\n ----- 문제 3 ----- \n");
//    객체 생성
    Grade grade = new Grade();
//    1. 점수 입력
//    2. 총점 계산
    int totalScore = grade.inputScore();
//    3. 평균 계산
    int avgScore = totalScore / 3;
//    4. 등급 계산
    String levelScore = grade.gradeCal(avgScore);
//    5. 화면 출력
    System.out.println("당신의 총점은 " + totalScore + "점이고, 평균은 " + avgScore + "점이며, 등급은 " + levelScore + "입니다.");
    
//    문제 4) 사용자 입력을 통해서 출력하고자 하는 구구단의 단수를 입력받고 해당 단수의 구구단을 출력하는 프로그램을 작성하세요
    System.out.println("\n ----- 문제 4 ----- \n");

    System.out.print("출력할 구구단의 단수를 입력해 주세요 : ");
    int dan = sc.nextInt();

    System.out.println("----- " + dan + " -----");

    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " * " + i + " = " + dan * i);
    }

//    문제 5) 위의 문제 4번을 활용하여 메소드를 사용하여 지정한 단수의 구구단을 출력하는 프로그램을 작성하세요
//    - 클래스명 : Gugudan
//    - 메소드명 : inputDansu (키보드 입력), outputGugudan (구구단 출력)
    System.out.println("\n ----- 문제 5 ----- \n");

    Gugudan gugudan = new Gugudan();
//    1. 출력할 구구단 단수 키보드로 입력받기
    int dansu = gugudan.inputDansu();
//    2. 입력받은 단수의 구구단 출력하기
    gugudan.outputGugudan(dansu);



//    문제 6) 책 184페이지 1번 문제 풀기
//    문제 7) 책 184페이지 2번 문제 풀기
  }
}











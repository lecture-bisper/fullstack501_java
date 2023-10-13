import java.util.Scanner;

public class Quiz {
  public static int[] quiz01() {
    //    문제1 ) 크기가 10 인 배열 scores를 선언하고 각각의 점수를 사용자 키보드 입력을 통해서 입력받은 후 scores에 저장하고, 해당 배열의 총합 및 평균을 구하는 프로그램을 작성하세요
    
//    배열의 크기가 10인 배열 선언
    int [] scores = new int[10];

//    사용자 키보드 입력을 위한 Scanner 객체 선언
    Scanner sc = new Scanner(System.in);

//    사용자 입력 수 확인용 변수, 배열의 index로 사용할 변수
    int count = 0;

//    반복문을 무한 반복
    while (true) {
      count++;
      System.out.print((count) + " 번째 숫자를 입력하세요 (00 입력 시 종료) >> ");
//      사용자 입력
      String inputData = sc.next();

      if (count >= scores.length) {
//        입력 받은 문자열을 정수로 변환
        int num = Integer.parseInt(inputData);
//        배열의 지정된 index 에 입력받은 데이터 저장
//        index 번호를 가지고 있는 변수 count가 시작부터 1이기 때문에 0 번 index에 접근하기 위해서 -1을 추가함
        scores[count - 1] = num;

        System.out.println("종료 합니다.");
        break; // while문 종료
      }
//      입력된 데이터가 00일 경우 바로 종료
      else if (inputData.equals("00")) {
        System.out.println("종료 합니다.");
        break; // while문 종료
      }
//      배열에 데이터 저장
      else {
        int num = Integer.parseInt(inputData);
        scores[count - 1] = num;
      }
    }

    int total = 0;

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }

    double avg = total / scores.length;

    System.out.println("배열의 총합은 " + total + "이고, 평균은 " + avg + "입니다.");

    return scores;
  }

  public static void quiz02(int[] scores) {
    //    문제2) 해당 총합 및 평균을 저장한 배열을 활용하여 각 등급을 출력하는 프로그램을 작성하세요
//    A : 90이상, B : 80점 이상, C : 70점 이상, D : 60점 이상, F = 60점 미만

    int total = 0;
    double avg = 0.0;
    String grade = "F";

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }

    avg = total / scores.length;

    if (avg >= 90) {
      grade = "A";
    }
    else if (avg >= 80) {
      grade = "B";
    }
    else if (avg >= 70) {
      grade = "C";
    }
    else if (avg >= 60) {
      grade = "D";
    }
    else {
      grade = "F";
    }

    System.out.println("점수의 총합은 " + total + "점이고, 평균은 " + avg + "점이고, 등급은 " + grade + " 입니다.");
  }

  public static void quiz03(int[] scores) {
    //    문제 3) 배열 scores의 내용을 반복문을 사용하여 모두 출력하는 프로그램을 작성하세요
//    ps ) 등급이 C 이상인 학생의 점수 및 등급을 출력하세요
    String grade = "F";

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 90) {
        grade = "A";
      }
      else if (scores[i] >= 80) {
        grade = "B";
      }
      else if (scores[i] >= 70) {
        grade = "C";
      }
      else if (scores[i] >= 60) {
        grade = "D";
      }
      else {
        grade = "F";
      }

      if (scores[i] >= 70) {
        System.out.println((i + 1) + "번 학생의 점수는 " + scores[i] + "점이고, 등급은 " + grade + "입니다.");
      }
    }
  }
  public static void main (String [] args) {
    System.out.println("\n ----- 문제 1 -----\n");

    int [] result = quiz01();

    System.out.println("\n ----- 문제 2 -----\n");

    quiz02(result);

    System.out.println("\n ----- 문제 3 -----\n");

    quiz03(result);
  }
}

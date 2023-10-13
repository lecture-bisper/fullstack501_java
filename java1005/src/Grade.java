import java.util.Scanner;

//문제 3번 풀이 클래스
public class Grade {
//  평균 점수를 기준으로 등급을 계산
  public String gradeCal(int avg) {
    String level = "F";

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

    return level;
  }

//  사용자의 점수를 입력 받기
  public int inputScore() {
    Scanner sc = new Scanner(System.in);
//    int kor = 0;
//    int eng = 0;
//    int math = 0;

    System.out.print("국어 점수를 입력해 주세요 : ");
    int kor = sc.nextInt();

    System.out.print("영어 점수를 입력해 주세요 : ");
    int eng = sc.nextInt();

    System.out.print("수학 점수를 입력해 주세요 : ");
    int math = sc.nextInt();

    return kor + eng + math;
  }
}

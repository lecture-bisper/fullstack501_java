package quiz;

import java.util.Scanner;

public class RectArray {
  public static void main(String[] args) {
//    1. 사용자 키보드 입력을 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);
//    2. 너비와 높이를 입력 받기 X 4 (Rect 타입의 배열 생성)
    Rect[] rects = new Rect[4];

//    너비와 높이를 입력받기 위한 변수 선언
    int width = 0;
    int height = 0;

//    배열의 크기만큼 객체를 반복 생성하기 위한 반복문
    for (int i = 0; i < rects.length; i++) {
      System.out.print((i + 1) + " 너비와 높이 >> ");
      width = sc.nextInt();
      height = sc.nextInt();

      rects[i] = new Rect(width, height);
    }
    System.out.println("저장하였습니다.");

//    3. 각각를 모두 합하여 넓이의 총합 구하기
    int total = rects[0].getArea() + rects[1].getArea() + rects[2].getArea() + rects[3].getArea();
//    4. 넓이의 총합 출력하기
    System.out.println("사각형의 전체 합은 " + total);
  }
}

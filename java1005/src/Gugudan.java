import java.util.Scanner;

public class Gugudan {
  Scanner sc = new Scanner(System.in);

//  출력하고자 하는 구구단의 단수를 입력
  public int inputDansu() {
    System.out.print("출력할 구구단의 단수를 입력해 주세요 : ");
    int dan = sc.nextInt();
    return dan;
  }

//  입력받은 단수의 구구단을 출력
  public void outputGugudan(int dan) {
    System.out.println("----- " + dan + " -----");

    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " * " + i + " = " + dan * i);
    }
  }
}
